package com.Day17;

import java.util.ArrayList;

public class ArrayListCLass {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		al.ensureCapacity(5);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(2, 5);
		System.out.println(al);
		System.out.println(al.size());
		}
	
	static void IntegrClassDemo(){
		Integer x = 5;
		System.out.println(x.intValue());
	}

}
