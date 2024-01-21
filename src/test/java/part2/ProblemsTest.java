package part2;



import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemsTest {

@Test
    public void test() {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();

    }


    public static void q1() {
        int[][] num_l = {{2, 7, 11, 15}, {3, 2, 4}, {3, 4}, {2, 0, 1, 5, 3}};
        int[] target = {9, 6, 7, 4};
        int[][] answers = {{0,1}, {1, 2}, {0, 1}, {2, 4}};
        int i = 0;

        for (int[] nums : num_l) {
            assert(Problems.problem1(nums, target[i])[0] == answers[i][0] &&
                    Problems.problem1(nums, target[i])[1] == answers[i][1]);

            i++;

        }

    }


    public static void q2() {
        int[] q = {121, -121, 10, 90809, 9999, 0};
        boolean[] a = {true, false, false, true, true, true};
        int i = 0;


        for (int nums : q) {
            assert(Problems.problem2(nums) == a[i]);

            i++;

        }

    }


    public static void q3() {
        String[][] q = {{"flower", "flow", "flight"},
                {"dog", "racecar", "car"}, {"plow"}, {}};
        String[] a = {"fl", "", "plow", ""};
        int i = 0;


        for (String[] nums : q) {
            String res = Problems.problem3(nums);
            assert(res.equals(a[i]));

            i++;

        }

    }


    public static void q4() {
        String[] q = {"III", "LVIII", "MCMXCIV", "XL", "CM"};
        int[] a = {3, 58, 1994, 40, 900};
        int i = 0;


        for (String nums : q) {
            int res = Problems.problem4(nums);
            assert(res == a[i]);

            i++;

        }

    }


    public static void q5() {
        String[] q = {"()", "()[]{}", "(]", "({[})]", "({[]})"};
        boolean[] a = {true, true, false, false, true};
        int i = 0;


        for (String nums : q) {
            boolean ans = Problems.problem5(nums);
            assert(ans == a[i]);

            i++;

        }

    }


    public static void q6() {
        int[][] q1 = {{1,2,4}, {}, {}};
        int[][] q2 = {{1,3,4}, {}, {0}};
        int[][] a = {{1,1,2,3,4,4}, {}, {0}};


        for (int i = 0; i < q1.length; i++) {
            int[] ans = Problems.problem6(q1[i], q2[i]);
            for (int j = 0; j < ans.length; j++) {
                assert(ans[j] == a[i][j]);
            }
            assert(ans.length == a[i].length);


        }

    }


    public static void q7() {
        int[][] q = {{1,2,3}, {4,3,2,1}, {9}, {9,9,9,9}};
        int[][] a = {{1, 2, 4},{4,3,2,2}, {1,0}, {1,0,0,0,0}};


        for (int i = 0; i < q.length; i++) {
            int[] ans = Problems.problem7(q[i]);
            for (int j = 0; j < ans.length; j++) {
                assert(ans[j] == a[i][j]);
            }
            assert(ans.length == a[i].length);

        }

    }
}
