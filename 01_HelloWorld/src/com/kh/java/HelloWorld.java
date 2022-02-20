package com.kh.java;

/**
 * javadoc 주석
 * 나중에 프로그램 설명문서를 만들 때 사용할 주석
 *
 * com.kh.java.HelloWorld 클래스의 원래이름
 * - com.kh.java 패키지
 * 		-> 패키지는 소문자 단어 단위로 잘라서 작성
 * 		-> if "Hello World"라고 쓰고 싶으면 hello.world라고 쓰는 것.
 * 		-> 자바 개발자들 사이의 암묵적인 룰
 * 		-> 패키지는 3레벨 이상 작성 (.으로 나뉘어지는 단어가 3개 이상)
 * 		-> 패키지를 고유하게 관리하기 위해 보통은 url을 뒤집어서 주로 사용
 * 		-> java로 시작하지 말것.
 * 
 * - HelloWorld 클래스명
 * 		-> 반드시 첫글자는 대문자로 시작할것. 
 * 		-> 연결되는 단어의 시작을 대문자로 쓸것. 
 */

public class HelloWorld {
	/* 
	 * 여러줄 주석
	 * 
	 */
	// 한줄 주석 Ctrl + / 실행되지 않는 구문
	public static void main(String[] args) {
//		System.out.println("Hello World~");
		System.out.println("Hello Eclipse~");
	}
}
