/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.SoCD;
import View_Model.CDViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface CDService {
    List<CDViewModel> getALL();
    int creat(SoCD n);

    int update(SoCD n, String SoCD);

    int delete(String SoCD);   
    SoCD getOne(String SoCD);    
}
