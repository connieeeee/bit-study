package work8;

import java.util.Scanner;

public class java0526_2 {

	
	public static void main(String[] args) {
		/*
	  
	 
	 fibonnaci 피보나치 수열
	 
	 0 1 1 2 3 5 8 13 21 34 
	 a b c
	   a b c
	     a b c 
	 loop 30회 int 넘어가서 long
	 
	 */
		
		Scanner sc = new Scanner(System.in);
				
		// a b c
		//	 a b c
		//	   a b c
		
		long a, b, c;
		long arrNum[] = new long[30];
		
		int w = 0;
		
		a = 0;
		b = 1;
		
		arrNum[0] = a;
		arrNum[1] = b;
		
		while(w < 28) {
		
			c = a + b;
			arrNum[w + 2] = c;
			
			// 값을 갱신
			a = b;
			b = c;
			
			w++;
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(arrNum[i] + " ");
		}
		System.out.println();
	}

}
