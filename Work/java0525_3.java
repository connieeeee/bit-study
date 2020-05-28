package work6;

import java.util.Scanner;

public class java0525_3 {

	public static void main(String[] args) {
		// 대문자로 입력 -> 소문자로 변환해서 출력 되도록
		// toLowerCase 사용하지 말고 구현
		// ABC -> abc

		
		// A -> 65
		// a -> 97
		//	   +32
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력= ");
		String _str= sc.next();
		String result = "";		// String result = new String();
		
		// 한문자씩 산출
		for(int i = 0; i < _str.length(); i++) {
			char c= _str.charAt(i);					// <=> _str.indextOf(0)
			if((int)c >= 65 && (int)c <= 90) {		// 대문자인 경우
				int n = (int) c + 32;				// 대문자 변환 부분
				result = result + (char)n;
			}else {									// 소문자인 경우
				result = result + (char)c;
			}
			
		}
		System.out.println("원본 문자열: " + _str);
		System.out.println("변한 문자열: " + result);
		
	}

}
