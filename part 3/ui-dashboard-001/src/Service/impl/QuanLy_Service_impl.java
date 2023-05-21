package Service.impl;


import DomainModels.QuanLy;
import Responsitories.QuanLyResponsitory;
import Responsitoriesimpl.QuanLy_responsitory_impl;
import Services.QuanLyService;
import View_Model.QuanLyViewModel;
import java.util.List;

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
    public int update(QuanLy n, String EmailQL) {
        return QuanLyRes.update(n, EmailQL);
    }

    @Override
    public int delete(String EmailQL) {
        return QuanLyRes.delete(EmailQL);
    }

    @Override
    public QuanLy getOne(String FTK) {
return QuanLyRes.getOne(FTK);       
    }

    @Override
    public List<QuanLyViewModel> select(String TenQL) {
        return QuanLyRes.select(TenQL);
    }


    
}
