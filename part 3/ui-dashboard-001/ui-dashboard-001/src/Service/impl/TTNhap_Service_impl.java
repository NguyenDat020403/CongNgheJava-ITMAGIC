/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.TTNhap;
import Responsitoriesimpl.TTNhap_reponsitory_impl;
import View_Model.TTNhapViewModel;
import java.util.List;
import Responsitories.TTNhapResponsitory;
import Services.TTNhapService;

/**
 *
 * @author admin
 */
public class TTNhap_Service_impl implements TTNhapService { //liên quan tới interface
    TTNhapResponsitory UserRes = new TTNhap_reponsitory_impl();
    @Override
    public List<TTNhapViewModel> getALL() {
        return UserRes.getALL();
    }

    @Override
    public int creat(TTNhap n) {
        return UserRes.creat(n);
    }

    @Override
    public int update(TTNhap n, String EmailUser) {
        return UserRes.update(n, EmailUser);
    }

    @Override
    public int delete(String EmailUser) {
        return UserRes.delete(EmailUser);
    }

    @Override
    public TTNhap getOne(String Email) {
        return UserRes.getOne(Email);
    }

    @Override
    public List<TTNhapViewModel> select(String Name) {
        return UserRes.select(Name);
    }

    @Override
    public List<TTNhapViewModel> SortName(String Nam1, String Nam2) {
        return UserRes.SortName(Nam1, Nam2);    
    }

    
    
  
}
