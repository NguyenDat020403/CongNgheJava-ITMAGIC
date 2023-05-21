package Utilities;

import DomainModels.TaiKhoan;
import DomainModels.TTNhap;

public class Auth {
    public static TTNhap user = null;
    public static TaiKhoan taiKhoan = null;
    
    public static void clearUser() {
        Auth.user = null;
    }
    public static void clearTaiKhoan() {
        Auth.taiKhoan = null;
    }

    public static boolean isLogin() {
        return Auth.user != null && Auth.taiKhoan != null  ;
    }

    public static boolean isManager() {
        return Auth.isLogin();
    }
}
