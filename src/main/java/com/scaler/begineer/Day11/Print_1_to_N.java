package com.Day11;

import java.util.Scanner;

public class Print_1_to_N {

	static int n = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		fun1(N);

	}

	// Prints n, increments n and calls fun1()
	static void fun1(int N) {
		if (n <= N) {
			System.out.printf("%d ", n);
			n++;
			fun2(N);
		} else {
			return;
		}
	}

	// Prints n, increments n and calls fun2()
	static void fun2(int N) {
		if (n <= N) {
			System.out.printf("%d ", n);
			n++;
			fun1(N);
		} else {
			return;
		}
	}

}
