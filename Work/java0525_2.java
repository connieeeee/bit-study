package work6;

import java.util.Scanner;

public class java0525_2 {

	public static void main(String[] args) {
		/*
		  
		  입력 : 정수, 실수를 판별할 코드를 작성
		  	-> String		"123.456" "123456"
		  	
		  	실수면 "실수입니다."
		  	정수면 "정수입니다."
		 
		/
		
		Scanner sc = new Scanner(System.in);
		double a = 0.0;
		
		
		System.out.println("숫자를 입력해주세요>> " );
		a = sc.nextDouble();
		
		
		while(true) {
		for(double num = 0.0; num <= a; num += 0.1) {
			if(num %a == 0) {
				System.out.println("정수입니다."); 
			}else if ((num % a) <= 0) {
				System.out.println("실수입니다.");
			}break;
			
		}
		}

		
		String num ;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		num = sc.next();
		int cnum = Integer.parseInt(num);
		
		for (int i = 0; i <= cnum; i++) {
			char n = num.charAt(i);
			if(n == '.') {
				System.out.println("실수입니다.");
		}
		
		}
		/*
		n = num.charAt(3);
		if(n == '.') {
			System.out.println("실수입니다");
		}
		
		/*
		for (double i = 0.0; i < num; i+=0.1) {
		if(num % i == 0){
		System.out.println("정수 입니다 : "+(int)num);
		break;
		}else if((num % i) <= 0.1) {
		System.out.println("실수 입니다 : "+num);
		break;

		}

		}
		*/
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" 숫자 입력 = ");
		String strNum= sc.next();
		
		boolean floatTrue = true;
		
		for (int i = 0; i < strNum.length(); i++) {
			char c = strNum.charAt(i);
			if(c == '.') {	//(int)c==46
				floatTrue = true;
				break;
			}
		}
		if(floatTrue) {
			System.out.println("실수입니다.");
		}else {
			System.out.println("정수입니다.");
		}
	}

}
