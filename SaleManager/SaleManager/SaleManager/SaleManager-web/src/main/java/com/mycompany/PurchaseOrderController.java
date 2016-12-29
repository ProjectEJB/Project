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
import model.Bill;
import model.Inventory;
import model.Purchaseorddetail;
import model.Purchaseorder;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author Administrator
 */
@Path("/purchaseorder")
public class PurchaseOrderController {

    @EJB
    private PurchaseOrderSessionBeanRemote purchaseOrderSessionBeanRemote;

    public PurchaseOrderController() {
        try {
            String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/PurchaseOrderSessionBean!com.mycompany.PurchaseOrderSessionBeanRemote";
            purchaseOrderSessionBeanRemote = (PurchaseOrderSessionBeanRemote) InitialContext.doLookup(lookupName);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Purchaseorder> listPurchase() {
        List<Purchaseorder> rs = new ArrayList<Purchaseorder>();
        rs = purchaseOrderSessionBeanRemote.FindAll();
        return rs;
    }

    @GET
    @Path("/listRender")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Purchaseorder> listRender() {
        List<Purchaseorder> rs = new ArrayList<Purchaseorder>();
        rs = purchaseOrderSessionBeanRemote.listRender();
        return rs;
    }

    @GET
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Purchaseorddetail>
            listPurchaseDetail(@QueryParam("OrderNo") String OrderNo) {
        List<Purchaseorddetail> rs = new ArrayList<Purchaseorddetail>();
        rs = purchaseOrderSessionBeanRemote.viewPurchaseOrderDetail(OrderNo);
        return rs;
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Bill saveItems(Bill b) {
        purchaseOrderSessionBeanRemote.addPurchaseOrder(b);
        return b;
    }

    @GET
    @Path("/getinventory")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Inventory getInventory(@QueryParam("InvtID") String InvtID) {

        return purchaseOrderSessionBeanRemote.findIventory(InvtID);
    }

    @DELETE
    @Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String delete(@QueryParam("orderNo") String orderNo) {

        purchaseOrderSessionBeanRemote.deletePurchase(orderNo);
        return orderNo;
    }

    @POST
    @Path("/return")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Bill render(Bill p) {
        purchaseOrderSessionBeanRemote.render(p);
        return p;
    }
}
