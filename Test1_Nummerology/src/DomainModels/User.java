/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
Ánh xạ thông tin
 */
public class User {
    private     int ID;
    private     String MaUser;
    private     String Name;
    private     int Ngay;
    private     int Thang;
    private     int Nam;
    private     String Sex;
    private     int SDT;
    private     String FTK;


    public User() {
    }

    public User(int ID, String MaUser, String Name, int Ngay, int Thang, int Nam, String Sex, int SDT, String FTK) {
        this.ID = ID;
        this.MaUser = MaUser;
        this.Name = Name;
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
        this.Sex = Sex;
        this.SDT = SDT;
        this.FTK = FTK;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaUser() {
        return MaUser;
    }

    public void setMaUser(String MaUser) {
        this.MaUser = MaUser;
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

    public String getFTK() {
        return FTK;
    }

    public void setFTK(String FTK) {
        this.FTK = FTK;
    }
    
}
