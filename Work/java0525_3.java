package work6;

import java.util.Scanner;

public class java0525_3 {

	public static void main(String[] args) {
		// �빮�ڷ� �Է� -> �ҹ��ڷ� ��ȯ�ؼ� ��� �ǵ���
		// toLowerCase ������� ���� ����
		// ABC -> abc

		
		// A -> 65
		// a -> 97
		//	   +32
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է�= ");
		String _str= sc.next();
		String result = "";		// String result = new String();
		
		// �ѹ��ھ� ����
		for(int i = 0; i < _str.length(); i++) {
			char c= _str.charAt(i);					// <=> _str.indextOf(0)
			if((int)c >= 65 && (int)c <= 90) {		// �빮���� ���
				int n = (int) c + 32;				// �빮�� ��ȯ �κ�
				result = result + (char)n;
			}else {									// �ҹ����� ���
				result = result + (char)c;
			}
			
		}
		System.out.println("���� ���ڿ�: " + _str);
		System.out.println("���� ���ڿ�: " + result);
		
	}

}
