package javaExamCalculator;
//아래 코드는 계산기 클래스를 정의할 때 가이드 역할을 하도록 정의해놓은 인터페이스입니다. 

//1. Calulator 인터페이스를 상속하는 추상 클래스를 정의해봅시다.

public abstract class CalculatorAbstract implements CalculatorManual {

	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}

	@Override
	public long multiply(long n1, long n2) {
		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}
}
