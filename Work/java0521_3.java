package work3;

public class java0521_3 {

	public static void main(String[] args) {
		/*
		 1 ~ 100 사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라.
		1부터 100 사이 짝수의 합은:
		1부터 100 사이 홀수의 합은:
		 */

		/*
		int sum=0;
		int b=0;
		int a;
		for(a=1; a < 100; a = a + 2) {
			sum = sum + a;
			b= a%1;
		}
		
		System.out.println("1부터 100사이 짝수의 합은: "+ sum);
		System.out.println("1부터 100사이 홀수의 합은: "+ b);
		*/
		
		int sum1, sum2;
		sum1 = sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {	// 홀수
				sum1 = sum1 + i;
			}else {				// 짝수
				sum2 = sum2 + i;
			}
		}
		System.out.println("홀수의 합: "+ sum1);
		System.out.println("짝수의 합: "+ sum2);
	}

}
