/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Administrator
 */
@Entity
public class SlsOrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "OrderNo")
    private String OrderNo;
    @Column(name = "InvtID")
    private String InvtID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
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

    public int getSalesPrice() {
        return SalesPrice;
    }

    public void setSalesPrice(int SalesPrice) {
        this.SalesPrice = SalesPrice;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    public int getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(int TaxAmt) {
        this.TaxAmt = TaxAmt;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    @Column(name = "Qty")
    private int Qty;
    @Column(name = "SalesPrice")
    private int SalesPrice;
    @Column(name = "Discount")
    private int Discount;
    @Column(name = "TaxAmt")
    private int TaxAmt;
    @Column(name = "Amount")
    private int Amount;
}
