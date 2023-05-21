package Responsitories;

import DomainModels.ThongTinTraCuu;
import View_Model.TTViewModel;
import java.util.List;


public interface TTResponsitory {
    List<TTViewModel> getALL();
    List<TTViewModel> select(String Email, String Name);
    int creat(ThongTinTraCuu tt);
}
