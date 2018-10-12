package week4.task1;

public class Cam extends HoaQua{
    private double nhietdobaoquan;
    private double thoigianbaoquan;

    public Cam(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan) {
        super(nguon, gia);
        this.nhietdobaoquan = nhietdobaoquan;
        this.thoigianbaoquan = thoigianbaoquan;
    }

    public double getNhietdobaoquan() {
        return nhietdobaoquan;
    }
    public void setNhietdobaoquan(double nhietdobaoquan) {
        this.nhietdobaoquan = nhietdobaoquan;
    }
    public double getThoigianbaoquan() {
        return thoigianbaoquan;
    }
    public void setThoigianbaoquan(double thoigianbaoquan) {
        this.thoigianbaoquan = thoigianbaoquan;
    }

    public static void main(String[] args) {
        Cam camcanh = new Cam("Bắc Giang",80000,27,9);
        Cam camkhe = new Cam("Hà Tĩnh",65000,27,8);
    }
}
