package chapter06;

import java.util.ArrayList;
import java.util.List;

public class ScoreManager2 {
	//2021.10.20 배열을 ArrayList 로 변경
	//private Student[] score;
	private List<Student> score;
	private int numOfStudent; 
	
	public ScoreManager2(int size) {
		//score = new Student[size];
		score = new ArrayList()<Student>(size);
		//numOfStudent = 0;
	}

	public ScoreManager2() {
		this(10);
	}
	
	// 배열의 모든 요소를 출력하는 메소드
	// List 에 요소 추가
	public void showAllData() {
		System.out.println("평가 점수 리스트");
		System.out.println("----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
//		for(Student s : score) {
//			if(s != null) {
//				System.out.println(s); // s.toString()
//			}
//		}
		for(Student s : score) {
			System.out.println(s);
		}
		System.out.println("----------------------------------------------");
		
	}
	
	
	// 배열에 요소를 입력하는 메소드
	public void insertScore(Student s) {
		score.add(s);
//		score[numOfStudent] = student;
//		numOfStudent++; // 입력 요소 개수를 추가! 이후 입력시 index 값으로 사용됨!
	}
	//이름으로 inde x찾아 반환
	private int searchIndex(String name) {
		int index = -1;
		
		for(int i = 0; i<score.size(); i++) {
			if(score.get(i).getName().equals(name)) {
				index = -i;
				break;
			}
		}
	}
}
