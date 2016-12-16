/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.Entity.Book;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface BookSessionBeanRemote {
    void addBook(Book b);
    List FindAll();
    
            
}
