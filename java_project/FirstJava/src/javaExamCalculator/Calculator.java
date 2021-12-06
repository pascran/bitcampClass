package javaExamCalculator;

//2.Calulator 인터페이스를 상속하는 인스턴스를 생성할 수 있는 클래스를 정의해봅시다.
//
//3.다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 인터페이스를 구현한 
//클래스 타입의 인스턴스를 참조하는 코드를 작성해 봅시다.
public class Calculator extends CalculatorAbstract implements CalculatorManual {

	

	@Override
	public long add(long n1, long n2) {
		return super.add(n1, n2);
	}

	@Override
	public long substract(long n1, long n2) {
		return super.substract(n1, n2);
	}

	@Override
	public long multiply(long n1, long n2) {
		return super.multiply(n1, n2);
	}

	@Override
	public double divide(double n1, double n2) {
		return super.divide(n1, n2);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();

		int n1 = 8;
		int n2 = 5;
		double n3 = 2.2;
		double n4 = 4.5;
		System.out.println(c.add(n1, n2));
		System.out.println(c.substract(n1, n2));
		System.out.println(c.multiply(n1, n2));
		System.out.println(c.divide(n1, n2));

	}
}
