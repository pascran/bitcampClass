package chapter07;

public class UnivFriend extends Friend {

	String major; //전공
	//Alt Shift S -Generate Constructor using Field
	public UnivFriend(String name, 
			String phoneNumber,
			String adress, 
			String major) {
		super(name, phoneNumber, adress);
		this.major = major;
	}
	//오버라이딩
	@Override
	public void showData() {
		super.showData();
		System.out.println("전공: " + major);
	}
	@Override
	public void showBasicInfo() {
		super.showBasicInfo();
		System.out.println("이름: " + name);
		System.out.println("전화번호 " +  phoneNumber);
		System.out.println("전공: " + major);
	}
	
}
