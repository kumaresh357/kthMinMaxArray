package kthMinMaxArray;

import java.util.Scanner;

public class KthMinMax {
	
	public static void kthMinMaxElement(int arr[], int size, int k) {
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i==k-1) {
				System.out.println("the kth maximum element of array is");
				System.out.println(arr[i]);
				break;	
			}
		}
		for(int i=size-1; i>=1; i--) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i==size-k) {
				System.out.println("the kth minimum element of array is");
				System.out.println(arr[i]);
				break;
			}	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the kth element");
		int k = sc.nextInt();
		if(k>size) {
			System.out.println("value entered for kth term in greater than array size\nplease enter correct value");
		}
		else {
		System.out.println("enter each element of the array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("provided array is");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		KthMinMax.kthMinMaxElement(arr, size, k);
		}
		sc.close();
	}
}
