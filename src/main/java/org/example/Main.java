package org.example;

import java.util.ArrayList;

public class Main {
    public static boolean isPrime(int i) {

        ArrayList<Integer> factors = primeFactors(i);
        return factors.isEmpty();

    }

    public static ArrayList<Integer> primeFactors(int i) {

        if (i < 0) i *= -1;
        ArrayList<Integer> ret = new ArrayList<>();
        int cur = 2;

        while (i != 1 && cur != i) {
            if (i % cur == 0) {
                i /= cur;
                ret.add(cur);
                cur = 1;
            }
            cur ++;
        }
        return ret;
    }
}