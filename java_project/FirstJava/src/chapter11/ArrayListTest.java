package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<Integer> list = null;
		// list = new ArrayList<Integer>(); Integer 생략 가능(위 선언에서 이미 했기 때문)
		list = new ArrayList<>();

		List<Integer> list2 = new ArrayList<>();

		// 데이터(인스턴스) 저장: add(E e)
		list.add(new Integer(1));
		list.add(10);// new Integer(10) = Auto Boxing
		list.add(13);
		list.add(5);
		list.add(1);

		// 리스트의 요소의 개수
		int size = list.size();
		System.out.println("요소의 갯수: " + size);

		// for 이용 일괄 참조
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------");
		// for each
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		//정렬자(Iterator) 를 이용한 정렬 출력
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		//요소 삭제
		list.remove(2);
		 
		System.out.println("2번지 요소 삭제");
		System.out.println("-------------------------");
		
		// for each
		for(Integer i : list) {
			System.out.println(i);
		}
	}
}
