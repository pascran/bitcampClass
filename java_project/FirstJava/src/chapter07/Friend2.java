package chapter07;
//추상 클래스로 만들기: 추상 메소드 생성
public abstract class Friend2 {
//개인정보 관리 프로그램
	//정보저장 변수(캡슐)
	String name;
	String phoneNumber;
	String adress;
	//저장 데이터의 초기화: 생성자
	public Friend2(String name, String phoneNumber, String adress) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}
	//데이터 출력 메소드: 상속을 하면 오버라이딩 해서 하이 클래스의 멤버도 출력
	public void showData() {
		System.out.println("이름: " + this.name);
		System.out.println("전화번호: " + this.phoneNumber);
		System.out.println("주소: " + this.adress);
	}
	//오버라이딩 목적으로 하는 메소드	
	//추상 메소드: 처리 블록이 없다! 미완성된 메소드, 상속을 통해 완성시켜야만 하는 메소드
	public abstract void showBasicInfo();
}
