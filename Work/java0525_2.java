package work6;

import java.util.Scanner;

public class java0525_2 {

	public static void main(String[] args) {
		/*
		  
		  �Է� : ����, �Ǽ��� �Ǻ��� �ڵ带 �ۼ�
		  	-> String		"123.456" "123456"
		  	
		  	�Ǽ��� "�Ǽ��Դϴ�."
		  	������ "�����Դϴ�."
		 
		/
		
		Scanner sc = new Scanner(System.in);
		double a = 0.0;
		
		
		System.out.println("���ڸ� �Է����ּ���>> " );
		a = sc.nextDouble();
		
		
		while(true) {
		for(double num = 0.0; num <= a; num += 0.1) {
			if(num %a == 0) {
				System.out.println("�����Դϴ�."); 
			}else if ((num % a) <= 0) {
				System.out.println("�Ǽ��Դϴ�.");
			}break;
			
		}
		}

		
		String num ;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		num = sc.next();
		int cnum = Integer.parseInt(num);
		
		for (int i = 0; i <= cnum; i++) {
			char n = num.charAt(i);
			if(n == '.') {
				System.out.println("�Ǽ��Դϴ�.");
		}
		
		}
		/*
		n = num.charAt(3);
		if(n == '.') {
			System.out.println("�Ǽ��Դϴ�");
		}
		
		/*
		for (double i = 0.0; i < num; i+=0.1) {
		if(num % i == 0){
		System.out.println("���� �Դϴ� : "+(int)num);
		break;
		}else if((num % i) <= 0.1) {
		System.out.println("�Ǽ� �Դϴ� : "+num);
		break;

		}

		}
		*/
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" ���� �Է� = ");
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
			System.out.println("�Ǽ��Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
	}

}
