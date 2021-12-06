package javaAPI;

public class Reverse {
	
	public static void main(String[] args) {
		// 큰 따옴표로 초기화된 "동일" 문자열은 같은 주소값을 공유한다.
				String str1 = "ab";
		        String str2 = "ab";
		        
		        System.out.println(str1.hashCode()); // str1 의 주소값 출력
		        System.out.println(str2.hashCode()); // srt2 의 주소값 출력
		        System.out.println(str1 ==str2); // 같은 주소값이므로 true
		        
		        
		        str2 = str2.replace('a', 'b'); // replace 사용시에는?
		        
		        
		        System.out.println(str1==str2); // false (주소값이 다르다)
		        System.out.println(str1.hashCode()); 
		        System.out.println(str2.hashCode());
		        
		        // 해당 인스턴스의 문자열을 주소값을 유지한채로  변환할 수 없다.
		        // 단, StringBuilder 혹은 Stringbuffer 클래스 사용시 가능하다.
		        // Stringbuilder 
		        // public final class StringBuffer;
		        // (extends Object 
		        // implements Serializable, Comparable<String>, CharSequence )
		        // 유용한 메소드 : compareTo(String anotherString) - treemap 에 사용
		        // concat(String str) = 여러 범위/ 문자열의 텍스트를 결합
		String string1 = "ABCDEFGHIJKLMN";
		String string2 = "990929-1010123";
		StringBuilder stringBuilder = new StringBuilder(string1);
        System.out.println(stringBuilder.reverse());
        String restr = string2.replaceAll("[^0-9]", "");
		System.out.println(restr);


	}
}
