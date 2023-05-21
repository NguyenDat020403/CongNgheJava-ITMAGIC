package Services;

import DomainModels.TaiKhoan;
import View_Model.TKViewModel;
import java.util.List;

public interface TKService {

    List<TKViewModel> getALL();

    int creat(TaiKhoan n);

    int update(TaiKhoan n, String TK);

    int delete(String TK);

    TaiKhoan getOne(String TK);

    List<TKViewModel> select(String TK, String Email, String Name);
}
