package kethua.bai2;

public class Pixel extends Point {
    public Pixel() {
    }

    public Pixel(String tenMau, String maMau, int x, int y) {
        super(tenMau, maMau, x, y);
    }

    boolean check() {
        if (x == y && maMau.equals("#0000FF")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                ", tenMau='" + tenMau + '\'' +
                ", maMau='" + maMau + '\'' +
                '}';
    }
}
