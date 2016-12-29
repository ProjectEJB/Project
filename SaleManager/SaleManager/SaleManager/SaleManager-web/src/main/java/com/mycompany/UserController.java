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
import model.User;

/**
 *
 * @author Administrator
 */
@Path("/login")
public class UserController {

    @EJB
    private UserSessionBeanRemote userSessionBeanRemote;

    public UserController() {
        try {

            String lookName = "java:global/SaleManager-ear/SaleManager-ejb-1.0-SNAPSHOT/UserSessionBean!com.mycompany.UserSessionBeanRemote";
            userSessionBeanRemote = (UserSessionBeanRemote) InitialContext.doLookup(lookName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public int Login(User u) {

        int rs = userSessionBeanRemote.login(u);
//        if (rs == 1) {
//            return u;
//        } else {
//            if (rs == 2 || rs == 0) {
//                return null;
//            }
//        }
        return rs;
    }

}
