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
@Table(name = "purchaseOrder")
public class PurchaseOrder implements Serializable {

    @Id
    @Column(name = "OrderNo")
    private String OrderNo;
    @Column(name = "OrderDate")
    private Date OrderDate;
    @Column(name = "OrderType")
    private String OrderType;
    @Column(name = "OverdueDate")
    private Date OverdueDate;
    @Column(name = "DiscAmt")
    private double DiscAmt;
    @Column(name = "PromAmt")
    private double PromAmt;
    @Column(name = "ComAmt")
    private double ComAmt;
    @Column(name = "TaxAmt")
    private double TaxAmt;

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

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public Date getOverdueDate() {
        return OverdueDate;
    }

    public void setOverdueDate(Date OverdueDate) {
        this.OverdueDate = OverdueDate;
    }

    public double getDiscAmt() {
        return DiscAmt;
    }

    public void setDiscAmt(double DiscAmt) {
        this.DiscAmt = DiscAmt;
    }

    public double getPromAmt() {
        return PromAmt;
    }

    public void setPromAmt(double PromAmt) {
        this.PromAmt = PromAmt;
    }

    public double getComAmt() {
        return ComAmt;
    }

    public void setComAmt(double ComAmt) {
        this.ComAmt = ComAmt;
    }

    public double getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(double TaxAmt) {
        this.TaxAmt = TaxAmt;
    }

    public double getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(double TotalAmt) {
        this.TotalAmt = TotalAmt;
    }
    @Column(name = "TotalAmt")
    private double TotalAmt;

}
