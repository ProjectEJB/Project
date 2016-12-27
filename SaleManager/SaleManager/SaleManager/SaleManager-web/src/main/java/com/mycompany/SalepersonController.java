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
import model.Customer;
import model.Saleperson;

/**
 *
 * @author ANHVT
 */
@Path("/saleperson")
public class SalepersonController {
   @EJB
    private SalepersonSessionBeanRemote salepersonSessionBeanRemote;
    public SalepersonController() {
    try {
        String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/SalepersonSessionBean!com.mycompany.SalepersonSessionBeanRemote";
        salepersonSessionBeanRemote = (SalepersonSessionBeanRemote) InitialContext.doLookup(lookupName);
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
    public List<Saleperson> listProduct() {
        List<Saleperson> result = new ArrayList<>();
        result = salepersonSessionBeanRemote.getSaleperson();
        return result;
    }  
    
    @GET
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Saleperson getCustomer(@QueryParam("id") String userId){
        Saleperson c=new Saleperson();
        
        c=salepersonSessionBeanRemote.getDetail(userId);
        if(c!=null){
            return c;
        }
        else{
           return null;
        }
    } 
    
    @POST
    @Path("/addSaleperson")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addCustomer(Saleperson c){
        boolean b;
        b=salepersonSessionBeanRemote.addSaleperson(c);
        return b;
    }
    @DELETE
    @Path("/deleteSaleperson")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteCustomer(@QueryParam("id") String id){
        boolean b;
        b=salepersonSessionBeanRemote.deleteSaleperson(id);
        return b;
    } 
}
