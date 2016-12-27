/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import model.Invoicetype;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author Sangvtse61398
 */
@Stateless
public class SaleSession implements SaleSessionRemote {

    static String TRAHANG = "NT";
    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public void addSaleorder(Salesorder b) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.persist(b);
    }

    @Override
    public List FindAll() {
        entityManager = entityManagerFactory.createEntityManager();
        try {
            List<Salesorder> result = entityManager.createNamedQuery("Salesorder.findAll",
                    Salesorder.class).getResultList();
            return result;
        } catch (Exception e) {
            System.out.println("ERROR FindAll : " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Slsorderdetail> viewSalesOrderDetail(String OrderNo) {
        entityManager = entityManagerFactory.createEntityManager();
        Query q=null;
        try {
//            q= entityManager.createNamedQuery("Slsorderdetail.findByOrderNo",
//                    Slsorderdetail.class);
//            q.setParameter("orderNo", OrderNo);
//            List<Slsorderdetail> result =(List<Slsorderdetail>) q.getResultList();
            List<Slsorderdetail> result = entityManager.createNamedQuery("Slsorderdetail.findByOrderNo", Slsorderdetail.class).setParameter("orderNo", OrderNo).getResultList();
            return result;
        } catch (Exception e) {

            System.out.println("ERROR viewSalesOrderDetail : " + e.getMessage());
            return null;
        } 
    }

    @Override
    public void render(Salesorder s) {
        Query q = null;
        entityManager = entityManagerFactory.createEntityManager();
        Invoicetype invoice = new Invoicetype();

        try {
            q = entityManager.createNamedQuery("Invoicetype.findByInvoiceType");
            q.setParameter("invoiceType", TRAHANG);
            invoice = (Invoicetype) q.getSingleResult();

            s.setInvoiceType(invoice);
            entityManager.persist(s);
        } catch (Exception e) {
            System.out.println("ERROR Render : " + e.getMessage());
        }

    }

}
