package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.sun.javafx.collections.MappingChange.Map;

public class TreeSetTest2 {

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("SON", 28));
		set.add(new Person("LEE", 20));
		set.add(new Person("Park", 40));
		set.add(new Person("KIM", 40));
		
		Iterator<Person> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
