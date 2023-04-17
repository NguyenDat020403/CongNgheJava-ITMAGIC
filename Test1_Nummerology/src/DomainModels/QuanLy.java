/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;


/**
Ánh xạ thông tin
 */
public class QuanLy {
    private int ID;
    private String  MaQL;
    private String  TenQL;
    private int Ngay;
    private int Thang;
    private int Nam;    
    private String  FTK;

    public QuanLy() {
    }

    public QuanLy(int ID, String MaQL, String TenQL, int Ngay, int Thang, int Nam, String FTK) {
        this.ID = ID;
        this.MaQL = MaQL;
        this.TenQL = TenQL;
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
        this.FTK = FTK;
 
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

    public String getFTK() {
        return FTK;
    }

    public void setFTK(String FTK) {
        this.FTK = FTK;
    }


    
    
    
}
