package com.Day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangesinReverse {

	public static void main(String[] args) {
		ChangesinReverse CIR = new ChangesinReverse();
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.println(CIR.countRev(string));

	}

	public int countRev(String A) {
		StringBuilder sb = new StringBuilder(A);
		sb.reverse();
		int len = 0;
		String rev = sb.toString();

		if (A.equals(rev)) {
			return 0;
		} else {
			return sb.length();
		}
	}

}
