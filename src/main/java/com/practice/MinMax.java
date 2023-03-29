package com.practice;

public class MinMax {
	public static void main(String[] args) {

		int a[] = { 5, 2, 30, 10, 6 };
		int max = 30;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max no." + max);
		System.out.println("------------------------------------------------------------------------------");
		int min = 10;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("min no." + min);
		System.out.println("--------------------------------------------------------------------------------");

		

	}

}
