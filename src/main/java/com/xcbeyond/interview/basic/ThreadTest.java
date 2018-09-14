package com.xcbeyond.interview.basic;


public class ThreadTest {
	public static void main(String[] args) {
		MyThread myThread  =  new MyThread();
		MyRunnable myRunnable = new MyRunnable();
		Thread thread  =  new Thread(myRunnable);
		myThread.start();
		thread.start();
	}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread: run()");
	}
	public void start(){
		System.out.println("MyThread: start()");
	}

}
class MyRunnable implements Runnable{
	public void run(){
		System.out.println("MyRunnable: run()");
	}
	public void start(){
		System.out.println("MyRunnable: start()");
	}
}
