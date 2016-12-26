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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCustomer(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getDetail(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}