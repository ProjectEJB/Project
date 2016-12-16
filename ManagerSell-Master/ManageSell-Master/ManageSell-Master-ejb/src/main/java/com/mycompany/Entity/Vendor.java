/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "Vendor")
public class Vendor implements Serializable {

    @Id
    @Column(name = "VendorID")
    private String VendorID;
    @Column(name = "VendorName")
    private String VendorName;
    @Column(name = "Address")
    private String Address;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "Fax")
    private String Fax;
    @Column(name = "DueAmt")
    private int DueAmt;
    @Column(name = "Amount")
    private int Amount;
    @Column(name = "OverdueAmt")
    private int OverdueAmt;

    public String getVendorID() {
        return VendorID;
    }

    public void setVendorID(String VendorID) {
        this.VendorID = VendorID;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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

    public int getDueAmt() {
        return DueAmt;
    }

    public void setDueAmt(int DueAmt) {
        this.DueAmt = DueAmt;
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
    @Column(name = "Status")
    private String Status;
    @Column(name = "Description")
    private String Description;

}
