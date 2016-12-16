/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.Entity.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Administrator
 */
@Stateless
public class BookSessionBean implements BookSessionBeanRemote {
@PersistenceUnit(unitName = "BookPU")
private EntityManagerFactory entityManagerFactory;
private EntityManager entityManager;
    @Override
    public void addBook(Book b) {
       entityManager=entityManagerFactory.createEntityManager();
       entityManager.persist(b);
    }

    @Override
    public List FindAll() {
           entityManager=entityManagerFactory.createEntityManager();
      List<Book> result= entityManager.createQuery("from Book ",Book.class).getResultList();
      return result;
    }

   
}
