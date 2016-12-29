/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
public class Bill {

    private Integer orderNo;

    private BigInteger amount;

    private BigInteger comAmt;

    private BigInteger discAmt;

    private Date orderDate;

    private String orderType;
    private Date overdueDate;

    private BigInteger promAmt;

    private BigInteger taxAmt;

    private String invtID;
    private String qty;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public BigInteger getComAmt() {
        return comAmt;
    }

    public void setComAmt(BigInteger comAmt) {
        this.comAmt = comAmt;
    }

    public BigInteger getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigInteger discAmt) {
        this.discAmt = discAmt;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Date getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Date overdueDate) {
        this.overdueDate = overdueDate;
    }

    public BigInteger getPromAmt() {
        return promAmt;
    }

    public void setPromAmt(BigInteger promAmt) {
        this.promAmt = promAmt;
    }

    public BigInteger getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigInteger taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getInvtID() {
        return invtID;
    }

    public void setInvtID(String invtID) {
        this.invtID = invtID;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public Integer getQtyProm() {
        return qtyProm;
    }

    public void setQtyProm(Integer qtyProm) {
        this.qtyProm = qtyProm;
    }

    public Integer getQtyPromAmt() {
        return qtyPromAmt;
    }

    public void setQtyPromAmt(Integer qtyPromAmt) {
        this.qtyPromAmt = qtyPromAmt;
    }

    public Long getAmtProm() {
        return amtProm;
    }

    public void setAmtProm(Long amtProm) {
        this.amtProm = amtProm;
    }
    private Long purchasePrice;
    private String stockID;
    private Integer qtyProm;
    private Integer qtyPromAmt;
    private Long amtProm;

}
