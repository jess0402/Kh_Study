package kh.java.condition;

import java.util.Scanner;

public class IfStudy {
	public static void main(String[] args) {
		IfStudy study = new IfStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	/**
	 * 조건문
	 * 
	 * 1. if(조건식){}
	 * 2. if(조건식){} else{}
	 * 3. if(조건식1){} else if(조건식2){} ...[else{}]
	 * 
	 */
	

	/**
	 * 중첩된 if문 
	 * 	- nested if문 
	 */
	public void test6() {
		
		int n = 84;
		String grade = "F";  
		
		if(n >= 90) {
			grade = "A";
			
			if(n >= 95) {
				grade += "+"; // grade = grade + "+"
			}
		}
		else if(n >= 80) {
			grade = "B";
			
			if(n >= 85) {
				grade += "+"; // grade = grade + "+"
			}
		}
		else if(n >= 70) {
			grade = "C";
			
			if(n >= 75) {
				grade += "+"; // grade = grade + "+"
			}
		}
		else if(n >= 60) {
			grade = "D";
			
			if(n >= 65) {
				grade += "+"; // grade = grade + "+"
			}
			
		}

		System.out.printf("점수 : %d, 학점: %s", n, grade);
		
	}
	
	
	/**
	 * - if.. else if 블럭
	 * 	- 맞는 조건을 찾으면 빠져나오기 때문에 multiple if 블럭보다 if..else if블럭이 성능이 더 좋음
	 * 	  (=더 효율적이다) 
	 * 
	 * - multiple if 블럭
	 * 
	 */
	public void test5() {
		int n = 100;
		char grade = ' ';  // char의 기본값
		
		if(n >= 90) {
			grade = 'A';
		}
		
		if(n >= 80 && n < 90) {
			grade = 'B';
		}
		
		if(n >= 70 && n < 80) {
			grade = 'C';
		}
		
		if(n >= 60 && n < 70) {
			grade = 'D';
		}
		
		System.out.printf("점수 : %d, 학점: %c", n, grade);
	}
	


	/**
	 * 나이를 입력받고, 연령대를 출력하세요.
	 * - 70~ : 노인
	 * - 40~ : 중년
	 * - 20~ : 젊은이
	 * - 14~ : 청소년
	 * - 어린이
	 */
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		String s = "";
		
		if(age >= 70) {
			s = "노인";
		}
		else if(age >= 40) {
			s = "중년";
		}
		else if(age >= 20 ) {
			s = "젊은이";
		}
		else if(age >= 14) {
			s = "청소년";	
		}
		else {
			s = "어린이";
		}
			
		System.out.printf("당신은 %s입니다.", s);
		
	}
	
	
	/**
	 * if(조건식1){ 1 } else if(조건식2){ 2 }...
	 * 	- 조건식1이 참인경우, 1 블럭 실행
	 * 	- 조건식1이 거짓인경우,
	 * 		- 조건식2가 참인 경우 2 블럭 실행
	 * 		- 조건식2가 거짓인 경우, 
	 * 				- 조건식3이 참인 경우,....
	 * 
	 * A : 90 ~ 100
	 * B : 80 ~ 89
	 * C : 70 ~ 79
	 * D : 60 ~ 69
	 * F : ~ 59
	 *
	 */
	public void test3() {
		
		
		int n = 30;
		char grade = ' ';  // char의 기본값
		
		if(n >= 90) {
			grade = 'A';
		}
		else if(n >= 80) {
			grade = 'B';
		}
		else if(n >= 70) {
			grade = 'C';
		}
		else if(n >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("점수 : %d, 학점: %c", n, grade);
	}
	
	
	
	/**
	 * if(){} else {}
	 * 	- 참인 경우, if블럭 실행
	 * 	- 거짓인 경우, else 블럭 실행
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		if((a % 2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

	/**
	 * if(){}
	 * 	- 참인 경우, if블럭 실행,
	 * 	- 거짓인 경우, if블럭 그냥 통과
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("참참참!");
		}
		System.out.println("test1 끝!");
	}
}
