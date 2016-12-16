/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.Entity.User;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Administrator
 */
@Stateful
public class UserSessionBean implements UserSessionBeanRemote {

    @PersistenceUnit(unitName = "ManageSell-MasterPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.persist(user);
    }

    @Override
    public List findAll() {
        entityManager = entityManagerFactory.createEntityManager();
        List<User> result = entityManager.createQuery("from User ", User.class).getResultList();
        return result;
    }

}
