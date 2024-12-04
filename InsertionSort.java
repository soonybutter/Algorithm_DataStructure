package com.test05.sort;

public class InsertionSort {

	public static void main(String[] args) {
		
		int [] arr= {6,4,1,7,3,9,8};
		
		insertSort(arr,arr.length);
		

		System.out.println("오름차순 정렬 - 삽입정렬");
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void insertSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp= a[i];
			for(j=i; j>0&&a[j-1]>tmp; j--) {
				a[j] = a[j-1];
			}
			
			a[j]=tmp;
		}
	}

}
