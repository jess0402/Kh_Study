package kh.java.loop;

import java.util.Scanner;

import com.kh.test.condition.RockSciPaper;

import kh.java.condition.SwitchStudy;
import kh.java.random.number.RandomStudy;

public class WhileLoopStudy {
	public static void main(String[] args) {
		WhileLoopStudy study = new WhileLoopStudy();
//		study.test1();
//		study.test2();
		study.test3();
		study.test3_();
//		study.test4();
//		study.test5();
//		study.test6();
		
	}
	
	
	/**
	 * 다단 메뉴 구성(여러 단계의 메뉴 구성하기)
	 */
	public void test6() {
		Scanner sc= new Scanner(System.in);
		String menu = "======= 메인 메뉴 =======\n"
					+ "1. 음식주문\n"
					+ "2. 게임\n"
					+ "0. 종료\n"
					+ "------------------------\n"
					+ "입력 : ";
		 do {
			 // 메뉴 노출 및 선택
			 System.out.print(menu);
			 String choice = sc.next();
			 
			 // 메뉴 선택에 따른 분기
			 switch(choice) {
			 case "1": foodMenu(); break;
			 case "2": gameMenu(); break;
			 case "0": System.out.println("이용해주셔서 감사합니다."); return;
			 default : System.out.println("잘못 입력하셨습니다.");
			 }
			 
		 } while(true);
		
	}
	
	/**
	 * 1. 한식 SwitchStudy#test2
	 * 2. 분식 ForLoopStudy#test4
	 */
	public void foodMenu() {
		Scanner sc = new Scanner(System.in);
		String menu = "========= 음식 메뉴 =========\n"
					+ " 1. 한식\n"
					+ " 2. 분식\n"
					+ " 0. 음식메뉴 종료\n"
					+ " 입력: ";
		do {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1" : 
				SwitchStudy food1 = new SwitchStudy();
				food1.test2();
				break;
			case "2" : 
				ForLoopStudy food2 = new ForLoopStudy();
				food2.test4();
				break;
			case "0" : 
				return; // test6의 foodMenu 호출코드로 리턴
			default : 
				System.out.println("잘못 선택하셨습니다."); 
			}
			
		} while(true);
		
	}
	
	public void gameMenu() {
		Scanner sc = new Scanner(System.in);
		String menu = "----------게임메뉴----------\n"
					+ "1. 가위바위보\n"
					+ "2. 동전게임\n"
					+ "0. 게임종료\n"
					+ "--------------------------\n"
					+ "입력 : ";
		
		do {
			System.out.println(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1" : 
				RockSciPaper r = new RockSciPaper();
				r.game();
				break;
			case "2" : 
				RandomStudy r2 = new RandomStudy();
				r2.test3();
				break;
			case "0" : 
				return;
			default : 
				System.out.println("잘못 입력하셨습니다.");
			}
			
		} while(true);
	}
	
	/**
	 * do ~ while문
	 * 	- while문 실행순서 : 조건식 - 실행코드
	 * 	- do while문 실행순서 : 실행코드 - 조건식
	 *  - do while은 무조건 한번은 실행이 되고, 그 다음에 조건식으로 가서 반복할지말지 정해진다. 
	 *  
	 *  - while문과 do while 문은 조건식을 먼저 검사하냐, 나중에 검사하냐의 차이!
	 *  while(true) {};
	 *  do{} while(true);
	 *  
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		RandomStudy randomStudy = new RandomStudy();
		char yn = 'y';
		
		do {
			// 가위바위보
			// 동전
//			randomStudy.test3();
			
			System.out.print("계속하시겠습니까?(y/n) : ");
			yn = sc.next().charAt(0);
			if(yn == 'n')
				break;
		} while(yn == 'y');  // 사용할 변수(yn)는 do블럭 밖에 선언되어야 한다.
		
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	/**
	 * while문을 무한반복해두고, 실행시 동적으로 종료/탈출하기(탈출할 조건)
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);	
//		RandomStudy randomstudy = new RandomStudy();       // 동전게임
//		RockSciPaper randomTest = new RockSciPaper(); // 가위바위보 게임

		
		while(true) {
//			randomstudy.test3();  // 동전게임
//			randomTest.test1();  // 가위바위보 게임
			System.out.print("계속하시겠습니까?(y/n) : ");
			char yn = sc.next().charAt(0);
			
			if(yn == 'n') {
				break;
			}	
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	/** 1부터 사용자입력 정수까지의 합 출력
	 * 
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int usernum = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= usernum) {
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d 의 합은 %d입니다.", 1, usernum, sum);
		
	}
	
	public void test3_() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int userNum = sc.nextInt();
		int temp = userNum;
		int sum = 0;
		
		while(userNum > 0) {
			sum += userNum;
			userNum--;
			// sum += userNum--; 도 가능함
		}
		
		System.out.printf("%d ~ %d 의 합은 %d입니다.", 1, temp, sum);
	}

	/**
	 * 
	 * 초기식 
	 * while(조건식){ 		초기식-조건식-실행코드-증감식-조건식-실행코드-증감식
	 * 		// 실행코드
	 * 		증감식 
	 * }
	 * 
	 * for(초기식; 조건식; 증감식){
	 * 		// 실행코드
	 * }
	 * 
	 */
	public void test1() {
		int i = 0;  // 초기식
		while(i < 3) {  // 조건식

			// 실행코드
			System.out.println("Hello world" + i);
			
			i++;  // 증감식 
		}
		
	}
	
	public void test2() {
		// 1 2 3 4 5
		int i = 0;
		while(i < 5) {
			i++;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 5 4 3 2 1
		int j = 5;
		while(j > 0) {
			System.out.print(j + " ");
			j--;
		}
		
		System.out.println();
		
		// 1 3 5 7 9 13 15 17 19
		i = 1;
		while(i <= 19) {
			System.out.print(i + " ");
			i += 2;			
		}
		
		System.out.println();
		
		// 2 4 6 8 10 12 14 16 18 20
		j = 2;
		while(j <= 20) {
			System.out.print(j + " ");
			j += 2;
		}
		
		System.out.println();

		
		// 구구단 7단
		i = 7;
		j = 1;
		while(j <= 9) {
			System.out.printf("%d * %d = %d", i, j, i*j);
			System.out.println();
			j++;
		}
	}
}
