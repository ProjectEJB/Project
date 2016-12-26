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
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author Administrator
 */
@Path("/sale")
public class SalesOrderController {

    @EJB
    private SaleSessionRemote saleSessionRemote;

    public SalesOrderController() {
        try {

            String lookName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/SaleSession!com.mycompany.SaleSessionRemote";
            saleSessionRemote = (SaleSessionRemote) InitialContext.doLookup(lookName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Salesorder> listSales() {
        List<Salesorder> rs = new ArrayList<Salesorder>();
        rs = saleSessionRemote.FindAll();
        return rs;
    }

    @POST
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Slsorderdetail>
            listSlsDetail(String OrderNo) {
        List<Slsorderdetail> rs = new ArrayList<Slsorderdetail>();
        rs = saleSessionRemote.viewSalesOrderDetail(OrderNo);
        return rs;
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Salesorder saveItems(Salesorder p) {
        saleSessionRemote.addSaleorder(p);
        return p;
    }
    @POST
    @Path("/return")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Salesorder render(Salesorder p) {
        saleSessionRemote.render(p);
        return p;
    }

}
