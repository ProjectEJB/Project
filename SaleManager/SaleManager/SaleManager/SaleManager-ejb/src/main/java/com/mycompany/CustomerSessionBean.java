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

/**
 *
 * @author ANHVT
 */
@Stateless
public class CustomerSessionBean implements CustomerSessionBeanRemote {
    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    @Override
    public List<Customer> getCustomer() {
        entityManager =entityManagerFactory.createEntityManager();
        List<Customer> result=entityManager.createQuery("from Customer", Customer.class).getResultList();
        return result;
    }

    @Override
    public boolean addCustomer(Customer c) {
        try {
            entityManager =entityManagerFactory.createEntityManager();
            entityManager.persist(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteCustomer(String id) {
        try {
            entityManager =entityManagerFactory.createEntityManager();
            Customer c =entityManager.find(Customer.class, id);
            entityManager.remove(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Customer getDetail(String id) {
        try{
        entityManager =entityManagerFactory.createEntityManager();
        Customer c= (Customer) entityManager.createNamedQuery("Customer.findByCusID").setParameter("custID", id).getSingleResult();
        return c;
        }catch(Exception e){
            return null;
        }       
    }

    
}
