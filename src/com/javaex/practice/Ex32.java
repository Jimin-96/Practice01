package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
//		사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로:");
		double whid = sc.nextDouble();
		System.out.print("세로:");
		double higt = sc.nextDouble();
		System.out.println("삼각형의 넓이는:"+ ((double)whid*higt/2) +"입니다.");
		
		sc.close();
	}
}