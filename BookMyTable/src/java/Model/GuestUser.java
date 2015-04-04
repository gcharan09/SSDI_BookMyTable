/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author SRINEAL
 */
public class GuestUser {
    private String name, email, date, time, randNumber;
    private int atttendees;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRandNumber() {
        return randNumber;
    }

    public void setRandNumber(String randNumber) {
        this.randNumber = randNumber;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAtttendees() {
        return atttendees;
    }

    public void setAtttendees(int atttendees) {
        this.atttendees = atttendees;
    }

    
}
