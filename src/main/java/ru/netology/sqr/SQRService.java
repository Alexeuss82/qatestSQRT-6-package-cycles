package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int minLim, int maxLim) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLim) {
                if (i * i <= maxLim) {
                    result++;
                }
            }

        }
        return result;
    }
}
