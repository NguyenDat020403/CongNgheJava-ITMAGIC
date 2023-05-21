package Services;

import DomainModels.SoCD;
import View_Model.CDViewModel;
import java.util.List;

public interface CDService {
    List<CDViewModel> getALL();
    int creat(SoCD n);

    int update(SoCD n, String SoCD);

    int delete(String SoCD);   
    SoCD getOne(String SoCD);  
    List<CDViewModel> select(String SoCD);
    
}
