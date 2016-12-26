/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import model.Payment;

/**
 *
 * @author Administrator
 */
@Remote
public interface PaymentSessionBeanRemote {

    void addPayment(Payment p);

    List<Payment> listPayent();

    Payment viewByID(int ID);
}
