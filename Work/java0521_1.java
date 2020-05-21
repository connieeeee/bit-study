package work3;

public class java0521_1 {

	public static void main(String[] args) {
		/*
		 
		 1 ~ 1000사이에 수를 전부 합친 값을 출력하라.
		 1부터 1000사이 수의 합은:
		 
		 
		int sum = 0;
		for(int i = 1; i < 1000; i++ ) {
			sum = sum + i;
		}
		System.out.println("1부터 1000사이 수의 합은: " + sum );
		*/
		
		
		int sum;
		int num;	// 많이 쓰는 변수는 따로 만들기
		
		// initialize
		sum = 0;	// 초기화
		num = 1;
		
		// processing
		for(int i = 0; i < 1000; i++) {
			sum = sum + num;
			//num++;
			num = num + 1;
		}
		
		// printing
		System.out.println("합계: " + sum);
		
	}

}
