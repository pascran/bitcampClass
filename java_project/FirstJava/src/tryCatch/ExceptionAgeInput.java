package tryCatch;


// 사용자가 직접 정의하는 예외 클래스

public class ExceptionAgeInput extends Exception {
	
	public ExceptionAgeInput() {
		super("유효하지 않은 나이입니다.");
	}
	
	public ExceptionAgeInput(int age) {
		super(age + "는 유효한 나이가 아닙니다.");
	}
	
	public void classInfo() {
		System.out.println("이 메소드는 ExceptionAgeInput의 classInfo메소드입니다.");
	}

	// ExceptionAgeInputTest 클래스로 가서 어떻게 작동하는지 보자.
	
	
	
	// ++ 직접 정의한 클래스 또한 Exception 을 상속받는 클래스이다.
	// getMessage() 메소드를 오버라이딩 해보자.
	// ExceptionAgeInputTest로 가서 AgeInputException 타입을 Exception a 로 바꾸어도 문제가 없는것을 확인하자.
	// Exception 타입으로 바꿀시에 참조변수 a는 classInfo()메소드를 참조할 수 없는 것 또한 확인하자. 왜?
	// a 참조변수는 Exception 타입으로서 부모클래스인 Exception 클래스의 기능만 사용할 수 있다.
	
	


}
