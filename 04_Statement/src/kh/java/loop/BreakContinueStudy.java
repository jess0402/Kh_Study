package kh.java.loop;

public class BreakContinueStudy {

	public static void main(String[] args) {
		BreakContinueStudy study = new BreakContinueStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * continue 
	 * - 반복문의 이하 코드를 실행하지 않고, 반복문의 맨 처음으로 가서 반복문을 다시 시작하는 것. 
	 * - for문의 경우 증감식으로 가고,
	 * - while문의 경우 조건식으로 가서 while문을 이어감(continue 하위에 증감식을 위치시켜서는 안된다.)
	 */
	public void test2() {
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		// 1 3 5 7 9 11 13 15 17 19
		int i = 0;
		while(i <= 19) {
			i++;
			if(i % 2 == 0)
				continue;
			System.out.println(i);
			
		}
		
	}

	/**
	 * break
	 * - 실행시 반복문 블럭을 탈출
	 */
	public void test1() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i++ + " ");
			if(i > 5) {
				break;
			}
		}
		System.out.println();
		
		// 1부터 n까지의 합
		int j = 1;
		int n = 10;
		int sum = 0;
		
		while(true) {
			sum += j;
			
			if(j == n) {
				break;
			}
			j++;
		}
		System.out.println(sum);
	}
}
