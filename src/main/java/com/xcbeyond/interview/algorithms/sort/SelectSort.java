package com.xcbeyond.interview.algorithms.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author xcbeyond
 *
 */
public class SelectSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={13,15,37,89,60,39,12,109,56,72};

		selectSort(a);

		String s = Arrays.toString(a);
		System.out.print(s);
	}

	public static void selectSort(int[] array) {
		for(int i = 0;i<array.length;i++) {
			int min = array[i];
			for(int j = i+1;j<array.length;j++) {
				if(min>array[j]) {
					int temp;
					temp = min;
					min = array[j];
					array[j] = temp;
				}
			}
			array[i] = min;
		}
	}
}
