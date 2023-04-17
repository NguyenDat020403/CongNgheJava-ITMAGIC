/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.QuanLy;
import View_Model.QuanLyViewModel;
import java.util.List;

/**
 *
 * @author admin
 * giong QuanLyRespon
 */
public interface QuanLyService {
    List<QuanLyViewModel> getALL();
    int creat(QuanLy n);

    int update(QuanLy n, String MaQL);

    int delete(String MaQL);
}
