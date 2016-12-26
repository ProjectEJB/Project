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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sangvtse61398
 */
@Entity
@Table(name = "payment")
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findByPaymentID", query = "SELECT p FROM Payment p WHERE p.paymentID = :paymentID"),
    @NamedQuery(name = "Payment.findByCustID", query = "SELECT p FROM Payment p WHERE p.custID = :custID"),
    @NamedQuery(name = "Payment.findByDescription", query = "SELECT p FROM Payment p WHERE p.description = :description"),
    @NamedQuery(name = "Payment.findByPaymentAmt", query = "SELECT p FROM Payment p WHERE p.paymentAmt = :paymentAmt"),
    @NamedQuery(name = "Payment.findByPaymentDate", query = "SELECT p FROM Payment p WHERE p.paymentDate = :paymentDate"),
    @NamedQuery(name = "Payment.findByPaymentNo", query = "SELECT p FROM Payment p WHERE p.paymentNo = :paymentNo"),
    @NamedQuery(name = "Payment.findBySalesPersonID", query = "SELECT p FROM Payment p WHERE p.salesPersonID = :salesPersonID")})

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PaymentID")
    private Integer paymentID;
    @Size(max = 50)
    @Column(name = "PaymentNo")
    private String paymentNo;
    @Column(name = "PaymentDate")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @Column(name = "PaymentAmt")
    private Long paymentAmt;
    @Size(max = 50)
    @Column(name = "CustID")
    private String custID;
    @Size(max = 50)
    @Column(name = "SalesPersonID")
    private String salesPersonID;
    @Size(max = 50)
    @Column(name = "Description")
    private String description;

    public Payment() {
    }

    public Payment(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public Integer getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Integer paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Long getPaymentAmt() {
        return paymentAmt;
    }

    public void setPaymentAmt(Long paymentAmt) {
        this.paymentAmt = paymentAmt;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(String salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentID != null ? paymentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentID == null && other.paymentID != null) || (this.paymentID != null && !this.paymentID.equals(other.paymentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Payment[ paymentID=" + paymentID + " ]";
    }

}
