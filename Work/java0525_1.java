package work7;

import java.util.Scanner;

public class java0525_1 {

	public static void main(String[] args) {
		/*
		  
		  ���� ��� ���α׷�
		 
		 ��踦 ���� �� �л��� ��?
		 
		 �����Ҵ� -> student[�л��� ��][4]
		 ȫ�浿 : 90 100 85
		 ������ : 100 96 80
		 
		 �̸�, ���� ���� �Է�
		 >> ���ڷ� �Է�
		 ���ڷ� �Է��� �ȵ� ��� 
		 >> �ٽ� �Է��� �ֽʽÿ�
		 
		 1 ~ 100 ������ ���� ���� ���
		 >>������ �ʰ��߽��ϴ�.
		 
		 
		 ���� �� �ְ�, ���� ����
		 
		 ��� ������ ����
		 
		 �л� ���� ���� ���
		 
		 
		*/
		
		Scanner sc = new Scanner(System.in);
		/*
		int student, score;
		int a = 0 , b = 0, c = 0;
		int i = 0;
		
		String n = null;
		
		System.out.println("���� ��� ���α׷�");
		
		System.out.println("��踦 ������ �л��� �� ");
		student = sc.nextInt();
		
		for(i = 0; i < student; i++) {
			System.out.println("�̸��� �Է��ϼ���: ");
			 n = sc.next();{
				 for(int j=0; j < n.length();j++) {
					 System.out.println("���� : ");
					 	a = sc.nextInt();
					 System.out.println("���� : ");
					 	b = sc.nextInt();
					 System.out.println("���� : ");
					 	c = sc.nextInt();
					
				 }	break;
				
			}
			
			 
			
			}
		 System.out.print(n);
			 System.out.println(" ���� : " + a);
			 System.out.println(" ���� : " + b);
			 System.out.println(" ���� : " + c);
		
		//int StudentNo[][] = new int[student][i];
		//	{
			
			
			*/
			
		
		
		// �л� ���� ������ 2���� �迭
		// String -> �̸�, ���� -> parseInt	int -> ����
		//			  �л���, �̸� + ����(����, ����, ����)
		// �����
		String student[][] = null;
		int count;		// �л���
		
		// 1. �л� ���� �Է�
		System.out.print("�л����� �Է� = ");
		count = sc.nextInt();
		
		// 2. �����Ҵ�
		student = new String[count][4];		// ī��Ʈ�� ���缭 ����Ʈ�� ����
		
		// 3. �Է�: �̸�, ����, ����, ����
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "��° �л� >>");			
			
			System.out.print("�̸�:");
			String name = sc.next();
			
			String lang = "";
			while(true) {
				System.out.print("����:");
				lang = sc.next();	// 98 100 10a
				
				boolean check = false;
				for(int j = 0;j < lang.length(); j++) {
					char c = lang.charAt(j);
					if((int)c < 48 || (int)c > 57) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�");
					continue;
				}
				
				// 1 ~ 100������ ���� 
				// >> ������ �ʰ� �߽��ϴ�
				int numLang = Integer.parseInt(lang);
				if(numLang < 0 || numLang > 100) {
					System.out.println("������ �ʰ��� �����Դϴ�. �ٽ� �Է��� �ֽʽÿ�");
					continue;
				}
				
				break;
			}
			
			// ����
			System.out.print("����:");
			String eng = sc.next();
			
			// ����
			System.out.print("����:");
			String math = sc.next();
			
			// �����͸� �迭�� ����
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = eng;
			student[i][3] = math;			
		}	
		
		// ���
		for (int j = 0; j < student.length; j++) {
			System.out.print(j + ":"); 
			for (int j2 = 0; j2 < student[0].length; j2++) {
				System.out.print(student[j][j2] + "\t");
			}
			System.out.println();			
		}
			int stuCount[][] = new int[student.length][3];
			for (int i = 0; i < student.length; i++) {
				stuCount[i][0]= Integer.parseInt(student[i][1]);	//����
				stuCount[i][0]= Integer.parseInt(student[i][2]);	//����
				stuCount[i][0]= Integer.parseInt(student[i][3]);	//����
			}
		// 4. ����, ����, ���� �ְ� ����. 	max
			int max = stuCount[0][1];
			for (int j = 0; j < student.length; j++) {
				if(max < stuCount[j][0]) {
					max = stuCount[j][0];
				}
			}
		// 5. ����, ����, ���� ���� ����	min

			int min = stuCount[0][1];
			for (int j = 0; j < student.length; j++) {
				if(min > stuCount[j][1]) {
					min = stuCount[j][1];
				}
			}
		// 6. ��� ������ ����
			int sum = 0;
			for (int j = 0; j < stuCount.length; j++) {
				for (int j2 = 0; j2 < stuCount[0].length; j2++) {
					sum = sum + stuCount[j][j2];
				}
			}
		
		// 7. �л� ���� ���� ��
			double avg = sum / (double)student.length;
		
		// ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
	}
}
