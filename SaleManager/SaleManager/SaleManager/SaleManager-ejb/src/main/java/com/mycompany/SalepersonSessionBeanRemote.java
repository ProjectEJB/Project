/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import model.Saleperson;

/**
 *
 * @author ANHVT
 */
@Remote
public interface SalepersonSessionBeanRemote {
    public List<Saleperson> getSaleperson();
    public boolean addSaleperson(Saleperson c);
    public boolean deleteSaleperson(String id);
    public Saleperson getDetail(String id);
}
