/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.Local;
import javax.ejb.Remote;
import model.User;

/**
 *
 * @author Administrator
 */
@Remote
public interface UserSessionBeanRemote {
    int login(User u);
}
