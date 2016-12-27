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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import model.Customer;

/**
 *
 * @author ANHVT
 */
@Path("/customer")
public class CustomerController {
    @EJB
    private CustomerSessionBeanRemote customerSessionBeanRemote;
    public CustomerController() {
    try {
        String lookupName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/CustomerSessionBean!com.mycompany.CustomerSessionBeanRemote";
        customerSessionBeanRemote = (CustomerSessionBeanRemote) InitialContext.doLookup(lookupName);
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
    public List<Customer> listProduct() {
        List<Customer> result = new ArrayList<>();
        result = customerSessionBeanRemote.getCustomer();
        return result;
    }  
    
    @GET
    @Path("/detail")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@QueryParam("id") String userId){
        Customer c=new Customer();
        
        c=customerSessionBeanRemote.getDetail(userId);
        if(c!=null){
            return c;
        }
        else{
           return null;
        }
    } 
    
    @POST
    @Path("/addCustomer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addCustomer(Customer c){
        boolean b;
        b=customerSessionBeanRemote.addCustomer(c);
        return b;
    }
    @DELETE
    @Path("/deleteCustomer")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteCustomer(@QueryParam("id") String id){
        boolean b;
        b=customerSessionBeanRemote.deleteCustomer(id);
        return b;
    }
}
