/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class TaiKhoan {

    private String TK;
    private String MK;
    private String ChucVu;

    public TaiKhoan() {
    }

    public TaiKhoan( String TK, String MK, String ChucVu) {

        this.TK = TK;
        this.MK = MK;
        this.ChucVu = ChucVu;
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

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

   
}
