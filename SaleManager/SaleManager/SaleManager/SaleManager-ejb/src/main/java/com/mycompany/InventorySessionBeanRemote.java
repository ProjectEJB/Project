/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;
import model.Inventory;

/**
 *
 * @author ANHVT
 */
@Local
public interface InventorySessionBeanRemote {
    public List<Inventory> getInventory();
    public boolean addInventory(Inventory c);
    public boolean deleteInventory(String id);
    public Inventory getDetail(String id);

    
}
