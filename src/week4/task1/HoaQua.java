package week4.task1;

public class HoaQua{
    private String nguon;
    private int gia;

    public HoaQua(String nguon, int gia) {
        this.nguon = nguon;
        this.gia = gia;
    }
    public String getNguon() {
        return nguon;
    }
    public void setNguon(String nguon) {
        this.nguon = nguon;
    }
    public int getGia() {
        return gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }

    public static void main(String[] args) {
        HoaQua Dao = new HoaQua("Đồng Tháp",25000);
        HoaQua Nho = new HoaQua("Ninh Thuận",70000);
    }
}
