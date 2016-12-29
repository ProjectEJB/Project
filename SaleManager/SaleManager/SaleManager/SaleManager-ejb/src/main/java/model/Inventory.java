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
@Table(name = "inventory")
@NamedQueries({
    @NamedQuery(name = "Inventory.findAll", query = "SELECT i FROM Inventory i"),
    @NamedQuery(name = "Inventory.findByInvtID", query = "SELECT i FROM Inventory i WHERE i.invtID = :invtID"),
    @NamedQuery(name = "Inventory.findByClassName", query = "SELECT i FROM Inventory i WHERE i.className = :className"),
    @NamedQuery(name = "Inventory.findByDescription", query = "SELECT i FROM Inventory i WHERE i.description = :description"),
    @NamedQuery(name = "Inventory.findByInvtName", query = "SELECT i FROM Inventory i WHERE i.invtName = :invtName"),
    @NamedQuery(name = "Inventory.findByQtyStock", query = "SELECT i FROM Inventory i WHERE i.qtyStock = :qtyStock"),
    @NamedQuery(name = "Inventory.findBySalesPriceL", query = "SELECT i FROM Inventory i WHERE i.salesPriceL = :salesPriceL"),
    @NamedQuery(name = "Inventory.findBySalesPriceT", query = "SELECT i FROM Inventory i WHERE i.salesPriceT = :salesPriceT"),
    @NamedQuery(name = "Inventory.findBySlsTax", query = "SELECT i FROM Inventory i WHERE i.slsTax = :slsTax"),
    @NamedQuery(name = "Inventory.findByStatus", query = "SELECT i FROM Inventory i WHERE i.status = :status"),
    @NamedQuery(name = "Inventory.findByUnitIDL", query = "SELECT i FROM Inventory i WHERE i.unitIDL = :unitIDL"),
    @NamedQuery(name = "Inventory.findByUnitIDT", query = "SELECT i FROM Inventory i WHERE i.unitIDT = :unitIDT"),
    @NamedQuery(name = "Inventory.findByUnitRate", query = "SELECT i FROM Inventory i WHERE i.unitRate = :unitRate")})

public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "InvtID")
    private String invtID;
    @Size(max = 50)
    @Column(name = "InvtName")
    private String invtName;
    @Size(max = 50)
    @Column(name = "ClassName")
    private String className;
    @Column(name = "UnitID_T")
    private Integer unitIDT;
    @Column(name = "UnitID_L")
    private Integer unitIDL;
    @Column(name = "UnitRate")
    private Integer unitRate;
    @Column(name = "SalesPriceT")
    private Long salesPriceT;
    @Column(name = "SalesPriceL")
    private Long salesPriceL;
    @Column(name = "QtyStock")
    private Integer qtyStock;
    @Column(name = "SlsTax")
    private Long slsTax;
    @Size(max = 50)
    @Column(name = "Status")
    private String status;
    @Size(max = 50)
    @Column(name = "Description")
    private String description;

    public Inventory() {
    }

    public Inventory(String invtID) {
        this.invtID = invtID;
    }

    public String getInvtID() {
        return invtID;
    }

    public void setInvtID(String invtID) {
        this.invtID = invtID;
    }

    public String getInvtName() {
        return invtName;
    }

    public void setInvtName(String invtName) {
        this.invtName = invtName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getUnitIDT() {
        return unitIDT;
    }

    public void setUnitIDT(Integer unitIDT) {
        this.unitIDT = unitIDT;
    }

    public Integer getUnitIDL() {
        return unitIDL;
    }

    public void setUnitIDL(Integer unitIDL) {
        this.unitIDL = unitIDL;
    }

    public Integer getUnitRate() {
        return unitRate;
    }

    public void setUnitRate(Integer unitRate) {
        this.unitRate = unitRate;
    }

    public Long getSalesPriceT() {
        return salesPriceT;
    }

    public void setSalesPriceT(Long salesPriceT) {
        this.salesPriceT = salesPriceT;
    }

    public Long getSalesPriceL() {
        return salesPriceL;
    }

    public void setSalesPriceL(Long salesPriceL) {
        this.salesPriceL = salesPriceL;
    }

    public Integer getQtyStock() {
        return qtyStock;
    }

    public void setQtyStock(Integer qtyStock) {
        this.qtyStock = qtyStock;
    }

    public Long getSlsTax() {
        return slsTax;
    }

    public void setSlsTax(Long slsTax) {
        this.slsTax = slsTax;
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
        hash += (invtID != null ? invtID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventory)) {
            return false;
        }
        Inventory other = (Inventory) object;
        if ((this.invtID == null && other.invtID != null) || (this.invtID != null && !this.invtID.equals(other.invtID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Inventory[ invtID=" + invtID + " ]";
    }
    
}
