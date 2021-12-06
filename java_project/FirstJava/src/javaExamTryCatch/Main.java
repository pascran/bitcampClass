package javaExamTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
//	콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
//
//	  ①사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
//
//	  ②예외 클래스 이름은 BadIdInputException이라고 정의합시다.

//	Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//	이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userId;
		int birth;

		while (true) {
			try {
				System.out.println("사용할 아이디를 입력하세요");
				userId = getId(sc.nextLine());
				break;
			} catch (BadIdInputException e) {
				System.out.println("해당 아이디는 사용할 수 없습니다.");
			}
		}
		System.out.println(userId + " 는 사용할 수 있는 아이디입니다.");

		while (true) {

			// 년도를 int로 받을 때 발생할 수 있는 예외타입
			// 숫자가 아닌 다른 문자를 입력했을 경우

			try {
				System.out.println("태어난 년도를 입력하세요");
				birth = sc.nextInt();
				break;
			} catch (InputMismatchException a) {
				sc.nextLine(); // 스캐너 버퍼에 남아있는 엔터키를 강제 반환하여 다음 입력을 정상적으로 받도록 함
				System.out.println("올바른 년도를 입력하세요");

			}
		}
		System.out.println("태어난 년도 : " + birth + " 년생");

		sc.close();

	}

	private static String getId(String str) throws BadIdInputException {
		if (!(str.matches("^[0-9 a-z A-Z]*$")) || str.isEmpty()) {
			throw new BadIdInputException("올바른 형식의 아이디를 입력하세요");
		} else {
			return str;
		}
	}
}