package com.forth;

public class CC1Solution {
    public static int solution(int[] x, int[] y) {
        int out = 0;
        int lLength = 0;
        int[] testA;
        int[] testB;
        int testInt = 0;
        if (x.length > y.length) {
            lLength = x.length;
            testA = x;
            testB = y;
        } else {
            lLength = y.length;
            testA = y;
            testB = x;
        }
        for (int i = 0; i < testA.length; i++) {
            for (int j = 0; j < testB.length; j++) {
                testInt = testA[i];
                if (testA[i] == testB[j]) {
                    break;
                }
                if (j == testB.length - 1 && testA[i] != testB[j]) {
                    out = testA[i];
                }
            }

        }
        return out;
    }
}







