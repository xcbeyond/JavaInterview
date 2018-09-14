package com.xcbeyond.interview.algorithms.sort;
/**
 * 冒泡排序 算法
 * @author xcbeyond
 *
 */

public class BubbleSort {

	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72} ;
		int i = 0;
		int j = 0;

		for(i=0;i<10;i++)
			System.out.print(a[i]+"  ");
		System.out.println();

		bubbleSort(a);

		for(i=0;i<10;i++)
			System.out.print(a[i]+"  ");

	}
	/**
	 *
	 * @param array  排序数组
	 * @param size  数组大小
	 */
	public static void bubbleSort(int[] array) {
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array.length - i -1;j++) {
				if(array[j]>array[j+1]) {
					int temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

}
