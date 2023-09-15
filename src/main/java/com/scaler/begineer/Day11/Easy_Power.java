package com.Day11;

import java.util.Scanner;

public class Easy_Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int e = sc.nextInt();
		int p = 1;
		for (int i = 1; i <= e; i++) {
			p = p * b;
		}
		System.out.println(p);

	}

}
