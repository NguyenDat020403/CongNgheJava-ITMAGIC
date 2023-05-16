/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import DomainModels.QuanLy;
import DomainModels.TaiKhoan;
import DomainModels.User;


public class Auth {
    public static User user = null;
    public static TaiKhoan taiKhoan = null;
    public static QuanLy quanLy = null;    
    
    public static void clearUser() {
        Auth.user = null;
    }
    public static void clearTaiKhoan() {
        Auth.taiKhoan = null;
    }
    public static void clearQuanLy() {
        Auth.quanLy = null;
    }


    public static boolean isLogin() {
        return Auth.user != null && Auth.taiKhoan != null && Auth.quanLy != null ;
    }

    public static boolean isManager() {
        return Auth.isLogin();
    }
}
