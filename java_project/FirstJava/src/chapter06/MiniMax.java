package chapter06;

import java.util.Scanner;

public class MiniMax {
	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300, 400, 500};
		System.out.println("최대값: " + maxValue(arr));
		System.out.println("최소값: " + miniValue(arr));
	}

	// 최소값
	public static int miniValue(int[] arr) {
		// 최소값
		int minVal = arr[0];// 처음값을 최소값으로 저장

		// 각 요소의 값과 최소값들을 비교 후 새로운 값이 더 작을 때 최소값으로 저장
		// 전달받은 배열의 사이즈만큼 반복하면서 비교
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minVal) {
				minVal = arr[i];
			}
		}
		return minVal;
	}

	// 최대값
	public static int maxValue(int[] arr) {
		int maxVal = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;

	}
}
