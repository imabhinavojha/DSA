package com.Day9;


import java.util.Scanner;

public class easyPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power = power * base;
		}
		System.out.println(power);
	}

}
