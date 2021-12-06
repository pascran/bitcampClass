package tryCatch;

// 프로그래머가 직접 정의하는 예외상황

// 1. 강제적으로 예외 발생  Exception e = new Exception();
// 2. 새로운 예외 클래스를 정의

// 예외 상황을 직접 정의해야 하는 이유 >> 논리적 오류의 해결을 위함
// 주민번호에 하이폰을 넣거나 나이에 음수를 입력하거나 점수에 100점 이상을 입력하거나....etc


public class ExceptionCustomized {
	// 1. 강제적으로 예외 발생 (기존의 Exception 클래스 사용)
	
	
	public static void main(String[] args) throws Exception {
		
		// throws Exception 의 의미
		// Exceptions 클래스에서 봤던 parseInt 메소드와 마찬가지로 여기 main 메소드는 Exception 발생시 예외처리를 하지 않고
		// 그 예외를 발생시킨 곳으로 Exception 을 던져 강제로 예외를 발생시키는 것이다.
		// 따라서 그 곳에 직접 예외 처리를 해주어야만 비정상적인 종료를 막을 수 있다.
		
		
		try {
			Exception e = new Exception("고의발생!");
			// String 을 매개변수로 받는 Exception 클래스의 생성자.
			// 예외 발생시 e.getMessage()를 매개변수로 받은 문자열로 반환되게끔 만들어짐.			
			throw e;
		}catch(Exception e) {
			System.out.println("에러 메세지: ".concat(e.getMessage()));
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료됩니다.");
		
		
	}

	

}
