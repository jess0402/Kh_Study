package com.kh.java.print;

public class PrintMain {
	public static void main(String[] args) {
		PrintMain main = new PrintMain();
		main.test1();
		main.test2();
		
	}
	
	/**
	 * System.out.println() - 내용 출력 후 개행처리(행을 바꿈)
	 * System.out.print() - 내용 출력 (개행처리 없음)
	 * 개행처리 해주고 싶으면 \n 해주면 됨.
	 * 
	 * escaping 문자: 인쇄되지 않고, 키보드로 표현불가한 문자
	 * \ + 문자 
	 * \n : 개행
	 * \t : 탭
	 * \\ : 역슬래시문자출력
	 * \" : 쌍따옴표 출력
	 */
	
	public void test1() {
		System.out.print("안녕\n\n");
		System.out.print("\t잘가\n");
		System.out.print("배고프니\n");
		System.out.print("\\");
		System.out.println("철수가 내게 \"안녕\"이라고 말했음.");
		System.out.println("C:\\Users\\jes\\Desktop\\각종문서");
	}

	public void test2() {
		System.out.print("\t\"ShakeIt 알람\"\t\n---------------------------------------------------------------\n\t흔들기\t쏴리질러\t터치하기\t원터치\n---------------------------------------------------------------\n홍길동\n\t\"신사임당\"\n\t\t세종대왕");
		
		
	}
}
