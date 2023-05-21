
package View_Model;

public class CDViewModel {

    private String SoCD;
    private String NDCD;
    private String DiemManh;
    private String DiemYeu;
    private String TinhCach;
    
    public Object[] toDataRow() {
        return new Object[]{  SoCD, NDCD,DiemManh, DiemYeu, TinhCach};
    }

    public CDViewModel(String SoCD, String NDCD, String DiemManh, String DiemYeu, String TinhCach) {
        this.SoCD = SoCD;
        this.NDCD = NDCD;
        this.DiemManh = DiemManh;
        this.DiemYeu = DiemYeu;
        this.TinhCach = TinhCach;
    }

    public CDViewModel() {
    }

    public String getTinhCach() {
        return TinhCach;
    }

    public void setTinhCach(String TinhCach) {
        this.TinhCach = TinhCach;
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
