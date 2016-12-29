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
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import model.StockTransfer;
import model.StockTransfer;

/**
 *
 * @author abc
 */
@Path("/stockTransfer")
public class StockTransferController {

    @EJB
    private StockTransferSessionBeanRemote stockTransferSessionBeanRemote;

    public StockTransferController() {
        try {
            String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/StockTransferSessionBean!com.mycompany.StockTransferSessionBeanRemote";
            stockTransferSessionBeanRemote = (StockTransferSessionBeanRemote) InitialContext.doLookup(lookupName);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/sayHello")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(@QueryParam("userName") String userId) {
        return userId;
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<StockTransfer> listProduct() {
        List<StockTransfer> result = new ArrayList<>();
        result = stockTransferSessionBeanRemote.getStockTransfer();
        return result;
    }

    @GET
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public StockTransfer getInventory(@QueryParam("id") String transferID) {
        StockTransfer s = new StockTransfer();

        s = stockTransferSessionBeanRemote.getDetail(transferID);
        if (s != null) {
            return s;
        } else {
            return null;
        }
    }

    @POST
    @Path("/addStockTransfer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addInventory(StockTransfer s) {
        boolean b;
        b = stockTransferSessionBeanRemote.addStockTransfer(s);
        return b;
    }

    @DELETE
    @Path("/deleteStockTransfer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteInventory(@QueryParam("id") String id) {
        boolean b;
        b = stockTransferSessionBeanRemote.deleteStockTransfer(id);
        return b;
    }
}
