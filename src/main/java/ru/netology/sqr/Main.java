package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int minLim = 200;
        int minMax = 300;
        SQRService service = new SQRService();
        System.out.println("Квадратных корней чисел от 10 до 99 в диапазоне " + minLim +"-" + minMax + " будет " + service.calcSqrt(200, 300));

    }
}
