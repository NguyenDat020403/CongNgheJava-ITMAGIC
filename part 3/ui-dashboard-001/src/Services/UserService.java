/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;


import DomainModels.User;
import View_Model.UserViewModel;
import java.util.List;

/**
 *
 * @author admin
 * @description xử lý logic, usecase của bài toán 
 * giong respon
 */
public interface UserService {
    List<UserViewModel> getALL();
    int creat(User n);

    int update(User n, String MaUser);

    int delete(String MaUser);
    User getOne(String FTK);
    List<UserViewModel> select(String Name);
    List<UserViewModel> SortName(String Nam1, String Nam2);   
    
}
