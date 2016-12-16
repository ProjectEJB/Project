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
@Table(name = "payment")
public class Payment implements Serializable {

    @Id
    @Column(name = "PaymentID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PaymentID;

    @Column(name = "PaymentNo")
    private String PaymentNo;

    @Column(name = "PaymentDate")
    private String PaymentDate;

    @Column(name = "PaymentAmt")
    private String PaymentAmt;

    @Column(name = "CustID")
    private String CustID;

    @Column(name = "SalesPersonID")
    private String SalesPersonID;

    public int getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(int PaymentID) {
        this.PaymentID = PaymentID;
    }

    public String getPaymentNo() {
        return PaymentNo;
    }

    public void setPaymentNo(String PaymentNo) {
        this.PaymentNo = PaymentNo;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public String getPaymentAmt() {
        return PaymentAmt;
    }

    public void setPaymentAmt(String PaymentAmt) {
        this.PaymentAmt = PaymentAmt;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    public String getSalesPersonID() {
        return SalesPersonID;
    }

    public void setSalesPersonID(String SalesPersonID) {
        this.SalesPersonID = SalesPersonID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Column(name = "Description")
    private String Description;
}
