package com.xcbeyond.interview.basic;
/**
 * 腾讯笔试题（单选项题）              稍不留神便会出错
 * @author xcbeyond
 * @date 2012-5-18 下午06:58:31
 */
public class Split {
	public static void main(String[] args) {
		String[] s = "|DF|A".split("|");
		System.out.println("|DF|A".split("|").length);//6
		for (String str : s) {
			System.out.println(str);
		}
	}
}
