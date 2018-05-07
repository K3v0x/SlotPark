/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Kevin
 */
public enum Status {
    ENTERED("Entered"),
    CHECKED("Checked"),
    RAISED("Raised"),
    FOLDED("Folded"),
    OUT("Out");

    String status;

    private Status(String status) {
        this.status = status;
    }

}
