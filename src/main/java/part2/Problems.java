package part2;
import java.util.*;

public class Problems {


    private static int get_length(int[]nums) {
        int result = 0;
        for (int i : nums) result += 1;
        return result;
    }


    public static int[] problem1(int[]nums, int target) {
        int[] result = {0, 0};
        int len = get_length(nums);

        int i = 0;
        int stagger = 1;

        while (stagger < len) {
            if (nums[i] + nums[(i+stagger)%len] == target) {
                result[0] = i;
                result[1] = i+stagger%len;
                break;
            }
            i++;
            if (i + stagger - 1 == len) {
                i = 0;
                stagger += 1;
            }
        }

        return result;
    }



    public static boolean  problem2(int x) {
        String x_s = Integer.toString(x);
        int front = 0;
        int back = x_s.length() - 1;
        while (front < back) {
            if (x_s.charAt(front) != x_s.charAt(back)) return false;
            front++;
            back--;
        }
        return true;
    }


    public static String problem3(String[] prefixify) {
        String result = "";
        int i = 0;
        outer: while (true) {
            if (prefixify.length == 0 || prefixify[0].length() == i) break;
            char comp = prefixify[0].charAt(i);

            for (String a : prefixify) {
                if (a.length() == i) break outer;
                if (a.charAt(i) != comp) break outer;


            }
            result = result.concat(Character.toString(comp));
            i++;

        }
        return result;
    }

    public static int problem4(String nums) {
        int result = 0;
        HashMap<Character, Integer> k = new HashMap<>();
        k.put('I', 1);
        k.put('V', 5);
        k.put('X', 10);
        k.put('L', 50);
        k.put('C', 100);
        k.put('D', 500);
        k.put('M', 1000);
        char last = nums.charAt(0);

        for (int i = 0; i < nums.length(); i++) {
            char cur = nums.charAt(i);

            result += k.get(nums.charAt(i));



            if (last == 'I' && cur == 'V') {
                result -= 2;
            }
            if (last == 'I' && cur == 'X') {
                result -= 2;
            }
            if (last == 'X' && cur == 'L') {
                result -= 20;
            }
            if (last == 'X' && cur == 'C') {
                result -= 20;
            }
            if (last == 'C' && cur == 'D') {
                result -= 200;
            }
            if (last == 'C' && cur == 'M') {
                result -= 200;
            }
            last = cur;
        }


        return result;
    }

    public static boolean problem5(String nums) {
        HashMap<Character, Character> k = new HashMap<>();
        k.put('(', ')');
        k.put('[', ']');
        k.put('{', '}');
        Stack<Character> p = new Stack<>();

        for (int i = 0; i < nums.length(); i++) {
            char cur = nums.charAt(i);
            if (cur != '(' && cur != '[' && cur != '{') {
                if (p.isEmpty() || cur != p.pop()) return false;
            } else {
                p.push(k.get(cur));
            }
        }
        return p.isEmpty();
    }



    public static int[] problem6(int[] nums, int[] ints) {
        int[] result = new int[nums.length + ints.length];
        int i1 = 0;
        int i2 = 0;
        int i_true = 0;
        while (i1 < nums.length || i2 < ints.length) {
            if (i1 == nums.length) {
                while (i2 < ints.length) {
                    result[i_true] = ints[i2];
                    i_true++;
                    i2++;
                }
                break;
            }
            if (i2 == ints.length) {
                while (i1 < nums.length) {
                    result[i_true] = nums[i1];
                    i_true++;
                    i1++;
                }
                break;
            }

            if(nums[i1] < ints[i2]) {
                result[i_true] = nums[i1];
                i1++;
            } else {
                result[i_true] = ints[i2];
                i2++;
            }
            i_true++;
        }
        return result;
    }

    public static int[] problem7(int[] nums) {
        int initial = 0;
        int place = 1;
        int size = 0;
        for (int n : nums) {
            initial *= 10;
            initial += n;
            place *= 10;
        }
        while (place != 1) {
            size++;
            place /= 10;
        }

        initial ++;

        int [] result;
        if (initial % 10 == 0) {
            size++;
        }
        result = new int[size];

        while (size != 0) {
            size--;
            result[size] = initial % 10;
            initial = initial / 10;
        }

        return result;
    }
}

