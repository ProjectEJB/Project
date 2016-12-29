/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import static com.mycompany.SaleSession.TRAHANG;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import model.Bill;
import model.Inventory;
import model.Invoicetype;
import model.Purchaseorddetail;
import model.Purchaseorder;
import model.Salesorder;
import model.Slsorderdetail;

/**
 *
 * @author Administrator
 */
@Stateless
public class PurchaseOrderSessionBean implements PurchaseOrderSessionBeanRemote {

    static String TRAHANG = "PR";
    @PersistenceUnit(unitName = "SaleManagerPU")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Override
    public List FindAll() {
        entityManager = entityManagerFactory.createEntityManager();
        try {
            List<Purchaseorder> result = entityManager.createNamedQuery("Purchaseorder.findByOrderType", Purchaseorder.class)
                    .setParameter("orderType", "PO").getResultList();
            return result;
        } catch (Exception e) {
            System.out.println("ERROR FindAll : " + e.getMessage());
        }
        return null;
    }

    @Override
    public void render(Bill b) {

         entityManager = entityManagerFactory.createEntityManager();
      
        Purchaseorder purchase = new Purchaseorder();
        Purchaseorddetail detail = new Purchaseorddetail();

        purchase.setOrderNo(b.getOrderNo());
        purchase.setAmount(b.getAmount());
        purchase.setComAmt(b.getComAmt());
        purchase.setDiscAmt(b.getDiscAmt());
        purchase.setOrderDate(b.getOrderDate());
        purchase.setOrderType("PR");
        purchase.setOverdueDate(b.getOverdueDate());
        purchase.setPromAmt(b.getPromAmt());
        purchase.setTaxAmt(b.getTaxAmt());

        detail.setOrderNo(b.getOrderNo());
        detail.setAmount(Long.parseLong(String.valueOf(b.getAmount().intValue())));
        detail.setAmtProm(b.getAmtProm());
        detail.setInvtID(b.getInvtID());
        detail.setPurchasePrice(b.getPurchasePrice());
        detail.setQty(b.getQty());
        detail.setQtyProm(b.getQtyProm());
        detail.setQtyPromAmt(b.getQtyPromAmt());
        detail.setStockID(b.getStockID());
        detail.setTaxAmt(Long.parseLong(String.valueOf(b.getTaxAmt().intValue())));

        entityManager.persist(purchase);
        entityManager.persist(detail);
    }

    @Override
    public List<Purchaseorder> listRender() {
        entityManager = entityManagerFactory.createEntityManager();

        try {
//           
            List<Purchaseorder> result = entityManager.createNamedQuery("Purchaseorder.findByOrderType", Purchaseorder.class).setParameter("orderType", "PR").getResultList();
            return result;
        } catch (Exception e) {

            System.out.println("ERROR viewSalesOrderDetail : " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Purchaseorddetail> viewPurchaseOrderDetail(String OrderNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inventory findIventory(String invtID) {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager.createNamedQuery("Inventory.findByInvtID", Inventory.class).setParameter("invtID", invtID).getSingleResult();
    }

    @Override
    public void addPurchaseOrder(Bill b) {
        entityManager = entityManagerFactory.createEntityManager();
        b.setOrderType("PO");
        Purchaseorder purchase = new Purchaseorder();
        Purchaseorddetail detail = new Purchaseorddetail();

        purchase.setOrderNo(b.getOrderNo());
        purchase.setAmount(b.getAmount());
        purchase.setComAmt(b.getComAmt());
        purchase.setDiscAmt(b.getDiscAmt());
        purchase.setOrderDate(b.getOrderDate());
        purchase.setOrderType("PO");
        purchase.setOverdueDate(b.getOverdueDate());
        purchase.setPromAmt(b.getPromAmt());
        purchase.setTaxAmt(b.getTaxAmt());

        detail.setOrderNo(b.getOrderNo());
        detail.setAmount(Long.parseLong(String.valueOf(b.getAmount().intValue())));
        detail.setAmtProm(b.getAmtProm());
        detail.setInvtID(b.getInvtID());
        detail.setPurchasePrice(b.getPurchasePrice());
        detail.setQty(b.getQty());
        detail.setQtyProm(b.getQtyProm());
        detail.setQtyPromAmt(b.getQtyPromAmt());
        detail.setStockID(b.getStockID());
        detail.setTaxAmt(Long.parseLong(String.valueOf(b.getTaxAmt().intValue())));

        entityManager.persist(purchase);
        entityManager.persist(detail);
    }

    @Override
    public void deletePurchase(String orderNo) {
        entityManager = entityManagerFactory.createEntityManager();
// entityManager.createNamedQuery("Purchaseorder.deleteByOrtderNo",Purchaseorder.class).setParameter("orderNo", orderNo).getSingleResult();
        entityManager.remove(entityManager.find(Purchaseorder.class, orderNo));
        entityManager.remove(entityManager.find(Purchaseorddetail.class, orderNo));
    }

}
