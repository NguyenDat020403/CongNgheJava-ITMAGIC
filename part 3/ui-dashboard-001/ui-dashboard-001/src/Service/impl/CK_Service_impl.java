/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.ChuKy;
import Responsitories.CKResponsitory;
import Responsitoriesimpl.CK_responsitory_impl;
import Services.CKService;
import View_Model.CKViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class CK_Service_impl implements CKService{
    CKResponsitory CKRes = new CK_responsitory_impl();

    @Override
    public List<CKViewModel> getALL() {
        return CKRes.getALL();        
    }

    @Override
    public ChuKy getOne(String SoCK) {
            return CKRes.getOne(SoCK);

    }
}
