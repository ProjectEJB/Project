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
    public List<Stktransdetail> getStockTransfer() {
        entityManager = entityManagerFactory.createEntityManager();
        List<Stktransdetail> result = entityManager.createQuery("from Stktransdetail",
                Stktransdetail.class).getResultList();
        return result;
    }

    @Override
    public boolean addStockTransfer(Stktransdetail s) {
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
            Stktransdetail s = entityManager.find(Stktransdetail.class, id);
            entityManager.remove(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Stktransdetail getDetail(String id) {
        try {
            entityManager = entityManagerFactory.createEntityManager();
            Stktransdetail s = (Stktransdetail) entityManager.createNamedQuery("Stktransdetail.findByID")
                    .setParameter("TransID", id).getSingleResult();
            return s;
        } catch (Exception e) {
            return null;
        }
    }
}
