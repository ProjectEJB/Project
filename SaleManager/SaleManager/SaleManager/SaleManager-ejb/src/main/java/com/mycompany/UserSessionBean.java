/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import model.User;

/**
 *
 * @author Administrator
 */
@Stateless
public class UserSessionBean implements UserSessionBeanRemote {

    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public int login(User u) {
        entityManager = entityManagerFactory.createEntityManager();
       
        try {
            User user = entityManager.createNamedQuery("User.findByUserName", User.class).
                    setParameter("userName", u.getUserName()).getSingleResult();
            if (user == null) {
                return 0;
            } else if (user.getPassword().equals(u.getPassword())) {
                return 1;
            } else {
                return 2;
            }
        } catch (Exception e) {

            System.out.println("ERROR Login : " + e.getMessage());
        }
        return -1;
    }


}
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

