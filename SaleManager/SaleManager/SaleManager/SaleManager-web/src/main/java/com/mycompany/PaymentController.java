/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Path;

/**
 *
 * @author Administrator
 */
@Path("/payment")
public class PaymentController {

    @EJB
    private CustomerSessionBeanRemote customerSessionBeanRemote;

    public PaymentController() {
        try {
            String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/PaymentSessionBean!com.mycompany.PaymentSessionBeanRemote";
            customerSessionBeanRemote = (CustomerSessionBeanRemote) InitialContext.doLookup(lookupName);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
