package work3;
import java.util.Scanner;
public class java0521_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 �����κ��� �Է� ���� ������ �հ�� ����� ���ϴ� ���α׷��� �ۼ��϶�.\ 
		�����ϰ� ���� ������ ������ �Է�>> 
		 
		�迭 ���� �Ҵ�>> 
		 
		������ �°� ���ڸ� �Է� ����>> 
		 
		�հ踦 ���� 
		 
		����� ���� 
		 
		��� 
 
		 */
		
		// ����
		int numArr[] = null;	// int *numArr	-> ���� = null(0)	nul(����)
								// 0xffffffff
								// 1111 -> f -> 4 bit
		int sum;				// �հ� ����
		double avg; 			// ��� ����
		int count;
		
		// �ʱ�ȭ
		sum = 0;
		
		// �����ϰ� ���� ������ ������ �Է�
		System.out.print("�����ϰ� ���� ������ ������ �Է�= ");
		count = sc.nextInt();
		
		// �� ������ �°� �迭 Ȯ��(���� �Ҵ� = ����)
		numArr = new int[count]; // 0 ~ n-1
		
		// �հ踦 ���� �� ���ڵ��� �Է�
		for(int i = 0; i < numArr.length; i++) {	// �迭�� ���̰� length
			System.out.println((i + 1) + "��° ��=");
			numArr[i] = sc.nextInt();
		}
		
		// �հ� ����
		for(int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		
		// ��� ����
		avg = (double)sum / count;
		
		// ��� ���
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("���ڵ�: " +numArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
	}

}
