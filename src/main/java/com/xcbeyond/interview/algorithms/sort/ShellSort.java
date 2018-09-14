package com.xcbeyond.interview.algorithms.sort;

import java.util.Arrays;

/**
 * 希尔排序：有步长的直接插入排序
 * @author xcbeyond
 * @date 2012-7-8 上午11:27:32
 */
public class ShellSort {
	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72} ;
		shellSort(a);

		System.out.println(Arrays.toString(a));
	}

	public static void shellSort(int[] array){
		int d =array.length;//步长
		int temp;

		while(true){
			d= d/2;

			for(int i=0;i<d;i++){
				for(int j=i+d;j<array.length;j+=d){
					int k=j-d;
					temp=array[j];
					for(;k>=0&&temp<array[k];k-=d){
						array[k+d]=array[k];
					}
					array[k+d]=temp;
				}
			}

			if(d==1)
				break;

		}
	}
}
