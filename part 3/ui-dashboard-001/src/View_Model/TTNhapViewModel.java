/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View_Model;

/**
 *
 * @author admin
 * class này chứa dữ liệu cho giao diện user
 */
public class TTNhapViewModel {
    private     int ID;
    private     String EmailUser;
    private     String Name;
    private     int Ngay;
    private     int Thang;
    private     int Nam;
    private     String Sex;
    private     int SDT;
    private     String TK;
    private     String MK;

    public Object[] toDataRow() {
        return new Object[]{ID ,EmailUser,Name,Ngay,Thang,Nam,Sex,SDT,TK,MK};
    }

    public TTNhapViewModel() {
    }

    public TTNhapViewModel(int ID, String EmailUser, String Name, int Ngay, int Thang, int Nam, String Sex, int SDT, String TK, String MK) {
        this.ID = ID;
        this.EmailUser = EmailUser;
        this.Name = Name;
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
        this.Sex = Sex;
        this.SDT = SDT;
        this.TK = TK;
        this.MK = MK;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmailUser() {
        return EmailUser;
    }

    public void setEmailUser(String EmailUser) {
        this.EmailUser = EmailUser;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
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
