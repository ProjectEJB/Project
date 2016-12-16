/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Entity;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "StockTransfer")
public class StockTransfer implements Serializable {

    @Id
    @Column(name = "TransID")
    private String TransID;
    
    @Column(name = "TransDate")
    private Date TransDate;
    
    @Column(name = "FromStockID")
    private String FromStockID;
    
    @Column(name = "ToStockID")
    private String ToStockID;
    
    @Column(name = "TotalAmt")
    private int TotalAmt;

    public String getTransID() {
        return TransID;
    }

    public void setTransID(String TransID) {
        this.TransID = TransID;
    }

    public Date getTransDate() {
        return TransDate;
    }

    public void setTransDate(Date TransDate) {
        this.TransDate = TransDate;
    }

    public String getFromStockID() {
        return FromStockID;
    }

    public void setFromStockID(String FromStockID) {
        this.FromStockID = FromStockID;
    }

    public String getToStockID() {
        return ToStockID;
    }

    public void setToStockID(String ToStockID) {
        this.ToStockID = ToStockID;
    }

    public int getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(int TotalAmt) {
        this.TotalAmt = TotalAmt;
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
