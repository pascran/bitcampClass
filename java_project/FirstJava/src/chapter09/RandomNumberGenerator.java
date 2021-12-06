package chapter09;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		//(int)(Math.random()*10)+1 -> 1~10 
		Random r1 = new Random();
		for(int i = 0; i < 10; i++) {
		//1~10
		int num1 = r1.nextInt(10) + 1; // -> 1~10까지
		System.out.println(num1);
		}
		System.out.println("===========================");
		Random r2 = new Random(2); //seed 를 넣어보면 특정 패턴이 만들어진다.
		
		
		for(int i = 0; i < 10; i++) {
			long num = System.currentTimeMillis(); //1970년부터 지금까지 밀리초로 난수값
			long num2 = System.nanoTime();// CPU 연산 난수값
			r2.setSeed(num2);
		//1~10
		int num1 = r2.nextInt(10) + 1; // -> 1~10까지
		System.out.println(num1);
		}
		
	}
}
