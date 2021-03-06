/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
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
@Remote
public interface PurchaseOrderSessionBeanRemote {

    void addPurchaseOrder(Bill b);

    List FindAll();

    List<Purchaseorddetail> viewPurchaseOrderDetail(String OrderNo);

    void render(Bill b);
    List<Purchaseorder> listRender();
   Inventory findIventory(String invtID) ;
   void deletePurchase(String orderNo);
}
