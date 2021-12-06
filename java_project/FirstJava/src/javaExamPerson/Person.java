package javaExamPerson;
import java.util.Calendar;
//1.Person 이라는 클래스를 정의해봅시다.
//
//①이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
//
//②인사하는 메소드를 정의해봅시다. - 
//“안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
public class Person {
	String name;
	String id;

	// ④Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public Person() {
		
	}
	

	public void hi() {
		System.out.println("안녕하세요. 저는 " + name + " 입니다. "+ age() + "살 입니다.");
	}
	//나이계산 메소드
	public String age() {
		String age = id.substring(0,2);
		String idTemp = id.replaceAll("-", "");
		if(Integer.parseInt(age) <= 99 && Integer.parseInt(age)>=0) {
			age = "19".concat(age);
			if(idTemp.charAt(6) == '3' || idTemp.charAt(6) == '4') {
				age = String.valueOf((Integer.parseInt(age) + 100));
			}
		}
		return String.valueOf((Calendar.getInstance().get(Calendar.YEAR))-Integer.parseInt(age));
	}
}
