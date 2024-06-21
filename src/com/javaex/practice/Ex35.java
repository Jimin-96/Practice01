package com.javaex.practice;


public class Ex35 {

	public static void main(String[] args) {
		
//		long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
//		(단 빛의 속도는 300000 km/s 로 계산한다)
		
		long speed = 300000;
		long y = 31536000l;
		
		System.out.println("빛이 1년동안 가는거리는 "+(speed*y)+"km 입니다.");
		
		
	}
}