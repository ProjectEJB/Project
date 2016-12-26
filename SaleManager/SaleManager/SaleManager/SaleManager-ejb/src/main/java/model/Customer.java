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
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CustID")
    private String custID;
    @Size(max = 50)
    @Column(name = "CustName")
    private String custName;
    @Size(max = 50)
    @Column(name = "Address")
    private String address;

    @Size(max = 50)
    @Column(name = "Phone")
    private String phone;

    @Size(max = 50)
    @Column(name = "Fax")
    private String fax;

    @Size(max = 50)
    @Column(name = "Email")
    private String email;
    @Column(name = "Overdue")
    private Integer overdue;
    @Column(name = "Amount")
    private Long amount;
    @Column(name = "OverdueAmt")
    private Long overdueAmt;
    @Column(name = "DueAmt")
    private Long dueAmt;
    @Size(max = 50)
    @Column(name = "Status")
    private String status;
    @Size(max = 50)
    @Column(name = "Description")
    private String description;

    public Customer() {
    }

    public Customer(String custID) {
        this.custID = custID;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOverdue() {
        return overdue;
    }

    public void setOverdue(Integer overdue) {
        this.overdue = overdue;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getOverdueAmt() {
        return overdueAmt;
    }

    public void setOverdueAmt(Long overdueAmt) {
        this.overdueAmt = overdueAmt;
    }

    public Long getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(Long dueAmt) {
        this.dueAmt = dueAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        hash += (custID != null ? custID.hashCode() : 0);
        return hash;
    }

}
