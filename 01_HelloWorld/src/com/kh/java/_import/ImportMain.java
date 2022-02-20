package com.kh.java._import;

import java.util.Date;  // java built in class인데 다른 패키지에 있는 class이므로 import가 필요하다.

import com.kh.java._import.other.Bar;

import a.b.c.ABC;

public class ImportMain {
	public static void main(String[] args) {
		
		// A. 같은 패키지인 경우
		// 1. 객체생성 : 클래스 -> 객체
		// 객체레시피: 클래스이름 변수명 = new 클래스이름();
		ImportMain main = new ImportMain();
		// 2. 메소드 호출
		main.test1();
		
		// 1. 객체생성
		Foo foo = new Foo();
		// 2. 메소드 호출
		foo.test2();
		// 현재 ImportMain 클래스에서 작성하고 있지만 외부 클래스의 메서드를 위와 같이 작성해서 사용할 수 있음.
		
		
		// B. 다른 패키지인 경우 -> import문이 필요하다
		Bar bar = new Bar();
		bar.test3();
		
		// java api의 다른 클래스도 import문 작성 후 사용가능하다.
		Date date = new Date();
		System.out.println(date);
		
		// a.b.c.ABC.hello 호출
		// Ctrl + Shift + o : 자동 import
		ABC abc = new ABC();
		abc.hello();
		
		// C. 예외: java.lang.*  (*은 모든 클래를 의미)
		// 다른 패키지면 import가 무조건 필요하다.
		// 스트링에 마우스 대보면 java.lang.String이라는 패키지에 들어가있는 것을 알 수 있음.
		// 즉 패키지가 다르기 때문에 import문이 필요할 것 같은데 아래 코드는 없어도 실행이 됨. 
		// 이 java.lang 패키지만 예외인 것. 이는 java.lang 패키지에 있는 모든 클래스에 해당됨.
		// import java.lang.*이 생략되어 있다고 볼 수 있음.
		String str = new String("자바 개발자");  // 문자열 객체를 하나 만든 것. 
		System.out.println(str);
	}
	
	public void test1() {
		System.out.println("안녕");
	}

}
