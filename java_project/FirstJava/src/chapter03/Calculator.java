package chapter03;

import java.util.Scanner;

public class Calculator {
	
//	Calculator 클래스를 정의해봅시다.
	// final 변수 앞에 -> 상수  
	// 클래스 앞에 사용-> 상속의 대상이 아니다!!!
	// java에서 상수 : 변수에 최초 초기화된 값을 바꾸지 못한다!!!
	final float PI = 3.1415f;
	final String USER_NAME;
	
	// 생성자 : 초기화 메소드, 메소드 구조와 유사 반환기능 X
	// 클래스이름(){}
	Calculator(String name) {
		USER_NAME = name;
	}
	
	
//	① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	public void plus(int num1, int num2) {
		long result = (long)num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
	}
	
//	② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	public void minus(int num1, int num2) {
		long result = (long)num1 - num2;
		System.out.println(num1+"-"+num2+"="+ (num1 - num2));
	}
	
//	③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	public void multi(int num1, int num2) {
		long result = (long)num1 * num2;
		System.out.println(num1+"*"+num2+"="+ result);
	}
	
//	④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	public void divide(int num1, int num2) {
		float result = (float)num1 / num2;
		System.out.println(num1+"/"+num2+"="+ result);
	}
	
//	⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	float circum(float r) {
		return 2 * PI * r; // int * float * float
	}
	
//	⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
	float cirArea(float r) {
		return PI * r * r;
	}
	
//	⑦main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	public static void main(String[] args) {
		
		Calculator cal = new Calculator("손흥민"); 
		
		// 상수 출력
		System.out.println("PI : " + cal.PI);
		System.out.println("User Name = " + cal.USER_NAME);
		
		//cal.USER_NAME = "이강인"; // 상수의 값을 변경하는것은 안된다!!!
		cal.plus(10,20);
		
		// ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드에 추가해봅시다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("덧샘을 시작합니다.\n숫자1을 입력해주세요.");
		int num1 = Integer.parseInt(scanner.nextLine()) ;
		//System.out.println(num1);
		System.out.println("숫자2를 입력해주세요.");
		int num2 = Integer.parseInt(scanner.nextLine()) ;
		
		cal.plus(num1, num2);
		
		System.out.println("==========================");
		System.out.println("원의 둘레와 넓이를 구합니다.\n반지름을 입력해주세요.");
		float r = Float.parseFloat(scanner.nextLine()) ;
		
		System.out.println("전달받은 반지름 : " + r);
		System.out.println("원의 둘레 : " + cal.circum(r));
		System.out.println("원의 넓이 : " + cal.cirArea(r));
		
	}
	
	
	
	
	
	
}
