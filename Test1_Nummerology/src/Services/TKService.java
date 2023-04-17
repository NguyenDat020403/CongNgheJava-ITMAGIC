/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.TaiKhoan;
import View_Model.TKViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface TKService {
    List<TKViewModel> getALL();
    int creat(TaiKhoan n);

    int update(TaiKhoan n, String TK);

    int delete(String TK);   
    TaiKhoan getOne(String TK);
}
