package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
//		상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격:");
		int item = sc.nextInt();
		System.out.print("받은가격:");
		int total = sc.nextInt();
		System.out.println("받은돈:"+total);
		System.out.println("상품가격:"+item);
		System.out.println("부가세:"+item/10);
		System.out.println("잔돈:"+(total-item));
		
		sc.close();
		
	}
}