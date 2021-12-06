package chapter07;

import java.util.Scanner;

public class FriendInfoHandler {

		//친구정보를 저장하는 배열을 가지고
	//배열에 데이터를 저장하고
	// 배열에 저장된 정보(데이터) 들을 출력하는 메소드
	
	//다형성을 이용한 배열 정의 
	private Friend[] friends;
	private int numOfFriends;// 입력된 친구 정보의 개수, 배열의 index 로 사용
	//1.친구숫자 직접입력
	FriendInfoHandler(int size){
		friends = new Friend[size];
		numOfFriends = 0;
	}
	//2.default 값으로 친구숫자를 10으로 초기화하고 시작
	FriendInfoHandler(){
		this(10);
	}
	//배열에 요소 입력 메소드 : Friend 타입의 인스턴스를 참조하는 참조값을 받아서 배열에 추가
	void  addFriendInfo(Friend f) {
		//다형성 이용 -> 매개변수의 선언은 상위타입의 클래스 타입으로 정의
		//Friend f = new HighFriend();
		//Friend f = new UnivFriend();
		friends[numOfFriends++] = f;
	}
	//데이터를 사용자로부터 입력받아 Friend 클래스의 파생 클래스의 인스턴스를 생성하고
	// ->addFriendInfo(f) 호출 하는 메소드
	public void addFriend(int select) {
		Scanner sc = new Scanner(System.in);
		//기본 정보를 입력받고 
		System.out.println("친구정보 입력을 시작합니다.");		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("주소를 입력하세요.");
		String adress = sc.nextLine();
		//select == 1 -> 고교 친구에 대한 추가 정보를 받고 인스턴스를 생성 
		if(select == 1) {
			System.out.println("직업을 입력하세요.");
			String job = sc.nextLine();
			
//			Friend f = new HighFriend(name, phoneNumber, adress, job);
//			//배열에 인스턴스 추가
//			addFriendInfo(f); =
			addFriendInfo(new HighFriend(name, phoneNumber, adress, job));
		}else {//select == 2 -> 대학 친구에 대한 추가 정보를 받고 인스턴스를 생성
			System.out.println("전공을 입력해주세요.");
			String major = sc.nextLine();
			
			addFriendInfo(new UnivFriend(name,phoneNumber, adress, major));
		}
		

	}
	public void showAllData() {
		System.out.println("친구정보를 모두 출력합니다.");
		System.out.println("===============================");
		for(int i = 0; i < numOfFriends; i++) {
			friends[i].showData();
			System.out.println("-------------------------------");
		}
	}
	public void showAllSimpleData() {
		System.out.println("친구정보의 기본 정보를 모두 출력합니다.");
		System.out.println("===============================");
		for(int i = 0; i < numOfFriends; i++) {
			friends[i].showBasicInfo();
			System.out.println("-------------------------------");
		}
	}
}
