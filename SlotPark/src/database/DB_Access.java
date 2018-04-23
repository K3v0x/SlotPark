/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import beans.Icon;
import beans.Spieler;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class DB_Access {

    private DB_ConnectionPool connections = DB_ConnectionPool.getInstance();
    private DB_StatementPool pool = DB_StatementPool.getInstance();
    // create DB_Access as Singleton
    public static DB_Access theInstance = null;

    public static DB_Access getInstance() {
        if (theInstance == null) {
            theInstance = new DB_Access();
        }
        return theInstance;
    }

    private DB_Access() {

    }

    public List<Spieler> getAllUsers() throws Exception {
        Connection conn = connections.getConnection();
        String sqlString = "SELECT name, passwort, geld, icon\n"
                + "FROM spieler;";
        PreparedStatement pStat = pool.getPreparedStatement(conn, DB_Stmt_Type.GetIconOfUser);
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sqlString);
        List<Spieler> spieler = new LinkedList<>();
        while (rs.next()) {
            String name = rs.getString(1);
            String passwort = rs.getString(2);
            double geld = rs.getDouble(3);
            String iconS = rs.getString(4);
            pStat.setString(1, iconS);
            ResultSet rsIcon = pStat.executeQuery();
            String pfad = null;
            while(rsIcon.next())
            {
                pfad = rsIcon.getString(1);
            }
            Icon icon = new Icon(iconS, pfad);
            spieler.add(new Spieler(name, passwort, geld, icon));
        }
        connections.releaseConnection(conn);
        return spieler;
    }

    public boolean addUser(Spieler s) throws Exception {
        Connection conn = connections.getConnection();
        PreparedStatement pStat = pool.getPreparedStatement(conn, DB_Stmt_Type.AddNewUser);
        pStat.setString(1, s.getName());
        pStat.setString(2, s.getPassword());
        pStat.setDouble(3, s.getGeld());
        int anz = pStat.executeUpdate();
        connections.releaseConnection(conn);
        if (anz == 1) {
            return true;
        }
        return false;
    }

    public List<Icon> getIcons() throws Exception {
        Connection conn = connections.getConnection();
        String sqlString = "SELECT name, pfad\n"
                + "FROM icons";
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sqlString);
        List<Icon> icons = new LinkedList<>();
        while(rs.next())
        {
         String name = rs.getString(1);
         String pfad = rs.getString(2);
         pfad = System.getProperty("user.dir") + File.separator + pfad;
         icons.add(new Icon(name, pfad));
        }
        connections.releaseConnection(conn);
        return icons;
    }
}
