package work3;
import java.util.Scanner;
public class java0521_8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("ù ��° ��: ");
		int a = sc.nextInt();

		System.out.println("������: ");
		int b = sc.nextInt();

		System.out.println("�� ��° ��: ");
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
		
		System.out.println("ù��° �� = ");
		num1 = sc.nextInt();
		
		System.out.println("(+, -, *, /) =");
		oper = sc.next();
			
		System.out.println("�ι�° �� =");	// �������� �� 0�� ������ �ȵȴ�
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
