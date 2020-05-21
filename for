package forClss;

public class mainClass {

	public static void main(String[] args) {
		/*
		 
		 	loop문, 순황문
		 	지정한 회수만큼 반복을 하는 제어문
		 	연산을 간결하게 할 수 있음
		 	
		 	for, while, do while
		 	
		 	for( 초기화; 조건; 연산식){
		 	
		 		// 처리
		 	
		 	}
		 	
		 	// for + if
		 	 
		 	 
		 	int num = 0;
		 	num = num + 1;
		 	num++;
		 	num++;
		 	num++;
		 	num++;
		 	num++;
		 	num++;
		 	num++;
			
			for( 초기화(1) ; 조건문(4)(7)(10); 연산식(3)(6)(9) ) {
				
				처리(2)(5)(8)
			}
			(11) // false 나올 경우 탈출
		
		int i;
		
		for(i=0; i < 10; i++) {
			System.out.println("i = " + i);
		}

		System.out.println("loop out i =" + i);
		
		
		int j;
		int num = 0;
		for(j = 1; j <= 10; j++) {
			num = num +j;
		}
		System.out.println("num = " + num);
		
		
		for(int i = 0; i < 10; i++ ) {		// 괄호 안에 변수를 넣으면 {}에서만 작동 // for문은 loop형을 돌리기 위함
			System.out.println(i);
		}
		
		int n;
		for(n = 0; n < 10; n++) {
			System.out.println( n );
		}
		
		for (int i = 0; i < 10; i++) {
			// 지역
		}
		
		for(int i = 10;i > 0; i--) {
			System.out.println("i = " + i);
		}
		
		for(int i = 0; i < 10; i = i + 2 ) {
			System.out.println("i = "+ i);
		}
		/*
		int count = 0;
		for( ; count < 10 ;  ) {
			System.out.println("count = " + count );
			count++;	// 연산식 안쓰면 무한루프
		}
		
		for(int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		
		
		// for문 안에 for문
		
		// 구구단 2단의 모든 합을 구하라 
		*/
		
		int sum = 0;
		for(int i = 2; i <= 20; i = i + 2) {
			System.out.println("i = " + i);
			sum = sum + i;
		}
		System.out.println("합: " + sum);
		/*
		sum = 0;
		int num2 = 3;
		for(int i = 0; i < 10; i++) {
			sum = sum + num2;
			num2 = num2 + 3;
		}
		System.out.println("합: " + sum);
		*/
		
		// 이중 for문
		
		/*
		for(int i = 0; i < 5; i++) {	// loop 10
			System.out.println("i = " + i);
			
			for(int j = 0; j < 2; j++ )		// for문 안에 같은 변수를 적으면 에러
				System.out.println("\tj = " + j);
		}
		*/
	
	
	}	

}
