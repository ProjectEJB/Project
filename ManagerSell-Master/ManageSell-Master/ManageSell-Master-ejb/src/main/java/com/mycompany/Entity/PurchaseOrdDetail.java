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
@Table(name = "purchaseOrdDetail")
public class PurchaseOrdDetail implements Serializable {

    @Id
    @Column(name = "OrderNo")
    private String OrderNo;

    @Column(name = "InvtID")
    private String InvtID;

    @Column(name = "Qty")
    private int Qty;

    @Column(name = "PurchasePrice")
    private double PurchasePrice;

    @Column(name = "StockID")
    private String StockID;

    @Column(name = "QtyProm")
    private int QtyProm;

    @Column(name = "QtyPromAmt")
    private int QtyPromAmt;

    @Column(name = "AmtProm")
    private double AmtProm;

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

    public double getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(double PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public String getStockID() {
        return StockID;
    }

    public void setStockID(String StockID) {
        this.StockID = StockID;
    }

    public int getQtyProm() {
        return QtyProm;
    }

    public void setQtyProm(int QtyProm) {
        this.QtyProm = QtyProm;
    }

    public int getQtyPromAmt() {
        return QtyPromAmt;
    }

    public void setQtyPromAmt(int QtyPromAmt) {
        this.QtyPromAmt = QtyPromAmt;
    }

    public double getAmtProm() {
        return AmtProm;
    }

    public void setAmtProm(double AmtProm) {
        this.AmtProm = AmtProm;
    }

    public double getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(double TaxAmt) {
        this.TaxAmt = TaxAmt;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    @Column(name = "TaxAmt")
    private double TaxAmt;

    @Column(name = "Amount")
    private double Amount;

}
