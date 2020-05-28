package work9;

import java.util.Scanner;

public class java0527_2 {

	public static void main(String[] args) {
		/*
		 	함수	: 두 수를 나눈 몫, 나머지를 구하는 함수 
		 			num1, num2
		 			value(몫), tag(나머지)
		 
		 */
		/*
		int num1, num2;
		String numA, numB;
		
	numA = number("첫번째 수:");
	
	numB = number("두번째 수:");
			
		
	num1 = Integer.parseInt(numA);
	num2 = Integer.parseInt(numB);
	
	System.out.println("두 수를 나눈 몫:" + (num1 / num2));
	System.out.println("나머지: " + (num1 % num2));
	*/
		
		int num1, num2;
		int value, tag[];
		
		tag = new int[1];
		num1 = 10;
		num2 = 3;
		
		value = div(num1, num2, tag);
		System.out.println("몫: " + value);
		System.out.println("나머지: " + tag[0]);
	}
	
	
	
	
	/*
	static String number(String num12) {
		Scanner sc = new Scanner (System.in);
		String num;
		while(true) {
			System.out.println(num12);
			num = sc.next();
			break;
		}
		return num12;
		
	
		
		static int */
	
	static int div(int n1, int n2, int t[]) {
		
		int v;
		v = n1/ n2;
		t[0] = n1 % n2;
		
		return v;
	}

	

	
	
	
	
	
	
}
