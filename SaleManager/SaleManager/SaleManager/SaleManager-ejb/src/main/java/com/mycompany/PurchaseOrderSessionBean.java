/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import static com.mycompany.SaleSession.TRAHANG;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import model.Invoicetype;
import model.Purchaseorddetail;
import model.Purchaseorder;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author Administrator
 */
@Stateless
public class PurchaseOrderSessionBean implements PurchaseOrderSessionBeanRemote {

    static String TRAHANG = "PR";
    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public List FindAll() {
        entityManager = entityManagerFactory.createEntityManager();
        try {
            List<Purchaseorder> result = entityManager.createNamedQuery("Purchaseorder.findAll",
                    Purchaseorder.class).getResultList();
            return result;
        } catch (Exception e) {
            System.out.println("ERROR FindAll : " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Purchaseorddetail> viewPurchaseOrderDetail(String OrderNo) {
        entityManager = entityManagerFactory.createEntityManager();

        try {
//           
            List<Purchaseorddetail> result = entityManager.createNamedQuery("Slsorderdetail.findByOrderNo", Purchaseorddetail.class).setParameter("orderNo", OrderNo).getResultList();
            return result;
        } catch (Exception e) {

            System.out.println("ERROR viewSalesOrderDetail : " + e.getMessage());
            return null;
        }
    }

    @Override
    public void render(Purchaseorder s) {

        entityManager = entityManagerFactory.createEntityManager();

        try {
            s.setOrderType(TRAHANG);
            entityManager.persist(s);
        } catch (Exception e) {
            System.out.println("ERROR Render : " + e.getMessage());
        }
    }

    @Override
    public void addPurchaseOrder(Purchaseorder b) {
        entityManager = entityManagerFactory.createEntityManager();
        b.setOrderType("PO");
        entityManager.persist(b);
    }

}
