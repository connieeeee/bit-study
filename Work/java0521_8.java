package work3;
import java.util.Scanner;
public class java0521_8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("첫 번째 수: ");
		int a = sc.nextInt();

		System.out.println("연산자: ");
		int b = sc.nextInt();

		System.out.println("두 번째 수: ");
		int c = sc.nextInt();
		char sign;
		sign=sc.next().charAt(0);
		if (sign == '+') {
			System.out.println(a + b );
		}
					*/
		
		int num1, num2;
		String oper;	// + - * /
		int result = 0;
		
		System.out.println("첫번째 수 = ");
		num1 = sc.nextInt();
		
		System.out.println("(+, -, *, /) =");
		oper = sc.next();
			
		System.out.println("두번째 수 =");	// 나누기일 때 0이 나오면 안된다
		num2 = sc.nextInt();
		
		switch( oper ) {
		case "+":
			result = num1 + num2;
			break;
		
		case "-":
			result = num1 - num2;
			break;
		
		case "*":
			result = num1 * num2;
			break;
			
		case "/":
			result = num1 / num2;
			break;
						
	}
		System.out.println(num1 + " " + oper + num2 + "=" + result);
		
		
	}

}
