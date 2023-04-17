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
    private String power    ;

    public SoCD() {
    }

    public SoCD(int ID, String SoCD, String NDCD, String power) {
        this.ID = ID;
        this.SoCD = SoCD;
        this.NDCD = NDCD;
        this.power = power;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    

}
