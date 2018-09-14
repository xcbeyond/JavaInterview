package com.xcbeyond.interview.algorithms.sort;

import java.util.Arrays;

/**
 * 归并排序
 * @author xcbeyond
 * @date 2012-6-21 上午11:33:15
 */
public class mergeSort {
	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72} ;
		mergeSort(a,0,a.length-1);

		System.out.println(Arrays.toString(a));
	}
	/**
	 * 归并排序
	 * @param array
	 * @param first 数组起始下标
	 * @param last 数组末尾下标
	 */
	public static void mergeSort(int[] array,int first,int last) {
		if(first<last) {
			int mid = (first+last)/2;
			mergeSort(array,first,mid);
			mergeSort(array,mid+1,last);
			merge(array,first,mid,last);
		}
	}
	private static void merge(int[] array, int first, int mid, int last) {
		int[] tempArray = new int[array.length];
		int first1 = first;
		int last1 = mid;
		int first2 = mid + 1;
		int last2 = last;

		int index  = first;

		while((first1<=last1) && (first2 <= last2)) {
			if(array[first1]<array[first2]) {
				tempArray[index] = array[first1];
				first1 ++ ;
			}
			else {
				tempArray[index] = array[first2];
				first2 ++ ;
			}
			index++;
		}

		while(first1<=last1) {
			tempArray[index] = array[first1];
			first1++;
			index++;
		}
		while(first2<=last2) {
			tempArray[index] = array[first2];
			first2++;
			index++;
		}

		for (index = first; index <= last; index++) {
			array[index] = tempArray[index];
		}

	}

}
