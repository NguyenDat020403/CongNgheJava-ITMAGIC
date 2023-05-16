/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View_Model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class QuanLyViewModel {
    private int ID;
    private String  MaQL;
    private String  TenQL;
    private int Ngay;
    private int Thang;
    private int Nam;    
    private String  TK;
    private String  MK;


    public Object[] toDataRow() {
        return new Object[]{ID ,MaQL,TenQL,Ngay,Thang,Nam,TK,MK};
    }

    public QuanLyViewModel() {
    }

    public QuanLyViewModel(int ID, String MaQL, String TenQL, int Ngay, int Thang, int Nam, String TK, String MK) {
        this.ID = ID;
        this.MaQL = MaQL;
        this.TenQL = TenQL;
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
        this.TK = TK;
        this.MK = MK;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getTenQL() {
        return TenQL;
    }

    public void setTenQL(String TenQL) {
        this.TenQL = TenQL;
    }

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int Ngay) {
        this.Ngay = Ngay;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }

    public String getTK() {
        return TK;
    }

    public void setTK(String TK) {
        this.TK = TK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }
    
}
