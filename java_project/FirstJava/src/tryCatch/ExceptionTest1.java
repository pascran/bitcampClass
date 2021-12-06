package tryCatch;

import java.util.Scanner;

public class ExceptionTest1 {
	// if 문을 이용하여 0으로 나눌 수 없도록 예외처리를 해보자.

	/*
	 * public static void main(String[] args) { while (true) { Scanner sc = new
	 * Scanner(System.in); System.out.println("피제수를 입력하세요"); int num1 =
	 * sc.nextInt(); System.out.println("제수를 입력하세요"); int num2 = sc.nextInt();
	 * 
	 * if (num2 == 0) { System.out.println("0으로 나눌 수 없습니다."); continue; } else {
	 * System.out.println(num1 / num2); sc.close(); break; } }
	 * 
	 * }
	 */

	// try - catch 문을 이용하여 예외처리를 해보자.

	// try{ 예외가 발생할 가능성이 있는 문장들을 넣는다. }
	// catch (예외클래스타입 + 참조변수) { 예외클래스타입이 발생했을 경우, 이를 처리하기 위한 문장을 넣는다 }
	// catch ( ) { }
	// catch ( ) { } // 여러개의 예외를 체크할 수 있다.
	// 마지막 catch 전에 예외에 대해 처리가 되었다면 밑의 예외는 체크하지 않고 즉시 try-Catch 문을 빠져나와 다음 코드를 실행한다.
	// 만약 일치하는 catch문을 찾지 못했다면 예외는 처리되지 않는다 = 예외가 발생하지 않았다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("피제수를 입력하세요");
			int num1 = sc.nextInt();
			System.out.println("나눌 수를 입력하세요");
			int num2 = sc.nextInt();

			try {
				System.out.println("num1/num2 = ".concat(String.valueOf(num1 / num2)));
			} catch (ArithmeticException e) {
				// 만약 어떤 예외타입이 발생할지 알수 없다면
				// Exception e 라고 써주면 된다.
				// 모든 예외타입들은 Exception 클래스를 상속받고 있기 때문이다.(다형성)
				
				System.out.println("0으로 나눌 수 없습니다.");
				e.printStackTrace(); 
				// 지금까지 실행시 보아왔던 에러메세지를 그대로 출력한다. (몇번 째 줄에서 무슨 에러가 났는지, 이유는 무엇인지)
				e.getMessage(); 
				// printStackTrace() 가 출력하는 에러 메세지 중에 발생 이유를 "반환"한다.
				// 어디서 발생했는지, 무슨 예외타입이 발생했는지 알 수 없다.
				System.out.println(e.getMessage());
				e.toString();
				// printStackTrace() 의 출력 메세지 중 어떤 예외타입인지, 발생 이유는 무엇인지 "반환"한다.
				// 어디서 발생했는지 알 수 없다.
				continue;
			}
			System.out.println("계속하시려면 1을 종료하시려면 2를 누르세요");
			int userChoice = sc.nextInt();
			while (!(userChoice == 1 || userChoice == 2)) {
				System.out.println("올바른 번호를 입력하세요");
			}
			if (userChoice == 1) {
				continue;
			} else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}
