package Responsitories;

import DomainModels.TTNhap;
import View_Model.TTNhapViewModel;
import java.util.List;

public interface TTNhapResponsitory {

    List<TTNhapViewModel> getALL();

    int creat(TTNhap user);

    int delete(String EmailUser );

    int update(TTNhap user, String EmailUser);
    
    
    TTNhap getOne(String Email);
    List<TTNhapViewModel> select(String Name);
    List<TTNhapViewModel> SortName(String Nam1, String Nam2);
  
}
