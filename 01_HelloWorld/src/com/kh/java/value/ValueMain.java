package com.kh.java.value;

public class ValueMain {
	
	/**
	 * 자바프로그램은 클래스에 선언된 메서드를 연달하 호출하며 실행된다.
	 * 그리고 main 메서드가 그 시작과 끝이다.
	 * main 메서드의 모든 코드를 실행하면 프로그램은 종료된다는 것. 
	 * JVM이 main메서드를 호출.
	 */
	
	public static void main(String[] args) {
		System.out.println("시작");

		// 1. 객체(메모리 조각) 생성
		// 객체레시피: 클래스를 가지고 객체를 만드는데 문법은 아래와 같음
		// 클래스명 변수명 = new 클래스명;
		ValueMain main = new ValueMain();
 
		// 2. 객체로부터 객체의 메서드를 호출
		main.test1();
		main.test2();
		System.out.println();
		System.out.println("끝");
	}
	
	/**
	 * 자바의 값 literal
	 */
	public void test1( ) {
		System.out.println(123);
		System.out.println(123.45);
		System.out.println(1+2+3);
		System.out.println('ㅋ'); // '' -> 문자 char 한글자
		System.out.println(true); // 논리값(참/거짓)
		System.out.println(false); // 논리값(참/거짓)
	}
	
	public void test2() {
		System.out.println("장은성"); // "" -> 문자열 String 문자 0개 이상
	}
}
	






