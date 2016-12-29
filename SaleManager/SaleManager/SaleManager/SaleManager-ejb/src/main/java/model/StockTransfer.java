/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
 * @author abc
 */
@Entity
@Table(name = "stocktransfer")
@NamedQueries({
    @NamedQuery(name = "StockTransfer.findByID", query = "SELECT s FROM StockTransfer s WHERE s.transID = :transID")
})
public class StockTransfer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TransID")
    private String transID;
    @Column(name = "TransDate")
    @Temporal(TemporalType.DATE)
    private Date transDate;
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FromStockID")
    private String fromStockID;
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ToStockID")
    private String toStockID;
    @Column(name = "TotalAmt")
    private Long totalAmt;
    @Size(max = 200)
    @Column(name = "Description")
    private String description;

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getFromStockID() {
        return fromStockID;
    }

    public void setFromStockID(String fromStockID) {
        this.fromStockID = fromStockID;
    }

    public String getToStockID() {
        return toStockID;
    }

    public void setToStockID(String toStockID) {
        this.toStockID = toStockID;
    }

    public Long getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Long totalAmt) {
        this.totalAmt = totalAmt;
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
        hash += (transID != null ? transID.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "model.StockTransfer[ transID=" + transID + " ]";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof StockTransfer)) {
            return false;
        }
        StockTransfer other = (StockTransfer) object;
        if ((this.transID == null && other.transID != null) || (this.transID != null && !this.transID.equals(other.transID))) {
            return false;
        }
        return true;
    }
    
}
