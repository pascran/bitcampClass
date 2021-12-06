package javaExamPerson;
//2.Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//
//①각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.

public class Female extends Person {
	String work;
	public Female(String name, String id, String work) {
		super(name,id);
		this.work = work;
	}
	public Female(){
		
	}
	//③Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	@Override
	public void hi() {
		super.hi();
		System.out.printf("저는 여자이고, %s입니다.", work);
	}
	
}
