package work3;
import java.util.Scanner;
public class java0521_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 �ϳ��� ���� �Է� �ް� 10�� ����� �Է� ���� ���� ��� ������ �ִ��� ��µǴ�
		���α׷��� �ۼ��϶�.
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
		
		System.out.println("�����Է� = ");
		number = sc.nextInt();
		
		/*
		if (number > 0 && number < 10) {
			System.out.println("number�� 0���� ũ�� 10���� �۴�.");
		}
		else if (number > 10 && number <= 20) {
			System.out.println("number�� 10���� ũ�� 20���� �۰ų� ����.");
		}
		*/
		int n = 0;
		for (int i = 0; i < 10; i++) {
			n = 10 * i;	// 0 10 20 30 40 50...90
			if(number > n && number <= (n + 10)) {
				System.out.println("number��" + n + "���� ũ��" + n + (n + 10) + "���� �۰ų� ����");
			}
		}
		
	}

}
