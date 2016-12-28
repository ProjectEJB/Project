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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author abc
 */
@Path("/saleOrder")
public class SalesOrderManagerController {
    @EJB
    private SalesOrderSessionBeanRemote salesOrderSessionBeanRemote;

    public SalesOrderManagerController() {
        try {

            String lookName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/SalesOrderSessionBean!com.mycompany.SalesOrderSessionBeanRemote";
            salesOrderSessionBeanRemote = (SalesOrderSessionBeanRemote) InitialContext.doLookup(lookName);
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
        rs = salesOrderSessionBeanRemote.FindAll();
        return rs;
    }
    
    @GET
    @Path("/listRender")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Salesorder> listRender() {
        List<Salesorder> rs = new ArrayList<Salesorder>();
        rs = salesOrderSessionBeanRemote.listRender();
        return rs;
    }
    
    @GET
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Slsorderdetail>
            listSlsDetail(@QueryParam("OrderNo") String OrderNo) {
        List<Slsorderdetail> rs = new ArrayList<Slsorderdetail>();
        rs = salesOrderSessionBeanRemote.viewSalesOrderDetail(OrderNo);
        return rs;
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Salesorder saveItems(Salesorder p) {
        salesOrderSessionBeanRemote.addSaleOrder(p);
        return p;
    }

    @POST
    @Path("/return")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Salesorder render(Salesorder p) {
        salesOrderSessionBeanRemote.render(p);
        return p;
    }
}
