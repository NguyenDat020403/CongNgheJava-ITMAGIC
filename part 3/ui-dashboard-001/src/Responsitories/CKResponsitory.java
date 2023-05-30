/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitories;

import DomainModels.ChuKy;
import View_Model.CKViewModel;
import java.util.List;

public interface CKResponsitory {
    List<CKViewModel> getALL();
    ChuKy getOne(String SoCK); 
}
