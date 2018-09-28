package week2.task2;

import java.util.Objects;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private
    int _numerator;
    int _denominator;


    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this._numerator = numerator;
        this._denominator = denominator;
    }


    // TODO: Tính ước chung lớn nhất của 2 số a, b
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 && b==0) return 0;
        if (a % b == 0) return b;
        else return gcd(b, a % b);

    }


    // TODO: hàm tối giản phân số
    public void compact() {
        int gcd = gcd(this._numerator, this._denominator);
        this._numerator /= gcd;
        this._denominator /= gcd;
        if (this._denominator < 0) {
            this._denominator *= -1;
            this._numerator *= -1;
        }
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        if (this._denominator!=0 && other._denominator!=0){
            result._numerator=this._numerator * other._denominator + other._numerator * this._denominator;
            result._denominator=this._denominator * other._denominator;
            compact();
            return result;
        }


        else return null;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        if (this._denominator!=0 && other._denominator!=0){
            result._numerator=this._numerator * other._denominator - other._numerator * this._denominator;
            result._denominator=this._denominator * other._denominator;
            compact();
            return result;
        }

        else return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        if (this._denominator!=0 && other._denominator!=0){
            result._numerator=this._numerator * other._numerator;
            result._denominator=this._denominator * other._denominator;
            compact();
            return result;
        }

        else return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        if (this._denominator!=0 && other._denominator!=0){
            result._numerator=this._numerator * other._denominator;
            result._denominator=this._denominator * other._numerator;
            compact();
            return result;
        }

        else return null;
    }

    // TODO: Hàm so sánh 2 phân số
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        Fraction result = new Fraction(1, 1);
        result = this.subtract(fraction);
        if (result._numerator * result._denominator == 0)
            return true;
        return false;

    }
    // TODO: Hàm in ra kết quả
    public void print() {
        if (this._denominator == 0 && this._numerator != 0)
            System.out.println("Phân số không hợp lệ");
        else {
            if (this._denominator == 1)
                System.out.println("Phân số kết quả là: " + this._numerator);
            else
                System.out.println("Phân số kết quả là: " + _numerator + "/" + _denominator);
        }
    }
    public static void main(String[] args) {
        Fraction s1 = new Fraction(2, 3);
        Fraction s2 = new Fraction(4, 5);
        //Cong 2 phan so
        Fraction tong = s1.add(s2);
        tong.print();
        //Tru 2 phan so
        Fraction hieu = s1.subtract(s2);
        hieu.print();
        //Nhan 2 phan so
        Fraction tich = s1.multiply(s2);
        tich.print();
        //Chia 2 phan so
        Fraction thuong = s1.divide(s2);
        thuong.print();
        // So sanh 2 phan so
        System.out.println(s1.equals(s2));
    }
}
