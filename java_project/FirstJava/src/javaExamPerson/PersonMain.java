package javaExamPerson;

//3.main()메소드를 정의해봅시다.
//
//①Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//
//②생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
public class PersonMain {
	public static void main(String[] args) {
	Male m1 = new Male("김", "941029-1000000" , "직장인");
	Female f1 = new Female("박", "110101-460000", "초등학생");
	
	m1.hi();
	System.out.println();
	f1.hi();
	}
}
