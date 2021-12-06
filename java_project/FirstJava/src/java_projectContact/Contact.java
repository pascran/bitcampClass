package java_projectContact;

import java.util.Scanner;

public class Contact {
	// 캡슐화
	private String name;// 이름
	private String phoneNum;// 전화번호
	private String email;// 이메일
	private String adress;// 주소
	private String birthDay;// 생일
	private String group;// 그룹

	// getset
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// 생성자
	public Contact() {
	}

	public Contact(String name, String phoneNum, String email, String birthDay, String group, String adress) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.birthDay = birthDay;
		this.group = group;
		this.adress = adress;
	}

	public static void main(String[] args) {
		Contact contact = new Contact();
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("전화번호를 입력해주세요");
		String phoneNum = scanner.nextLine();
		System.out.println("이메일 주소를 입력해주세요");
		String email = scanner.nextLine();
		System.out.println("생일을 입력해주세요");
		String birthDay = scanner.nextLine();
		System.out.println("그룹을 입력해주세요");
		String group = scanner.nextLine();
		System.out.println("주소를 입력해주세요");
		String adress = scanner.nextLine();

		contact = new Contact(name, phoneNum, email, birthDay, group, adress);
		// 출력
		System.out.println(contact.getName());
		System.out.println(contact.getPhoneNum());
		System.out.println(contact.getEmail());
		System.out.println(contact.getBirthDay());
		System.out.println(contact.getGroup());
		System.out.println(contact.getAdress());
		// 정보 출력 메소드 호출
		contact.userInfo(contact);
		// 수정 메소드 호출
		contact.update(contact);
		// 재출력
		contact.userInfo(contact);

		scanner.close();
	}// 정보출력 메소드

	private void userInfo(Contact c) {
		System.out.println("이름: " + c.getName() + "\n전화번호: " + c.getPhoneNum() + "\n이메일: " + c.getEmail() + "\n생일: "
				+ c.getBirthDay() + "\n그룹: " + c.getGroup() + "\n주소: " + c.getAdress());
	}

	// 수정 메소드
	private void update(Contact c) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("수정할 항목을 선택해 주십시오");
			System.out.println("1. 이름  2. 전화번호 3, 이메일 4. 생일 5. 그룹 6. 주소 7. 수정 완료");
			int userChoice = Integer.parseInt(scanner.nextLine());
			if (userChoice == 1) {
				System.out.println("새로 저장할 이름을 입력하세요.");
				c.setName(scanner.nextLine());
			} else if (userChoice == 2) {
				System.out.println("새로 저장할 전화번호를 입력하세요 ");
				c.setPhoneNum(scanner.nextLine());
			} else if (userChoice == 3) {
				System.out.println("새로 저장할 이메일을 입력하세요 ");
				c.setEmail(scanner.nextLine());
			} else if (userChoice == 4) {
				System.out.println("새로 저장할 생일 날짜를 입력하세요 ");
				c.setBirthDay(scanner.nextLine());
			} else if (userChoice == 5) {
				System.out.println("새로 저장할 그룹명을 입력하세요 ");
				c.setGroup(scanner.nextLine());
			} else if (userChoice == 6) {
				System.out.println("새로 저장할 주소를 입력하세요 ");
				c.setAdress(scanner.nextLine());
			} else if (userChoice == 7) {
				System.out.println("수정 완료");
				break;
			}
			
		}

	}

}
