package Responsitories;

import DomainModels.SoCD;
import View_Model.CDViewModel;
import java.util.List;

public interface CDResponsitory {
    List<CDViewModel> getALL();

    int creat(SoCD cd);

    int update(SoCD cd, String SoCD);

    int delete(String SoCD);
    SoCD getOne(String SoCD); 
    List<CDViewModel> select(String SoCD);
    
}
