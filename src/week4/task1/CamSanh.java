package week4.task1;

public class CamSanh extends Cam{
    private int soluong;
    private int gianhap;
    private int giaban;
    public CamSanh(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan, int soluong, int gianhap, int giaban) {
        super(nguon, gia, nhietdobaoquan, thoigianbaoquan);
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public int getGianhap() {
        return gianhap;
    }
    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }
    public int getGiaban() {
        return giaban;
    }
    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public static void main(String[] args) {
        CamSanh camsanh= new CamSanh("Hà Giang",35000,27,9,100,30000,40000);
        CamSanh camsanh1= new CamSanh("Tuyên Quang",33000,27,9,90,27000,35000);
    }
}