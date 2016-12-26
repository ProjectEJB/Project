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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANHVT
 */
@Entity
@Table(name = "slsorderdetail")
public class Slsorderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "OrderNo")
    private String orderNo;
    @Size(max = 50)
    @Column(name = "InvtID")
    private String invtID;
    @Column(name = "Qty")
    private Integer qty;
    @Column(name = "SalesPrice")
    private Long salesPrice;
    @Column(name = "Discount")
    private Long discount;
    @Column(name = "TaxAmt")
    private Long taxAmt;
    @Column(name = "Amount")
    private Long amount;

    public Slsorderdetail() {
    }

    public Slsorderdetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getInvtID() {
        return invtID;
    }

    public void setInvtID(String invtID) {
        this.invtID = invtID;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Long getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Slsorderdetail)) {
            return false;
        }
        Slsorderdetail other = (Slsorderdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Slsorderdetail[ id=" + id + " ]";
    }

}
