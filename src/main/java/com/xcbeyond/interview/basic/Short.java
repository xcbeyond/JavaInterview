package com.xcbeyond.interview.basic;
/**
 * i = i+1和i +=1是完全不同的哦！
 * 一个使用简单赋值运算，一个使用复合赋值运算 ，
 * 	其差别在于：复合赋值运算会自动地将运算结果转换为左操作数的类型
 * @author xcbeyond
 * @date 2012-4-10 上午11:19:35
 */
public class Short {
	public static void main(String[] args) {
		short i = 1;
		//i = i+1;  //i+1运算后的类型为int，int->short无法自动类型转换

		short j = 1;
		j+=1;//i = i+1;和i+=1;是不同的！一个使用简单赋值运算，一个使用复合赋值运算 ，
		//其差别在于：复合赋值运算会自动地将运算结果转换为左操作数的类型

	}
}