package tryCatch;

import java.util.Scanner;

public class ExceptionAgeInputTest {

	public static void main(String[] args) {
		while (true) {
			System.out.println("나이를 입력하세요");
			try {
				int age = getAge();
				// 예외가 나왔다 >> main 메소드는 throws ExceptionAgeInput 이 아니기 때문에
				// 여기서 처리해줘야한다 >> try Catch 문을 써서 처리하자.
				// 예외가 안나왔다면 입력한 나이를 정상적으로 출력해주자
				System.out.println("입력받은 나이는 : " + age + " 세 입니다.");
				System.out.println("입력 프로그램을 종료합니다.");
				break;
				
			} catch (ExceptionAgeInput a) {
				System.out.println("나이는 음수일 수 없습니다.\n");
			}
		}

	}

	// methods

	public static int getAge() throws ExceptionAgeInput {
		// 예외 발생하면 그 예외 호출된 곳으로 던질테니 알아서 처리해라.
		int age = 0;

		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		if (age < 0) {
			ExceptionAgeInput a = new ExceptionAgeInput(age);

			throw a;
			// 한줄로 쓰기 = throw new ExceptionAgeInput(age);
		}

		return age;

	}
}
