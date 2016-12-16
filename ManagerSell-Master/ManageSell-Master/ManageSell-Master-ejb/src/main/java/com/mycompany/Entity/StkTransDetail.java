/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "StkTransDetail")
public class StkTransDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TransID;

    @Column(name = "InvtID")
    private String InvtID;
    @Column(name = "Qty")
    private int Qty;
    @Column(name = "Amount")
    private int Amount;

    public int getTransID() {
        return TransID;
    }

    public void setTransID(int TransID) {
        this.TransID = TransID;
    }

    public String getInvtID() {
        return InvtID;
    }

    public void setInvtID(String InvtID) {
        this.InvtID = InvtID;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
}
