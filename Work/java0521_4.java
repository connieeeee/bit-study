package work3;

public class java0521_4 {

	public static void main(String[] args) {
		/*
		 구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
		(for, while)
		1 * 1 = 1 1 * 2 = 2 1 * 3 = 3...	
		 */
		/*
		for(int i = 1; i <= 9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + j*i);
			}
		}
		*/
		
		for(int i = 1; i < 10; i++) {
			
			for(int j = 1; j <= 10; j++) {
				
				System.out.print(i + "x" + j + "=" + i*j + " ");
				}
			System.out.println();
		}
	}

}
