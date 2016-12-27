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
import model.Customer;
import model.Inventory;

/**
 *
 * @author ANHVT
 */
@Stateless
public class InventorySessionBean implements InventorySessionBeanRemote {
    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    @Override
    public List<Inventory> getInventory() {
        entityManager =entityManagerFactory.createEntityManager();
        List<Inventory> result=entityManager.createQuery("from Inventory", Inventory.class).getResultList();
        return result;
    }

    @Override
    public boolean addInventory(Inventory c) {
        try {
            entityManager =entityManagerFactory.createEntityManager();
            entityManager.persist(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteInventory(String id) {
        try {
            entityManager =entityManagerFactory.createEntityManager();
            Inventory c =entityManager.find(Inventory.class, id);
            entityManager.remove(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Inventory getDetail(String id) {
        try{
        entityManager =entityManagerFactory.createEntityManager();
        Inventory c= (Inventory) entityManager.createNamedQuery("Inventory.findByID").setParameter("invtID", id).getSingleResult();
        return c;
        }catch(Exception e){
            return null;
        }  
    }
   
}
