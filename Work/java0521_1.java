package work3;

public class java0521_1 {

	public static void main(String[] args) {
		/*
		 
		 1 ~ 1000���̿� ���� ���� ��ģ ���� ����϶�.
		 1���� 1000���� ���� ����:
		 
		 
		int sum = 0;
		for(int i = 1; i < 1000; i++ ) {
			sum = sum + i;
		}
		System.out.println("1���� 1000���� ���� ����: " + sum );
		*/
		
		
		int sum;
		int num;	// ���� ���� ������ ���� �����
		
		// initialize
		sum = 0;	// �ʱ�ȭ
		num = 1;
		
		// processing
		for(int i = 0; i < 1000; i++) {
			sum = sum + num;
			//num++;
			num = num + 1;
		}
		
		// printing
		System.out.println("�հ�: " + sum);
		
	}

}
