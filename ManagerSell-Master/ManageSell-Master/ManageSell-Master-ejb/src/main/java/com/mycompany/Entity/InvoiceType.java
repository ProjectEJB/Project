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
@Table(name = "invoiceType")
public class InvoiceType implements Serializable {

    @Id
    @Column(name = "InvoiceType")
    private String InvoiceType;
    @Id
    @Column(name = "TypeName")
    private String TypeName;
}
