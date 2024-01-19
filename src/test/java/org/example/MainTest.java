package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPrime() {
        int[] q = {17, 465, 7919};
        boolean[] a = {true, false, true};
        int i = 0;


        for (int nums : q) {
            assertEquals(a[i], Main.isPrime(nums));
            i++;

        }


    }

    @Test
    void primeFactors() {
        int[] num_l = {17, 15, 6893, -5};
        int[][] answers = {{}, {3, 5}, {61, 113}, {}};
        int i = 0;

        for (int nums : num_l) {
            ArrayList<Integer> an = Main.primeFactors(nums);
            for (int y = 0; y < an.size() && y < answers[i].length; y++) {
                assertEquals(answers[i][y], an.get(y));
            }
            i++;

        }
    }
}