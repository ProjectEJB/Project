/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Remote;
import model.Stktransdetail;
import model.StockTransfer;

/**
 *
 * @author abc
 */
@Remote
public interface StockTransferSessionBeanRemote {
    public List<StockTransfer> getStockTransfer();
    public boolean addStockTransfer(StockTransfer s);
    public boolean deleteStockTransfer(String id);
    public StockTransfer getDetail(String id);
}
