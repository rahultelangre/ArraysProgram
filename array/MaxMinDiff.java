package com.nt.array;

public class MaxMinDiff {
	public static void main(String[] args) {
		
		int arr[]= {1,2,7,4,5,8};
		int a=arr[0];
		int b=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
			else if(arr[i]<b) {
				b=arr[i];
			}
		}
		System.out.println("maximum  ::"+a);
		System.out.println("minimum  ::"+b);
		System.out.println(a-b+"::  diffrence between a and b");
	}

}
