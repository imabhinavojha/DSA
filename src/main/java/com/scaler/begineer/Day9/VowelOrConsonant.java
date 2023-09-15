package com.Day9;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		VowelOrConsonant pi = new VowelOrConsonant();
		pi.vowelOrConsonant(input);

	}

	public void vowelOrConsonant(char input) {
		if (input=='a'||input=='e'||input=='i'||input=='o'||input=='u') {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		

	}

}
