package week4.task1;

public class Tao extends HoaQua{
    private double nhietdobaoquan;
    private double thoigianbaoquan;

    public Tao(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan) {
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
        Cam Taoda = new Cam("Trung Quốc",80000,25,20);
        Cam Taomeo = new Cam("Hà Giang",65000,25,12);
    }
}