/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import model.Stktransdetail;
import model.StockTransfer;

/**
 *
 * @author abc
 */
@Stateless
public class StockTransferSessionBean implements StockTransferSessionBeanRemote {

    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public List<StockTransfer> getStockTransfer() {
        entityManager = entityManagerFactory.createEntityManager();
        List<StockTransfer> result = entityManager.createQuery("from StockTransfer",
                StockTransfer.class).getResultList();
        return result;
    }

    @Override
    public boolean addStockTransfer(StockTransfer s) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.persist(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteStockTransfer(String id) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            StockTransfer s = entityManager.find(StockTransfer.class, id);
            entityManager.remove(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public StockTransfer getDetail(String id) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            StockTransfer s = (StockTransfer) entityManager.createNamedQuery("StockTransfer.findByID")
                    .setParameter("TransID", id).getSingleResult();
            return s;
        } catch (Exception e) {
            return null;
        }
    }
}
