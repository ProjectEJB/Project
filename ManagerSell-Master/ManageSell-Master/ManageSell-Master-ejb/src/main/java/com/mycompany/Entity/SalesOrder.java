/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "SalesOrder")
public class SalesOrder implements Serializable {

    @Id
    @Column(name = "OrderNo")
    private String OrderNo;
    @Column(name = "OrderDate")
    private Date OrderDate;
    @Column(name = "InvoiceType")
    private String InvoiceType;
    @Column(name = "CustID")
    private String CustID;

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getInvoiceType() {
        return InvoiceType;
    }

    public void setInvoiceType(String InvoiceType) {
        this.InvoiceType = InvoiceType;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    public Date getOverdueDate() {
        return OverdueDate;
    }

    public void setOverdueDate(Date OverdueDate) {
        this.OverdueDate = OverdueDate;
    }

    public int getOrderDisc() {
        return OrderDisc;
    }

    public void setOrderDisc(int OrderDisc) {
        this.OrderDisc = OrderDisc;
    }

    public int getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(int TaxAmt) {
        this.TaxAmt = TaxAmt;
    }

    public int getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(int TotalAmt) {
        this.TotalAmt = TotalAmt;
    }

    public int getPayment() {
        return Payment;
    }

    public void setPayment(int Payment) {
        this.Payment = Payment;
    }

    public int getDebt() {
        return Debt;
    }

    public void setDebt(int Debt) {
        this.Debt = Debt;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    @Column(name = "OverdueDate")
    private Date OverdueDate;
    @Column(name = "OrderDisc")
    private int OrderDisc;
    @Column(name = "TaxAmt")
    private int TaxAmt;
    @Column(name = "TotalAmt")
    private int TotalAmt;
    @Column(name = "Payment")
    private int Payment;
    @Column(name = "Debt")
    private int Debt;
    @Column(name = "Debt")
    private String Description;
}
