/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANHVT
 */
@Entity
@Table(name = "purchaseorder")

@NamedQueries({
    @NamedQuery(name = "Purchaseorder.findAll", query = "SELECT p FROM Purchaseorder p"),
    @NamedQuery(name = "Purchaseorder.findByOrderNo", query = "SELECT p FROM Purchaseorder p WHERE p.orderNo = :orderNo"),
    @NamedQuery(name = "Purchaseorder.findByAmount", query = "SELECT p FROM Purchaseorder p WHERE p.amount = :amount"),
    @NamedQuery(name = "Purchaseorder.findByComAmt", query = "SELECT p FROM Purchaseorder p WHERE p.comAmt = :comAmt"),
    @NamedQuery(name = "Purchaseorder.findByDiscAmt", query = "SELECT p FROM Purchaseorder p WHERE p.discAmt = :discAmt"),
    @NamedQuery(name = "Purchaseorder.findByOrderDate", query = "SELECT p FROM Purchaseorder p WHERE p.orderDate = :orderDate"),
    @NamedQuery(name = "Purchaseorder.findByOrderType", query = "SELECT p FROM Purchaseorder p WHERE p.orderType = :orderType"),
    @NamedQuery(name = "Purchaseorder.findByOverdueDate", query = "SELECT p FROM Purchaseorder p WHERE p.overdueDate = :overdueDate"),
    @NamedQuery(name = "Purchaseorder.findByPromAmt", query = "SELECT p FROM Purchaseorder p WHERE p.promAmt = :promAmt"),
    @NamedQuery(name = "Purchaseorder.findByTaxAmt", query = "SELECT p FROM Purchaseorder p WHERE p.taxAmt = :taxAmt")})
public class Purchaseorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderNo")
    private Integer orderNo;
    @Column(name = "Amount")
    private BigInteger amount;
    @Column(name = "ComAmt")
    private BigInteger comAmt;
    @Column(name = "DiscAmt")
    private BigInteger discAmt;
    @Column(name = "OrderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Size(max = 255)
    @Column(name = "OrderType")
    private String orderType;
    @Column(name = "OverdueDate")
    @Temporal(TemporalType.DATE)
    private Date overdueDate;
    @Column(name = "PromAmt")
    private BigInteger promAmt;
    @Column(name = "TaxAmt")
    private BigInteger taxAmt;

    public Purchaseorder() {
    }

    public Purchaseorder(Integer orderNo) {
        this.orderNo = orderNo;
    }

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderNo != null ? orderNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchaseorder)) {
            return false;
        }
        Purchaseorder other = (Purchaseorder) object;
        if ((this.orderNo == null && other.orderNo != null) || (this.orderNo != null && !this.orderNo.equals(other.orderNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Purchaseorder[ orderNo=" + orderNo + " ]";
    }
    
}
