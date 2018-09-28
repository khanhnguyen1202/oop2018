package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if (a==0 && b==0) return 0;
        if (a % b == 0) return b;
        else return gcd(b, a % b);
        // TODO: Tính ước chung lớn nhất của 2 số a, b

    }

    public static int fibonacci(int n) {
        int a = 0, b = 1, c=0;
        // TODO: Tìm số fibonacci ở vị trí n
        if (n <= 1) return n;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Ước chung lớn nhất của 2 số là: ");
        System.out.println(gcd(6, 1));
        System.out.println("SỐ ở vị trí n là: ");
        System.out.println(fibonacci(5));
    }
}