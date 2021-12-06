package tryCatch;

//자주 발생하는 여러 에러타입들

//ArrayIndexOutofBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용시
//ClassCastException : 허용할 수 없는 형변환 연산을 진행시
//NegativeArraySizeException : 배열 선언시 배열의 크기를 음수로 지정시
//NullpointerException : 참조변수가 null로 초기화된 상황에서 메소드를 호출시

//무조건 try-Catch 문을 쓰게 될 경우 내가 원하는 프로그램과는 전혀 다른 프로그램이 되어버린다.
//즉, 예외처리를 하기 전에 모든 코드가 의도한 바대로 작동되고 있는지 먼저 확인하고 수정하는 것이 중요하다.

public class Exceptions {

	public static void main(String[] args) {

		int[] arr = new int[3];
		Object o = new String("123");
		String str1 = null;

		// System.out.println(arr[3]);
		// ArrayIndexOutofBoundsException
		// 배열 arr에는 3번 인덱스가 없다. (0,1,2 인덱스를 가지는 크기가 3인 배열이기 때문)

		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났습니다.");
		}

		System.out.println("\n-------------------\n");

		// Integer i = (Integer)o;
		// 문법상 문제는 없지만
		// Object 타입은 Integer 타입으로 변환할 수 없다.
		// ClassCastException: java.lang.String cannot be cast to java.lang.Integer

		try {
			Integer i = (Integer) o;
		} catch (ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
		}

		System.out.println("\n-------------------\n");

		// 다른 곳에서 받아온 arraySize를 배열의 크기로 지정하고자 한다.
		// 받아온 값이 음수값일 경우
		int arraySize = -10;
		// int[] arr1 = new int[arraySize];
		// 문법상 문제는 없지만
		// 코드 실행도중 음수 크기를 갖는 배열은 생성할 수 없다.
		try {
			int[] arr1 = new int[arraySize];
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수가 될 수 없습니다.");
		}

		System.out.println("\n-------------------\n");

		try {
			System.out.println(str1.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("참조할 수 없습니다.");
		}

		System.out.println("\n-------------------\n");

		String number = "오종현2";
		try {
			int temp = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 문자는 정수로 바꿀 수 없습니다.");
		}

		// 실제로 java API 의 Integer 클래스의 parseInt 메소드에 들어가보면
		// public static int parseInt(String s) throws NumberFormatException 으로 정의되어 있다.
		// 즉, 들어온 문자열 중에 정수로 변환할 수 없는 문자가 없을 경우에는 NumberFormatException 을 버린다
		// 만약 있을 경우에는 NumberFormatException 을 발생시킨다.

		// 결과적으로 parseInt 메소드는 문자열 중에 숫자가 아닌 문자가 있으면 고의로 예외를 발생시켜 프로그래밍 하는
		// 사람이 그 예외에 대해서 처리하도록 만들어진 메소드인 것이다.

		int num1 = 9;
		int num2 = 0;

		try {
			System.out.println(num1 / num2);

		} catch (Exception e) {
			System.out.println("예외발생");
//		} catch(ArithmeticException e) {
//			System.out.println("0 으로 나눌 수 없습니다.");
//		}

			// 상위 예외타입을 하위보다 먼저 스캔하도록 코드를 작성하면
			// 하위코드는 절대로 스캔되지 않는다.
			// 첫번째 catch문에서 ArithmeticException 까지도 감지하기 때문에 두번째 catch문에는 도달 할 수 없는 것이다.
		
		
		    // 즉 여러개의 catch문을 사용할 때에 마지막 catch 문까지 스캔할 수 있는 경우가 반드시 있도록 작성해야 한다.
		    // 만약 위처럼 Exception 예외타입을 먼저 스캔하도록 검색하면 
		    // 어떠한 예외던지 첫번째 catch 문에서 모두 처리가 되기 때문에
		    // 두번째 catch문에 도달할 수 있는 경우는 절대로 없다. = 문법에 어긋난다 = 컴파일 에러 = 빨간줄

			System.out.println("\n-------------------\n");

			// finally 문
			// 예외의 발생여부와 관계없이 항상 수행되어야 하는 문장을 넣는다.
			// try-catch문의 맨 마지막에 위치해야 한다.

			try {
				System.out.println(num1 / num2);
				return;
			} catch (ArithmeticException e2) {
				System.out.println("0으로 나눌 수 없습니다.");

			} finally {
				System.out.println("예외 발생 여부에 관계없이 출력됩니다.");
			}

			// 메인 메소드 종료를 위한 return 을 넣었음에도 finally 구문은 실행되고 메인메소드가 끝난다.
			// 그 이유는 프로그램 실행 순서에 있다.
			// try 문 진입 > System.out.println(num1/num2); 실행
			// 그 코드에 예외가 발생했음 > "0 으로 나눌 수 없습니다" 출력
			// 예외발생유무와 상관없이 finally 블록의 코드 실행
			// return 실행.
		}
	}
	
	
	
	
	
}
