/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class SoCD {
    private int ID;
    private String SoCD;
    private String NDCD;
    private String DiemManh;
    private String DiemYeu;
    private String TinhCach;

    public SoCD() {
    }

    public SoCD(int ID, String SoCD, String NDCD, String DiemManh, String DiemYeu, String TinhCach) {
        this.ID = ID;
        this.SoCD = SoCD;
        this.NDCD = NDCD;
        this.DiemManh = DiemManh;
        this.DiemYeu = DiemYeu;
        this.TinhCach = TinhCach;
    }

    public String getTinhCach() {
        return TinhCach;
    }

    public void setTinhCach(String TinhCach) {
        this.TinhCach = TinhCach;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSoCD() {
        return SoCD;
    }

    public void setSoCD(String SoCD) {
        this.SoCD = SoCD;
    }

    public String getNDCD() {
        return NDCD;
    }

    public void setNDCD(String NDCD) {
        this.NDCD = NDCD;
    }

    public String getDiemManh() {
        return DiemManh;
    }

    public void setDiemManh(String DiemManh) {
        this.DiemManh = DiemManh;
    }

    public String getDiemYeu() {
        return DiemYeu;
    }

    public void setDiemYeu(String DiemYeu) {
        this.DiemYeu = DiemYeu;
    }
    
}
