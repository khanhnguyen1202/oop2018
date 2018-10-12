package week4.task1;

public class CamThanhPhong extends Cam{
    private int soluong;
    private int gianhap;
    private int giaban;
    public CamThanhPhong(String nguon, int gia, double nhietdobaoquan, double thoigianbaoquan, int soluong, int gianhap, int giaban) {
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
        CamThanhPhong camtp= new CamThanhPhong("Hà Giang",20000,26,9,100,16000,25000);
        CamThanhPhong camtp1= new CamThanhPhong("Tuyên Quang",19000,27,9,90,15000,23000);
    }
}