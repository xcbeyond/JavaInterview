package com.xcbeyond.interview.basic;

/**
 * 在JAVA中如何跳出当前的多重嵌套循环？
 * @author xcbeyond
 * @date 2012-4-10 上午01:08:04
 */
public class Break {
	public static void main(String[] args) {
		//在二维数组中查找一个数
		int arr[][] = {{1,2,3},{3,5,6},{7,8,9}};

		//方法一：break直接跳转到标记处,（不建议的使用）
		ok:
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.println("j="+j);
				if(arr[i][j]==3) {
					System.out.println("这个数"+arr[i][j]+"找到了 ");
					break ok;

				}
			}
		}

		//方法二：
		boolean found = false;
		for(int i = 0;i<arr.length&&!found;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.println("j="+j);
				if(arr[i][j]==3){
					System.out.println("这个数"+arr[i][j]+"找到了 ");
					found = true;
					break;
				}
			}
		}

	}
}
