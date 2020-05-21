package work3;
import java.util.Scanner;
public class java0521_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 하나의 수를 입력 받고 10의 배수로 입력 받은 수는 어느 범위에 있는지 출력되는
		프로그램을 작성하라.
		 */
		/*
		Scanner scan = new Scanner(System.in);

		int a = 0;
		System.out.println(">>> " );
		a = scan.nextInt();
		
		for(a= 0; a <= 50; a = a + 10) {
			// System.out.println(a);
		}
		
		
		if (a > 35 && a <50 );
		System.out.println(a);
		*/
		int number = 0;
		
		System.out.println("숫자입력 = ");
		number = sc.nextInt();
		
		/*
		if (number > 0 && number < 10) {
			System.out.println("number는 0보다 크고 10보다 작다.");
		}
		else if (number > 10 && number <= 20) {
			System.out.println("number는 10보다 크고 20보다 작거나 같다.");
		}
		*/
		int n = 0;
		for (int i = 0; i < 10; i++) {
			n = 10 * i;	// 0 10 20 30 40 50...90
			if(number > n && number <= (n + 10)) {
				System.out.println("number는" + n + "보다 크고" + n + (n + 10) + "보다 작거나 같다");
			}
		}
		
	}

}
