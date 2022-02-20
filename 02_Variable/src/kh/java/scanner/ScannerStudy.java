package kh.java.scanner;

import java.util.Scanner;

public class ScannerStudy {
	public static void main(String[] args) {
		ScannerStudy study = new ScannerStudy();
		study.test1();
	}

	/**
	 * scanner는 사용자 입력값을 받아오는데, 두 가지 계열이 있음.
	 * 1. next | nextInt | nextDouble | nextBoolean...
	 * - 자료형 변환기능이 있는 메서드 모두
	 * - 입력버퍼에서 실제 문자열 이전에 만나는 공백/개행문자는 무시하고,
	 *   실제 문자열 이후 공백/개행문자 전까지 읽어서 반환한다.
	 * 
	 * 2. nextLine
	 * - 입력버퍼에서 개행문자까지 읽어온 후, 개행문자를 제외하고 반환한다.  
	 * 
	 */
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next(); // 사용자입력값 문자열을 name변수에 담아라
		
		// 사용자입력은 무조건 문자열이다. 123을 입력해도 "123"인 것.
		// 그런데 scanner는 적절한 타입으로 변환해서 값을 리턴한다.
//		System.out.print("나이: ");
//		int age = sc.nextInt();  // 사용자의 숫자입력을 int로 변환해서 값을 주게 됨. 
//		
//		System.out.print("키(예: 165.5): ");
//		double height = sc.nextDouble();
//	
//		System.out.print("결혼여부(true|false) : ");
//		boolean married = sc.nextBoolean();
//		
		System.out.print("성별(남|여) : ");
		String temp = sc.next();
		char gender =temp.charAt(0); // 문자열 메소드 charAt(번지수)

//		sc.nextLine();  // 남아있는 개행문자 버리기용
//		System.out.print("주소를 입력하세요 : ");
//		String addr = sc.nextLine();  // 공백이 포함된 문자열 입력받을 때
		
//		System.out.printf("반갑습니다. %s님!%n", name);
//		System.out.printf("당신은 %d살입니다.%n", age);
//		System.out.printf("당신의 키는 %.2fcm입니다.%n", height);
//		System.out.printf("결혼여부는 %b입니다.%n", married);
		System.out.printf("당신은 %c자입니다. %n", gender);
//		System.out.printf("주소는 [%s]입니다.%n", addr);
		
		
	}
}
