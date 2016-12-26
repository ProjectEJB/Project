/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import model.Customer;

/**
 *
 * @author ANHVT
 */
@Remote
public interface CustomerSessionBeanRemote {
    public List<Customer> getCustomer();
    public boolean addCustomer(Customer c);
    public boolean deleteCustomer(String id);
    public Customer getDetail(String id);
}
