/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.ChuKy;
import View_Model.CKViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface CKService {
    List<CKViewModel> getALL();

    ChuKy getOne(String SoCK);

}
