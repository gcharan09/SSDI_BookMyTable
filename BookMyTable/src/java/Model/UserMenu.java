/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SRINEAL
 */
@Entity
public class UserMenu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ID;
    
    String randNumber, menu;
    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRandNumber() {
        return randNumber;
    }

    public void setRandNumber(String randNumber) {
        this.randNumber = randNumber;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
    
    
}
