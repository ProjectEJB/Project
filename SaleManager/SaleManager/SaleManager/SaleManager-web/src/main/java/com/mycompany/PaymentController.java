/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Payment;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author Administrator
 */
@Path("/payment")
public class PaymentController {

    @EJB
    private PaymentSessionBeanRemote paymentSessionBeanRemote;

    public PaymentController() {
        try {
            String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/PaymentSessionBean!com.mycompany.PaymentSessionBeanRemote";
            paymentSessionBeanRemote = (PaymentSessionBeanRemote) InitialContext.doLookup(lookupName);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Payment> listSales() {
        List<Payment> rs = new ArrayList<Payment>();
        rs = paymentSessionBeanRemote.listPayent();
        return rs;
    }
//
//    @POST
//    @Path("/detail")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Slsorderdetail>
//            listSlsDetail(String OrderNo) {
//        List<Slsorderdetail> rs = new ArrayList<Slsorderdetail>();
//        rs = saleSessionRemote.viewSalesOrderDetail(OrderNo);
//        return rs;
//    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Payment saveItems(Payment p) {
        paymentSessionBeanRemote.addPayment(p);
        return p;
    }
}
