package chapter07;
// 추상 클래스를상속해서 새로운 클래스를 정의한 것
public class CafeFriend extends Friend2 {
	String cafeName;
	
	public CafeFriend(String name, String phoneNumber, String adress, String cafeName) {
		super(name, phoneNumber, adress);
		this.cafeName = cafeName;
	}
	//반드시 추상메소드를 완성시켜야 인스턴스 생성이 가능하다!
	@Override
	public void showBasicInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("동호히 이름: " +cafeName);
	}
	
	
}
