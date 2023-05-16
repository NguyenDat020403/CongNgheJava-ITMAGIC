/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.TaiKhoan;
import Responsitories.TKResponsitory;
import Responsitoriesimpl.TK_responsitory_impl;
import Services.TKService;
import View_Model.TKViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class TK_Service_impl implements TKService{
    TKResponsitory TKRes = new TK_responsitory_impl();

    @Override
    public List<TKViewModel> getALL() {
        return TKRes.getALL();
    }

    @Override
    public int creat(TaiKhoan n) {
        return TKRes.creat(n);
    }

    @Override
    public int update(TaiKhoan n, String TK) {
        return TKRes.update(n, TK);
    }

    @Override
    public int delete(String TK) {
        return TKRes.delete(TK);
    }

    @Override
    public TaiKhoan getOne(String TK) {
            return TKRes.getOne(TK);

    }

    
}
