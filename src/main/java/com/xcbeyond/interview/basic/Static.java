package com.xcbeyond.interview.basic;
/**
 * static
 * @author xcbeyond
 * @date 2012-5-8 下午07:51:34
 */
public class Static {
	public static void main(String[] args) {

	}

	public static void method1() {
		//method2(); //错     不可以从一个static方法内部发出对非static方法的调用
		/**
		 * 因为非static方法是要与对象关联在一起的，必须创建一个对象后，才可以在该对象上进行方法调用，
		 * 而static方法调用时不需要创建对象，可以直接调用。
		 */
		System.out.println("静态方法！");
	}
	public void method2() {
		method1();//实际上等同于Static.method1();
		System.out.println("非静态方法！");
	}
}