package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calcTest() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTest1() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(100, 300);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTest2() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(1000, 3000);
        int expected = 23;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTest3() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(9801, 10001);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

}