package DomainModels;

import java.util.Date;

public class ThongTinTraCuu {
    private int ID;
    private int IDSCD;
    private int IDCK;
    private int IDThongTinNhap;
    private Date NgayTraCuu;
    private int IDSCN;
    private int IDSCT;    

    public ThongTinTraCuu() {
    }

    public ThongTinTraCuu(int ID, int IDSCD, int IDCK, int IDThongTinNhap, Date NgayTraCuu, int IDSCN, int IDSCT) {
        this.ID = ID;
        this.IDSCD = IDSCD;
        this.IDCK = IDCK;
        this.IDThongTinNhap = IDThongTinNhap;
        this.NgayTraCuu = NgayTraCuu;
        this.IDSCN = IDSCN;
        this.IDSCT = IDSCT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDSCD() {
        return IDSCD;
    }

    public void setIDSCD(int IDSCD) {
        this.IDSCD = IDSCD;
    }

    public int getIDCK() {
        return IDCK;
    }

    public void setIDCK(int IDCK) {
        this.IDCK = IDCK;
    }

    public int getIDThongTinNhap() {
        return IDThongTinNhap;
    }

    public void setIDThongTinNhap(int IDThongTinNhap) {
        this.IDThongTinNhap = IDThongTinNhap;
    }

    public Date getNgayTraCuu() {
        return NgayTraCuu;
    }

    public void setNgayTraCuu(Date NgayTraCuu) {
        this.NgayTraCuu = NgayTraCuu;
    }

    public int getIDSCN() {
        return IDSCN;
    }

    public void setIDSCN(int IDSCN) {
        this.IDSCN = IDSCN;
    }

    public int getIDSCT() {
        return IDSCT;
    }

    public void setIDSCT(int IDSCT) {
        this.IDSCT = IDSCT;
    }
 
}
