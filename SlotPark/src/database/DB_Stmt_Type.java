/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author micha
 */
public enum DB_Stmt_Type {
    AddNewUser("INSERT INTO public.spieler(\n"
            + "	name, passwort, geld)\n"
            + "	VALUES (?, ?, ?);");

    private DB_Stmt_Type(String pStatString) {
        this.pStatString = pStatString;
    }

    private String pStatString;

    public String getpStatString() {
        return pStatString;
    }

    public void setpStatString(String pStatString) {
        this.pStatString = pStatString;
    }

}
