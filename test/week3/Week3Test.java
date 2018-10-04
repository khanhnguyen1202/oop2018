package week3;

import org.junit.Test;
import static org.junit.Assert.*;
import static week3.Week3.calculateBMI;
import static week3.Week3.max;
import static week3.Week3.minOfArray;


public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(4,max(2, 4));
        assertEquals(-3, max(-3, -3));
        assertEquals(-5, max(-10, -5));
        assertEquals(0, max(0, -7));
        assertEquals(5, max(5, -6));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public static int a[] = {-7,-3,4,1,1,-2,7,12,-20,2};
    public static int b[] = {0, 14, 2, -4};
    public static int c[] = {2, 0, 0, 0, 2};
    public static int d[] = {-4, 5, 8, 9, 1, 123, -2, 1, 1};
    public static int e[] = {10, 13, 12, 14, 9, 21, 2};
    @Test
    public void testMin(){
        assertEquals(-10,minOfArray(a));
        assertEquals(0,minOfArray(b));
        assertEquals(2,minOfArray(c));
        assertEquals(-5,minOfArray(d));
        assertEquals(9,minOfArray(e));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI(){
        assertEquals("Thiếu cân", calculateBMI(20.5,1.2));
        assertEquals("Bình thường", calculateBMI(30.6, 1.2));
        assertEquals("Thừa cân", calculateBMI(52, 1.46));
        assertEquals("Béo phì", calculateBMI(60.5, 1.5));
        assertEquals("Thiếu cân", calculateBMI(25.75, 1.5));
    }
}