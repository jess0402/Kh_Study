package kh.java.cast;

/**
 * 컴퓨터 연산원리
 * 1. 값(literal)은 같은 타입의 변수에만 대입할 수 있다.
 * 2. 같은 타입끼리만 연산할 수 있다.
 * 3. 같은 타입간 연산결과값의 타입 또한 동일하다.
 *
 */

public class CastingStudy {
	public static void main(String[] args) {
		CastingStudy study = new CastingStudy();
//		study.test1();
//		study.test2();
		study.test3();
		
	}
	
	/**
	 * 연산간 자동형변환
	 * 
	 * > 크다 greater than
	 * < 작다 less than
	 * >= 크거나 같다 greater than or equal to
	 * <= 작거나 같다 less than or equal to
	 * 
	 * == 같다
	 * != 같지 않다
	 */
	public void test3() {
		// true/false로 평가될 수 있는 어떤 계산식
		boolean bool = 5 < 2;
		System.out.println(bool);
		
		bool = ((5 / 2) == 2.0); // (int/int) == double -> 2 == 2.0
		System.out.println(bool); 
		
		bool = 'C' == 67; // char == int -> int == int
		System.out.println(bool);
		
		bool = 'A' + 2 == 'B' + 1; // char + int == char + int -> 65 + 2 == 66 + 1
		System.out.println(bool);
		
		System.out.println(">" + !true);
		System.out.println(">" + !false);
		
		bool = !('a' != 97); // char == int -> int == int
		System.out.println(bool);
	}
	
	/**
	 * 명시적 형변환(강제) - 형변환에 따라 값이 유실될 수 있다.
	 */
	
	public void test2() {
		// 1. 작은 타입으로 형변환
		// int num = 3.7;  
		// double(8)값을 int(4)에 넣으려고 함. 
		// 큰 값을 작은 공간에 넣으려고 하는 것이라 오류남.
		
		int num = (int) 3.7; // double을 int로 강제형변환
		System.out.println(num); // 3 -> 소수점 아래가 날라감 = 값 유실
		
		// 2. 큰 타입으로 형변환
		int k = 10;
		int m = 3; 
		System.out.println(k / m); // int / int -> int
		System.out.println(((double) k) / m); // double / double -> double
		
		int i = Integer.MAX_VALUE;
		System.out.println((long)i + 1); // 이렇게 하면 long + int가 되어서 2147483648이라는 값을 얻을 수 있음
		System.out.println(i + 1L); // 이렇게도 가능함. 윗줄과 같은 결과 얻음
	}
	
		// 3. 예외적인 형변환
		// (int보다 작은 자료형인) byte, short, char가 연산시 자동으로 int로 우선 변환되어 처리됨.
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2;  // byte + byte -> int + int -> int
		
		// int값을 char에 명시적 형변환 없이 대입가능
		char ch = 97;   // int -> char
//		System.out.println(ch);
		

	/**
	 * 암묵적 형변환(=자동 형변환) - 작은공간의 값을 큰공간으로 옮겨도 형변환에 따라 값을 유실하지 않음. 
	 *	(실수는 지수표현식 방식으로 적은 공간에 훨씬 많은 수를 표현할 수 있음
	 *		-그래서 long(8) -> float(4)으로 형변환이 일어나는 것. ) 
	 * byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
	 * 		   -> char(2)  -> 
	 * - 작은 쪽에서 큰쪽으로 자동형변환 됨.
	 * 
	 * 
	 */
	public void test1() {
		// 다른 타입끼리 연산하는 경우, 크기가 큰 타입으로 자동 형변환 된다. 
		System.out.println(1 + 3.3); // int + double 
//		System.out.println(1.0 + 3.3); // double + double
		
		// 다른 타입의 변수에 값대입하는 경우(대입연산도 연산)
		double d = 3; // double = int
//		double d = 3.0; -> 자동으로 3.0으로 형변환 됨. 
		System.out.println(d);
		
		char ch = 'a'; // ascii --> ascii-extended --> unicode table
		int aNum = ch; // aNum공간에 ch값을 대입한다.
		System.out.println(aNum);
		
		// char는 정수형과는 숫자연산, 문자열과는 문자열 더하기 연산처리된다.
		System.out.println(ch + 100); // 197
		System.out.println(ch + "A"); // "aA"
		
	}
	
}
