/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Responsitories;

import DomainModels.TaiKhoan;
import View_Model.TKViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public interface TKResponsitory {
    List<TKViewModel> getALL();

    int creat(TaiKhoan tk);

    int update(TaiKhoan tk, String TK);

    int delete(String TK);
    TaiKhoan getOne(String TK);
}
