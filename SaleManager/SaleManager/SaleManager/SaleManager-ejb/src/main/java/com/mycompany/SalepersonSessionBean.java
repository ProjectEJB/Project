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
import model.Saleperson;

/**
 *
 * @author ANHVT
 */
@Stateless
public class SalepersonSessionBean implements SalepersonSessionBeanRemote {
    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    @Override
    public List<Saleperson> getSaleperson() {
        entityManager =entityManagerFactory.createEntityManager();
        List<Saleperson> result=entityManager.createQuery("from Saleperson", Saleperson.class).getResultList();
        return result;
    }

    @Override
    public boolean addSaleperson(Saleperson c) {
        try {
            entityManager =entityManagerFactory.createEntityManager();
            entityManager.persist(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteSaleperson(String id) {
        try {
            entityManager =entityManagerFactory.createEntityManager();
            Saleperson c =entityManager.find(Saleperson.class, id);
            entityManager.remove(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Saleperson getDetail(String id) {
        try{
        entityManager =entityManagerFactory.createEntityManager();
        Saleperson c= (Saleperson) entityManager.createNamedQuery("Saleperson.findByID").setParameter("id", id).getSingleResult();
        return c;
        }catch(Exception e){
            return null;
        } 
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
