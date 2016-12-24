/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import model.Salesorder;

/**
 *
 * @author Administrator
 */
@Stateful
public class SaleSession implements SaleSessionRemote {

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
        List<Salesorder> result = entityManager.createQuery("from salesorder ",
                Salesorder.class).getResultList();
        return result;
    }

}
