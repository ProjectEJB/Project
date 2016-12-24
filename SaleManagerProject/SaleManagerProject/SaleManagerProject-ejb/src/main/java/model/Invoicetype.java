/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ANHVT
 */
@Entity
@Table(name = "invoicetype")
public class Invoicetype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "InvoiceType")
    private String invoiceType;
    @Size(max = 50)
    @Column(name = "TypeName")
    private String typeName;
    @OneToMany(mappedBy = "invoiceType")
    private Collection<Salesorder> salesorderCollection;

    public Invoicetype() {
    }

    public Invoicetype(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @XmlTransient
    public Collection<Salesorder> getSalesorderCollection() {
        return salesorderCollection;
    }

    public void setSalesorderCollection(Collection<Salesorder> salesorderCollection) {
        this.salesorderCollection = salesorderCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceType != null ? invoiceType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoicetype)) {
            return false;
        }
        Invoicetype other = (Invoicetype) object;
        if ((this.invoiceType == null && other.invoiceType != null) || (this.invoiceType != null && !this.invoiceType.equals(other.invoiceType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Invoicetype[ invoiceType=" + invoiceType + " ]";
    }
    
}
