/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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

public class Purchaseorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderNo")
    private Integer orderNo;
    @Column(name = "OrderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Column(name = "OrderType")
    private String orderType;
    @Column(name = "OverdueDate")
    @Temporal(TemporalType.DATE)
    private Date overdueDate;
    @Column(name = "DiscAmt")
    private Long discAmt;
    @Column(name = "PromAmt")
    private Long proAmt;
    @Column(name = "ComAmt")
    private Long comAmt;

    @Column(name = "TaxAmt")
    private Long taxAmt;
    @Column(name = "Amount")
    private Long amount;

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

    public Long getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(Long discAmt) {
        this.discAmt = discAmt;
    }

    public Long getProAmt() {
        return proAmt;
    }

    public void setProAmt(Long proAmt) {
        this.proAmt = proAmt;
    }

    public Long getComAmt() {
        return comAmt;
    }

    public void setComAmt(Long comAmt) {
        this.comAmt = comAmt;
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
        return "model.Purchaseorder[ orderNo=" + orderNo + " ]";
    }

}
