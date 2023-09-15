package com.Day17;

public class CountswapsinBubbleSortII {

	public static void main(String[] args) {
		int num = 24;
		int time1 = (int) System.nanoTime();
		for (int i = 1; i*i <= num ; i++) {
			System.out.print(i+" ");
		}
		int time2 = (int) System.nanoTime();
		System.out.println("Time 1");
		System.out.println(time2-time1);
		
		int time3 = (int) System.nanoTime();
		for (int i = 1; i <= num ; i++) {
			System.out.print(i+" ");
		}
		int time4 = (int) System.nanoTime();
		System.out.println("Time 2");
		System.out.println(time4-time3);
	}

}
