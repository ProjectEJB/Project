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
@Table(name = "stktransdetail")

public class Stktransdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransID")
    private Integer transID;
    @Size(max = 50)
    @Column(name = "InvtID")
    private String invtID;
    @Column(name = "Qty")
    private Integer qty;
    @Size(max = 50)
    @Column(name = "Amount")
    private String amount;

    public Stktransdetail() {
    }

    public Stktransdetail(Integer transID) {
        this.transID = transID;
    }

    public Integer getTransID() {
        return transID;
    }

    public void setTransID(Integer transID) {
        this.transID = transID;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transID != null ? transID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stktransdetail)) {
            return false;
        }
        Stktransdetail other = (Stktransdetail) object;
        if ((this.transID == null && other.transID != null) || (this.transID != null && !this.transID.equals(other.transID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Stktransdetail[ transID=" + transID + " ]";
    }

}
