package DomainModels;

public class ChuKy {

    private String SoCK;
    private String ND;
    private String BienPhap;
    private String TinhYeu;

    public ChuKy() {
    }

    public ChuKy(String SoCK, String ND, String BienPhap, String TinhYeu) {
        this.SoCK = SoCK;
        this.ND = ND;
        this.BienPhap = BienPhap;
        this.TinhYeu = TinhYeu;
    }

    public String getSoCK() {
        return SoCK;
    }

    public void setSoCK(String SoCK) {
        this.SoCK = SoCK;
    }

    public String getND() {
        return ND;
    }

    public void setND(String ND) {
        this.ND = ND;
    }

    public String getBienPhap() {
        return BienPhap;
    }

    public void setBienPhap(String BienPhap) {
        this.BienPhap = BienPhap;
    }

    public String getTinhYeu() {
        return TinhYeu;
    }

    public void setTinhYeu(String TinhYeu) {
        this.TinhYeu = TinhYeu;
    }

}
