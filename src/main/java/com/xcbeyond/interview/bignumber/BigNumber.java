package com.xcbeyond.interview.bignumber;

/**
 * 大数运算：采用数组实现
 *
 * @author xcbeyond
 * @date 2012-4-27 上午09:20:32
 */
public class BigNumber {
    public static void main(String[] args) {
        int[] a = {1234, 5678, 9910, 1923, 1124};
        int[] b = {1234, 5678, 9910, 1923, 1124};
        int[] c = BigNumber.add(a, b);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    //加法
    public static int[] add(int[] a, int[] b) {
        int carry = 0;
        int[] c = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            c[i] = a[i] + b[i] + carry;
            if (c[i] < 10000)
                carry = 0;
            else { // 进位
                c[i] -= 10000;
                carry = 1;
            }
        }
        return c;
    }

    //减法
    public static int[] subtract(int[] a, int[] b) {
        int borrow = 0;
        int[] c = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            c[i] = a[i] - b[i] - borrow;
            if (c[i] >= 0)
                borrow = 0;
            else { // 借位
                c[i] += 10000;
                borrow = 1;
            }
        }
        return c;
    }

    //乘法
    public static int[] multiply(int[] a, int b) {// b 位乘数
        int carry = 0;
        int[] c = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int tmp = a[i] * b + carry;
            c[i] = tmp % 10000;
            carry = tmp / 10000;
        }
        return c;
    }

    //除法
    public static int[] divide(int[] a, int b) {  // b 为除数
        int remain = 0;
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i] + remain;
            c[i] = tmp / b;
            remain = (tmp % b) * 10000;
        }
        return c;
    }
}
