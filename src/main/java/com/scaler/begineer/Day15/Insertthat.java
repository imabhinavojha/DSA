package com.Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Insertthat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		ArrayList<Integer> numberOfElement = new ArrayList<Integer>();
		for (int i = 0; i < input; i++) {
			numberOfElement.add(sc.nextInt());
		}
		int index = sc.nextInt();
		int input2 = sc.nextInt();
		numberOfElement.add(--index, input2);
		for (Integer integer : numberOfElement) {
			System.out.print(integer+" ");
		}

	}

}
