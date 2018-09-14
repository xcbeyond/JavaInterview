package com.xcbeyond.interview.algorithms.sort;
/**
 * 插入排序
 * @author xcbeyond
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72} ;
		int i;
		int j;

		for(i = 0;i<a.length;i++)
			System.out.print(a[i]+"  ");
		System.out.println();

		insertSort(a);

		for(i = 0;i<a.length;i++)
			System.out.print(a[i]+"  ");
	}

	public static void insertSort(int[] array) {
		for(int i = 1; i<array.length;i++) {
			int temp = array[i];
			int j;
			for(j = i-1;j>=0;j--) {
				if(temp<array[j])
					array[j+1] = array[j];
				else
					break;//找到插入的位置了
			}
			array[j+1] = temp;
		}
	}

}
