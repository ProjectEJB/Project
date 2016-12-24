/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANHVT
 */
@Entity
@Table(name = "purchaseorddetail")
public class Purchaseorddetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderNo")
    private Integer orderNo;
    @Size(max = 50)
    @Column(name = "InvtID")
    private String invtID;
    @Size(max = 50)
    @Column(name = "Qty")
    private String qty;
    @Column(name = "PurchasePrice")
    private Long purchasePrice;
    @Size(max = 50)
    @Column(name = "StockID")
    private String stockID;
    @Column(name = "QtyProm")
    private Integer qtyProm;
    @Column(name = "QtyPromAmt")
    private Integer qtyPromAmt;
    @Column(name = "AmtProm")
    private Long amtProm;
    @Column(name = "TaxAmt")
    private Long taxAmt;
    @Column(name = "Amount")
    private Long amount;

    public Purchaseorddetail() {
    }

    public Purchaseorddetail(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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

    public Long getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Long taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNo != null ? orderNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchaseorddetail)) {
            return false;
        }
        Purchaseorddetail other = (Purchaseorddetail) object;
        if ((this.orderNo == null && other.orderNo != null) || (this.orderNo != null && !this.orderNo.equals(other.orderNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Purchaseorddetail[ orderNo=" + orderNo + " ]";
    }

}
