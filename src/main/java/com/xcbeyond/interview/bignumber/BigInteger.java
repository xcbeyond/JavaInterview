package com.xcbeyond.interview.bignumber;

/**
 * 具体参考java.math.BigInteger类的源码
 * 功能如下：
 * 1、这个类内部有两个成员变量，一个表示符号，另一个用字节数组表示数值的二进制数
 * 2、有一个构造方法，把一个包含有多位数值的字符串转换到内部的符号和字节数组中
 * 3、提供加减乘除的功能
 *
 * @author xcbeyond
 * @date 2012-4-22 下午11:46:05
 */
public class BigInteger {
    private int sign;
    private byte[] val;

    public BigInteger(byte[] val) {

    }

    public BigInteger add(BigInteger other) {
        return other;
    }

    public BigInteger subtract(BigInteger other) {
        return other;
    }

    public BigInteger multiply(BigInteger other) {
        return other;
    }

    public BigInteger divide(BigInteger other) {
        return other;
    }
}