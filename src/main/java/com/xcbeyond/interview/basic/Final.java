package com.xcbeyond.interview.basic;
/**
 * 1、final修饰的变量，其引用变量是不可以改变的，而其引用变量指向对象的内容却是可以改变哦！正如此笔试题所述。
 * 2、final 修饰的类，不能再被继承。
 *		Java 的String就是final类，不能被继承！Math 也是final类
 *		在实际项目开发中，原则上不允许使用final类！如：Spring,Hibernate,Struts 2,这些框架经常动态代理（动态继承）
 *   技术。使用final的类可以造成这些框架的工作问题。
 *  3、final修饰的方法，不能再被覆盖。
 *	 	在实际项目开发中，原则上不允许使用final方法！
 *  4、final修饰的变量，初始化以后不允许再修改。
 *  5、final static ， java使用final static 修饰的变量作为一般要求变量名都有大写字母。
 * @author xcbeyond
 * @date 2012-5-4 上午12:19:35
 */
public class Final {
	public static void main(String[] args) {
		final StringBuffer s = new StringBuffer("xcbeyond");
		//s = new StringBuffer("xcbeyond1");//错误，此时引用变量s已经被改变了
		s.append("hello!");//正确，此时是改变了引用变量指向对象的内容，这是可以的

	}

}