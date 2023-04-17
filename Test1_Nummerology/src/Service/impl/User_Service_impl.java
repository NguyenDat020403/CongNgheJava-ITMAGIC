/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.User;
import Responsitories.UserResponsitory;
import Responsitoriesimpl.User_reponsitory_impl;
import Services.UserService;
import View_Model.UserViewModel;
import java.util.List;

/**
 *
 * @author admin
 */
public class User_Service_impl implements UserService { //liên quan tới interface
    UserResponsitory UserRes = new User_reponsitory_impl();
    @Override
    public List<UserViewModel> getALL() {
        return UserRes.getALL();
    }

    @Override
    public int creat(User n) {
        return UserRes.creat(n);
    }

    @Override
    public int update(User n, String MaUser) {
        return UserRes.update(n, MaUser);
    }

    @Override
    public int delete(String MaUser) {
        return UserRes.delete(MaUser);
    }

    @Override
    public User getOne(String FTK) {
        return UserRes.getOne(FTK);
    }

    
    
  
}
