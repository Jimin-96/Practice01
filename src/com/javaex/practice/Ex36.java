package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
//		동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int c500 = 500;
		int c100 = 100;
		int c50 = 50;
		int c10 = 10;
		
		System.out.print("500원 갯수:");
		int coin1 = sc.nextInt();
		System.out.print("100원 갯수:");
		int coin2 = sc.nextInt();
		System.out.print("50원 갯수:");
		int coin3 = sc.nextInt();
		System.out.print("10원 갯수:");
		int coin4 = sc.nextInt();
		
		int a50 = coin1*c500;
		int a10 = coin2*c100;
		int a5 = coin3*c50;
		int a1 = coin4*c10;
		
		System.out.println("동전의 총합은 "+(a50+a10+a5+a1)+"입니다.");
		
		sc.close();
		
		
	}
}