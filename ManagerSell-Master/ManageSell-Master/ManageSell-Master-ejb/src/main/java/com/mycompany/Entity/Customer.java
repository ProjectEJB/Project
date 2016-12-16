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
@Table(name = "customer")
public class Customer implements Serializable {

   
    @Id
    @Column(name = "CustID")
    private String CustID;
    @Column(name = "CustName")
    private String CustName;
    @Column(name = "Address")
    private String Address;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "Fax")
    private String Fax;
    @Column(name = "Email")
    private String Email;

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getOverdue() {
        return Overdue;
    }

    public void setOverdue(int Overdue) {
        this.Overdue = Overdue;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getOverdueAmt() {
        return OverdueAmt;
    }

    public void setOverdueAmt(int OverdueAmt) {
        this.OverdueAmt = OverdueAmt;
    }

    public int getDueAmt() {
        return DueAmt;
    }

    public void setDueAmt(int DueAmt) {
        this.DueAmt = DueAmt;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    @Column(name = "Overdue")
    private int Overdue;
    @Column(name = "Amount")
    private int Amount;
    @Column(name = "OverdueAmt")
    private int OverdueAmt;
    @Column(name = "DueAmt")
    private int DueAmt;
    @Column(name = "Status")
    private String Status;
    @Column(name = "Description")
    private String Description;
}
