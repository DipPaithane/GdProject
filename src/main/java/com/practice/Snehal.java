package com.practice;

import java.util.Arrays;

public class Snehal {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 34, 12, 34 };
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}

	}

}
