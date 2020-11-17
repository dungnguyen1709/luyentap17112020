package kethua.bai2;

public class Color {
    protected String tenMau;
    protected String maMau;

    public Color() {
    }

    public Color(String tenMau, String maMau) {
        this.tenMau = tenMau;
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }
}
