package work3;

public class java0521_3 {

	public static void main(String[] args) {
		/*
		 1 ~ 100 ���̿� ¦���� �հ� Ȧ���� ���� ���� ����ϵ��� �ۼ��϶�.
		1���� 100 ���� ¦���� ����:
		1���� 100 ���� Ȧ���� ����:
		 */

		/*
		int sum=0;
		int b=0;
		int a;
		for(a=1; a < 100; a = a + 2) {
			sum = sum + a;
			b= a%1;
		}
		
		System.out.println("1���� 100���� ¦���� ����: "+ sum);
		System.out.println("1���� 100���� Ȧ���� ����: "+ b);
		*/
		
		int sum1, sum2;
		sum1 = sum2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {	// Ȧ��
				sum1 = sum1 + i;
			}else {				// ¦��
				sum2 = sum2 + i;
			}
		}
		System.out.println("Ȧ���� ��: "+ sum1);
		System.out.println("¦���� ��: "+ sum2);
	}

}
