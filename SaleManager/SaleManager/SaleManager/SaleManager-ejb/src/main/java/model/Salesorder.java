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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Sangvtse61398
 */
@Entity
@Table(name = "salesorder")
@NamedQueries({
    @NamedQuery(name = "Salesorder.findAll", query = "SELECT s FROM Salesorder s"),
    @NamedQuery(name = "Salesorder.findByOrderNo", query = "SELECT s FROM Salesorder s WHERE s.orderNo = :orderNo"),
    @NamedQuery(name = "Salesorder.findByCustID", query = "SELECT s FROM Salesorder s WHERE s.custID = :custID"),
    @NamedQuery(name = "Salesorder.findByDebt", query = "SELECT s FROM Salesorder s WHERE s.debt = :debt"),
    @NamedQuery(name = "Salesorder.findByDescription", query = "SELECT s FROM Salesorder s WHERE s.description = :description"),
    @NamedQuery(name = "Salesorder.findByOrderDate", query = "SELECT s FROM Salesorder s WHERE s.orderDate = :orderDate"),
    @NamedQuery(name = "Salesorder.findByOrderDisc", query = "SELECT s FROM Salesorder s WHERE s.orderDisc = :orderDisc"),
    @NamedQuery(name = "Salesorder.findByOverdueDate", query = "SELECT s FROM Salesorder s WHERE s.overdueDate = :overdueDate"),
    @NamedQuery(name = "Salesorder.findByPayment", query = "SELECT s FROM Salesorder s WHERE s.payment = :payment"),
    @NamedQuery(name = "Salesorder.findByTaxAmt", query = "SELECT s FROM Salesorder s WHERE s.taxAmt = :taxAmt"),
    @NamedQuery(name = "Salesorder.findByTotalAmt", query = "SELECT s FROM Salesorder s WHERE s.totalAmt = :totalAmt")})
public class Salesorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "OrderNo")
    private String orderNo;

    @Column(name = "OrderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @Size(max = 50)
    @Column(name = "CustID")
    private String custID;
    @Column(name = "OverdueDate")
    @Temporal(TemporalType.DATE)
    private Date overdueDate;
    @Column(name = "OrderDisc")
    private Long orderDisc;
    @Column(name = "TaxAmt")
    private Long taxAmt;
    @Column(name = "TotalAmt")
    private Long totalAmt;
    @Column(name = "Payment")
    private Long payment;
    @Column(name = "Debt")
    private Long debt;
    @Size(max = 50)
    @Column(name = "Description")
    private String description;
    @JoinColumn(name = "InvoiceType", referencedColumnName = "InvoiceType")
    @ManyToOne(optional = false)
    private Invoicetype invoiceType;

    public Salesorder() {
    }

    public Salesorder(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public Date getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Date overdueDate) {
        this.overdueDate = overdueDate;
    }

    public Long getOrderDisc() {
        return orderDisc;
    }

    public void setOrderDisc(Long orderDisc) {
        this.orderDisc = orderDisc;
    }

    public Long getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Long taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Long getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Long totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Long getDebt() {
        return debt;
    }

    public void setDebt(Long debt) {
        this.debt = debt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Invoicetype getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Invoicetype invoiceType) {
        this.invoiceType = invoiceType;
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
        if (!(object instanceof Salesorder)) {
            return false;
        }
        Salesorder other = (Salesorder) object;
        if ((this.orderNo == null && other.orderNo != null) || (this.orderNo != null && !this.orderNo.equals(other.orderNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Salesorder[ orderNo=" + orderNo + " ]";
    }

}
