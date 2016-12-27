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
import model.Payment;

/**
 *
 * @author Administrator
 */
@Stateless
public class PaymentSessionBean implements PaymentSessionBeanRemote {

    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public void addPayment(Payment p) {
        entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.persist(p);
        } catch (Exception e) {
            System.out.println("add : " + e.getMessage());
        }

    }

    @Override
    public List<Payment> listPayent() {
        entityManager = entityManagerFactory.createEntityManager();
        try {
            List<Payment> result = entityManager.createNamedQuery("Payment.findAll",
                    Payment.class).getResultList();
            return result;

        } catch (Exception e) {
            System.out.println("List: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Payment viewByID(int ID) {
        entityManager = entityManagerFactory.createEntityManager();

        try {
            Payment result = entityManager.createNamedQuery("Payment.findByPaymentID",
                    Payment.class).getSingleResult();

            return result;
        } catch (Exception e) {

            System.out.println("viewById : " + e.getMessage());
        }
        return null;
    }

}
