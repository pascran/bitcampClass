package chapter13;

public class Increment {
	int num;

	public synchronized void increment() {
		num++;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public int getNum() {
		return num;
	}
}
