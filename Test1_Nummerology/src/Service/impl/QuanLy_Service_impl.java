/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;


import DomainModels.QuanLy;
import Responsitories.QuanLyResponsitory;
import Responsitoriesimpl.QuanLy_responsitory_impl;
import Services.QuanLyService;
import View_Model.QuanLyViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLy_Service_impl implements QuanLyService{
    QuanLyResponsitory QuanLyRes = new QuanLy_responsitory_impl();

    @Override
    public List<QuanLyViewModel> getALL() {
        return QuanLyRes.getALL();
    }

    @Override
    public int creat(QuanLy n) {
        return QuanLyRes.creat(n);
    }

    @Override
    public int update(QuanLy n, String MaQL) {
        return QuanLyRes.update(n, MaQL);
    }

    @Override
    public int delete(String MaQL) {
        return QuanLyRes.delete(MaQL);
    }


    
}
