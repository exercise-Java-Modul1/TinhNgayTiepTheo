import org.junit.Test;

import static org.junit.Assert.*;

public class NextDayCalculatorTest {

    @Test
    public void ngayTiepTheo1() {
        int day = 29;
        int month = 2;
        int expected = 1;
        int result = NextDayCalculator.NgayTiepTheo(day, month);
        System.out.println("Ngày tiếp theo là " + expected + "-" + (month+1));
        assertEquals(expected, result);
    }

    @Test
    public void ngayTiepTheo2() {
        int day = 3;
        int month = 2;
        int expected = 4;
        int result = NextDayCalculator.NgayTiepTheo(day, month);
        System.out.println("Ngày tiếp theo là " + expected + "-" + (month));
        assertEquals(expected, result);
    }

    @Test
    public void ngayTiepTheo3() {
        int day = 30;
        int month = 4;
        int expected = 1;
        int result = NextDayCalculator.NgayTiepTheo(day, month);
        System.out.println("Ngày tiếp theo là " + expected + "-" + (month+1));
        assertEquals(expected, result);
    }

    @Test
    public void ngayTiepTheo4() {
        int day = 28;
        int month = 2;
        int expected = 1;
        int result = NextDayCalculator.NgayTiepTheo(day, month);
        System.out.println("Ngày tiếp theo là " + expected + "-" + (month+1));
        assertEquals(expected, result);
    }

    @Test
    public void ngayTiepTheo5() {
        int day = 31;
        int month = 1;
        int expected = 1;
        int result = NextDayCalculator.NgayTiepTheo(day, month);
        System.out.println("Ngày tiếp theo là " + expected + "-" + (month+1));
        assertEquals(expected, result);
    }

    @Test
    public void ngayTiepTheo6() {
        int day = 30;
        int month = 5;
        int expected = 31;
        int result = NextDayCalculator.NgayTiepTheo(day, month);
        System.out.println("Ngày tiếp theo là " + expected + "-" + month);
        assertEquals(expected, result);
    }
}