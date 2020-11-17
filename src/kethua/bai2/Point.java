package kethua.bai2;

public class Point extends Color {
    protected int x;
    protected int y;

    public Point() {
    }

    public Point(String tenMau, String maMau, int x, int y) {
        super(tenMau, maMau);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
