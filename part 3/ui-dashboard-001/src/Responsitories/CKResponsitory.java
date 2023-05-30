package Responsitories;

import DomainModels.ChuKy;
import View_Model.CKViewModel;
import java.util.List;

public interface CKResponsitory {
    List<CKViewModel> getALL();
    ChuKy getOne(String SoCK); 
}
