/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

    @Id
    @Column(name = "InvtID")
    private String InvtID;

    @Column(name = "InvtName")
    private String InvtName;
    @Column(name = "ClassName")
    private String ClassName;
    @Column(name = "UnitID_T")
    private int UnitID_T;
    @Column(name = "UnitID_L")
    private int UnitID_L;
    @Column(name = "UnitRate")
    private int UnitRate;
    @Column(name = "SalesPriceT")
    private int SalesPriceT;
    @Column(name = "SalesPriceL")
    private int SalesPriceL;
    @Column(name = "QtyStock")
    private int QtyStock;
    @Column(name = "SlsTax")
    private int SlsTax;
    @Column(name = "Status")
    private String Status;

    public String getInvtID() {
        return InvtID;
    }

    public void setInvtID(String InvtID) {
        this.InvtID = InvtID;
    }

    public String getInvtName() {
        return InvtName;
    }

    public void setInvtName(String InvtName) {
        this.InvtName = InvtName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public int getUnitID_T() {
        return UnitID_T;
    }

    public void setUnitID_T(int UnitID_T) {
        this.UnitID_T = UnitID_T;
    }

    public int getUnitID_L() {
        return UnitID_L;
    }

    public void setUnitID_L(int UnitID_L) {
        this.UnitID_L = UnitID_L;
    }

    public int getUnitRate() {
        return UnitRate;
    }

    public void setUnitRate(int UnitRate) {
        this.UnitRate = UnitRate;
    }

    public int getSalesPriceT() {
        return SalesPriceT;
    }

    public void setSalesPriceT(int SalesPriceT) {
        this.SalesPriceT = SalesPriceT;
    }

    public int getSalesPriceL() {
        return SalesPriceL;
    }

    public void setSalesPriceL(int SalesPriceL) {
        this.SalesPriceL = SalesPriceL;
    }

    public int getQtyStock() {
        return QtyStock;
    }

    public void setQtyStock(int QtyStock) {
        this.QtyStock = QtyStock;
    }

    public int getSlsTax() {
        return SlsTax;
    }

    public void setSlsTax(int SlsTax) {
        this.SlsTax = SlsTax;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    @Column(name = "Description")
    private String Description;

}
