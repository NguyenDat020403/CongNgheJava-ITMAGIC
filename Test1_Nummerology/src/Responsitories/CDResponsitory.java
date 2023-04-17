/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitories;

import DomainModels.SoCD;
import View_Model.CDViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface CDResponsitory {
    List<CDViewModel> getALL();

    int creat(SoCD cd);

    int update(SoCD cd, String SoCD);

    int delete(String SoCD);
    SoCD getOne(String SoCD);    
}
