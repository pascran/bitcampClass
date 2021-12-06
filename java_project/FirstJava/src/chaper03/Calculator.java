package chaper03;

/*
 * 1. Calculator 클래스를 정의해봅시다.
① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
에 추가해봅시다.

 */
import java.util.Scanner;

public class Calculator {
	// final 변수 앞에 -> 상수 또는 클래스 앞에 사용
	// java 에서 상수: 변수에 최초 초기화된 값을 바꾸지 못한다!!!
	final float PI = 3.1415f;
	final String USER_NAME;

	Calculator(String name) {
		USER_NAME = name;
	}

	// 생성자: 초기화 메소드, 메소드 구조와 유사 반환기능x
	// 클래스이름(){}
	public void plus(int num1, int num2) {
		long result = (long) num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

	public void minus(int num1, int num2) {
		long result = (long) num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
	}

	public void multi(long num1, long num2) {
		long result = (long) num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
	}

	public void div(int num1, int num2) {
		long result = (long) num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
	}

	 float circum(float r) {
		return 2 * PI * r;

	}

	float cirArea(float r) {
		return r * r * PI;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator("손흥민");
		
		//상수 출력
		System.out.println("PI : " + cal.PI);
		System.out.println("User Name = " + cal.USER_NAME);
		Scanner scanner = new Scanner(System.in);
		//cal.USER_NAME = "이강인"; -- 상수의 값을 변경하는 것은 X
		System.out.println("사칙연산을 시작합니다.\n숫자 1 을 입력해주세요");;
		
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("숫자 2를 입력해주세요");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		cal.plus(num1, num2);
		cal.minus(num1, num2);
		cal.multi(num1, num2);
		cal.div(num1, num2);
		System.out.println("원의 반지름을 입력해주세요");
		float r = Float.parseFloat(scanner.nextLine());
		System.out.println("입력받은 반지름: " + r);
		System.out.println("원의 둘레: " + cal.circum(r));
		System.out.println("원의 넓이: " + cal.cirArea(r));
		System.out.println();
		
		
		

		scanner.close();
	}
}
