package View_Model;

import java.util.Date;

public class TTViewModel {
    private String EmailUser;
    private String Name;
    private String FTK;
    private String soCD;
    private String soCK;
    private Date NgayTraCuu;

    public Object[] toDataRow() {
        return new Object[]{EmailUser, Name, FTK, soCD, soCK,  NgayTraCuu, NgayTraCuu};
    }

    public TTViewModel() {
    }

    public TTViewModel(String EmailUser, String Name, String FTK, String soCD, String soCK, Date NgayTraCuu) {
        this.EmailUser = EmailUser;
        this.Name = Name;
        this.FTK = FTK;
        this.soCD = soCD;
        this.soCK = soCK;
        this.NgayTraCuu = NgayTraCuu;
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

    public String getFTK() {
        return FTK;
    }

    public void setFTK(String FTK) {
        this.FTK = FTK;
    }

    public String getSoCD() {
        return soCD;
    }

    public void setSoCD(String soCD) {
        this.soCD = soCD;
    }

    public String getSoCK() {
        return soCK;
    }

    public void setSoCK(String soCK) {
        this.soCK = soCK;
    }

    public Date getNgayTraCuu() {
        return NgayTraCuu;
    }

    public void setNgayTraCuu(Date NgayTraCuu) {
        this.NgayTraCuu = NgayTraCuu;
    }



    
}
