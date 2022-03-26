package kh.java.basic.method;

import java.util.Scanner;

public class MethodStudy {
	public static void main(String[] args) {
		// static : 객체를 생성하지 않고, 클래스명으로 호출
//		MethodStudy.test1();
		
		// non-static : 객체를 생성 후, 객체로부터 호출 (그객체변수명.메서드();)
//		MethodStudy.test2() // non-static이므로 이렇게 할 수 없음
		MethodStudy study = new MethodStudy();
//		study.test2();
		
//		study.test3();	// method call/invokation = 메서드 호출
//		study.test4();
		
		study.test5();
		
	}
	
	public void test5() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int n1 = sc.nextInt();
//		System.out.print("정수 입력: ");
//		int n2 = sc.nextInt();
//		System.out.print("정수 입력: ");
//		int n3 = sc.nextInt();
		
		int n1 = getUserInput(1);
		int n2 = getUserInput(2);
		int n3 = getUserInput(3);
		
		System.out.printf("%d + %d + %d = %d%n", n1, n2, n3, n1 + n2 + n3);
	}
	
	// 리턴값이 있기 때문에 void 자리에 int가 들어감
	public int getUserInput(int ntn) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 %d 입력: ", ntn);
		int n = sc.nextInt();
		return n;
		
	}
	
	
	/**
	 * 메소드 시그니처 : 접근제한자 static 리턴타입 메서드명(매개변수명)
	 * 
	 * - 매개변수 유무
	 * - 리턴값 유무
	 */
	public void test3() {  // method declaration = 메서드 선언
		// 데이터 할당부
		String name = "홍길동";
		int age = 33;
		
		// 데이터 출력부
//		System.out.printf("안녕하세요, 저는 %s입니다. 나이는 %d살이에요.%n", name, age);
		printPerson(name, age);
		
		return; // 리턴타입 void는 return시에 가져가는 값이 없다.
	}
	
	public void test4() {
		// 데이터 할당부
		String name = "신사임당";
		int age = 48;
		
		// 데이터 출력부
//		System.out.printf("안녕하세요, 저는 %s입니다. 나이는 %d살이에요.%n", name, age);
		printPerson(name, age);  // 메소드 호출시 매개인자(값)을 전달.
	}	
	// test3과 test4는 중복된 부분이 있음(=데이터 출력부)
	
	/**
	 * 변수 : 선언 -> 값대입 -> 사용
	 * 
	 * 매개변수(메소드 선언부; parameter) 
	 * - 메소드 호출시에 값(매개인자; argument)이 대입된다.
	 * - 매개변수는 공간 매개인자는 값
	 */
	
	public void printPerson(String name, int age) {
		System.out.printf("안녕하세요, 저는 %s입니다. 나이는 %d살이에요.%n", name, age);
		return; // void는 리턴값은 없지만 리턴은 일어난다. 호출부로 다시 돌아가는 것. 
	}
	
	
	
	
	public void test2() { // non-static
		System.out.println("non-staticccccccccccccccccc!");		
		
	}
	
	public static void test1() { // static 
		System.out.println("staticccccccccccccccccccccc!");
		
	}

}
