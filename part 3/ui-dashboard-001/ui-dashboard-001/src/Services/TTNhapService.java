package Services;


import DomainModels.TTNhap;
import View_Model.TTNhapViewModel;
import java.util.List;

public interface TTNhapService {
    List<TTNhapViewModel> getALL();
    int creat(TTNhap n);

    int update(TTNhap n, String EmailUser);

    int delete(String EmailUser);
    TTNhap getOne(String Email);
    List<TTNhapViewModel> select(String Name);
    List<TTNhapViewModel> SortName(String Nam1, String Nam2);   
    
}
