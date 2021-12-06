package tryCatch;
// try-Catch 문

import java.util.Scanner;

// 예외(Exception)
// 문법적인 오류로 인해 프로그램 자체가 실행되지 않는 컴파일 오류와는 달리
// 실행도중에 예상치 못한 입력이나 코드진행으로 인해 발생하는 runtime 오류로 인해 프로그램이 비정상적으로 종료되는 문제.

public class _Overview {
	
	// ex) 사용자가 0 으로 나누려고 할 경우

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피제수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("제수를 입력하세요");
		int num2 = sc.nextInt();
		// 만약 num2 의 값을 0으로 입력했다면 0으로는 나눌 수 없기 때문에 오류가 발생한다.
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at tryCatch.ExceptionTest1.main(ExceptionTest1.java:##)
		// >> 패키지.클래스.메인 ## 번째 줄에서 오류가 발생하였다는 의미.
		// 예외 타입은 java.lang.ArithmeticException 이다.
		// ArithmeticException 은 예외타입중 하나로 0으로 나누려고 시도할시에"만" 발생한다.

		// 이때 이 ArithmeticException 을 받아서 처리할 수 있는 블록이 없다면 프로그램은 종료된다.
		// 이 예외타입의 객체를 처리하는 구문이 try-Catch 문이다.

		System.out.println(num1 / num2);

		sc.close();
	}

}
