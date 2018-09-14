package com.xcbeyond.interview.algorithms.sort;

import java.util.Arrays;

/**
 * 快速排序
 * @author xcbeyond
 * @date 2012-6-21 上午12:33:15
 */
public class QuickSort {
	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72} ;
		quickSort(a,0,a.length-1);

		System.out.println(Arrays.toString(a));
	}
	/**
	 * 快速排序
	 * @param array
	 * @param first
	 * @param last
	 */
	public static void quickSort(int[] array,int first,int last) {
		int pIndex ;
		if(first<last) {
			pIndex = partition(array,first,last);//“基准”值位置

			quickSort(array,first,pIndex-1);
			quickSort(array,pIndex+1,last);
		}
	}
	/**
	 * 一次划分，找到基准的位置
	 * @param array
	 * @param first
	 * @param last
	 * @return  基准的位置
	 */
	private static int partition(int[] array,int first,int last) {
		int p =array[first];

		while(first<last) {
			while(first<last && array[last]>=p)
				last--;
			array[first] = array[last];

			while(first<last && array[first]<=p)
				first++;
			array[last] = array[first];
		}
		array[first] = p;
		return first;
	}

}
