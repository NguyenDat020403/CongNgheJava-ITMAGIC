package Service.impl;

import DomainModels.ThongTinTraCuu;
import Responsitories.TTResponsitory;
import Responsitoriesimpl.TT_responsitory_impl;
import Services.TTService;
import View_Model.TTViewModel;
import java.util.List;

public class TT_Service_impl implements TTService{
    TTResponsitory TTRes = new TT_responsitory_impl();

    @Override
    public List<TTViewModel> getALL() {
        return TTRes.getALL();
    }

    @Override
    public List<TTViewModel> select(String Email, String Name) {
        return TTRes.select(Email, Name);
    }

    @Override
    public int creat(ThongTinTraCuu tt) {
        return TTRes.creat(tt);
    }
}
