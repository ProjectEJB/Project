/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Remote;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author abc
 */
@Remote
public interface SalesOrderSessionBeanRemote {

    void addSaleOrder(Salesorder s);

    List FindAll();

    List<Slsorderdetail> viewSalesOrderDetail(String OrderNo);

    void render(Salesorder s);

    List<Salesorder> listRender();
}
