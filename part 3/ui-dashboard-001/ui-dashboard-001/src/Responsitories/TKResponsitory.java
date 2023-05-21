package Responsitories;

import DomainModels.TaiKhoan;
import View_Model.TKViewModel;
import java.util.List;

public interface TKResponsitory {
    List<TKViewModel> getALL();

    int creat(TaiKhoan tk);

    int update(TaiKhoan tk, String TK);

    int delete(String TK);
    TaiKhoan getOne(String TK);
    List<TKViewModel> select(String TK, String Email, String Name);    
}
