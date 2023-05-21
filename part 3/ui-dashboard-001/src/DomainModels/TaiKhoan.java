package DomainModels;

public class TaiKhoan {

    private String TK;
    private String MK;
    private String ChucVu;
    private String  Email;
    private String  Ten;
    private int Ngay;
    private int Thang;
    private int Nam;     
    private int SLTraCuu;

    public TaiKhoan() {
    }

    public TaiKhoan(String TK, String MK, String ChucVu, String Email, String Ten, int Ngay, int Thang, int Nam, int SLTraCuu) {
        this.TK = TK;
        this.MK = MK;
        this.ChucVu = ChucVu;
        this.Email = Email;
        this.Ten = Ten;
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
        this.SLTraCuu = SLTraCuu;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
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

    public int getSLTraCuu() {
        return SLTraCuu;
    }

    public void setSLTraCuu(int SLTraCuu) {
        this.SLTraCuu = SLTraCuu;
    }
    

   
}
