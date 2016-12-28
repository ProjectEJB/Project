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
import model.Inventory;

/**
 *
 * @author ANHVT
 */
@Path("/inventory")
public class InventoryController {
    @EJB
    private InventorySessionBeanRemote inventorySessionBeanRemote;
    public InventoryController() {
    try {
        String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/InventorySessionBean!com.mycompany.InventorySessionBeanRemote";
        inventorySessionBeanRemote = (InventorySessionBeanRemote) InitialContext.doLookup(lookupName);
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
    public List<Inventory> listProduct() {
        List<Inventory> result = new ArrayList<>();
        result = inventorySessionBeanRemote.getInventory();
        return result;
    }  
    
    @GET
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Inventory getInventory(@QueryParam("id") String invtID){
        Inventory c=new Inventory();
        
        c=inventorySessionBeanRemote.getDetail(invtID);
        if(c!=null){
            return c;
        }
        else{
           return null;
        }
    } 
    
    @POST
    @Path("/addInventory")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addInventory(Inventory c){
        boolean b;
        b=inventorySessionBeanRemote.addInventory(c);
        return b;
    }
    @DELETE
    @Path("/deleteInventory")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteInventory(@QueryParam("id") String id){
        boolean b;
        b=inventorySessionBeanRemote.deleteInventory(id);
        return b;
    }
}
