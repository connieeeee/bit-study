package work9;

public class java0527_8_1 {

	public static void main(String[] args) {
					char[] abcCode =   {  
							'`','~','!','@','#',
							'$','%','^','&','*',  
							'(',')','-','_','+',
							'=','|','[',']','{',  
							'}',';',':',',','.','/'
					}; 
			
			// 0 1 2 3 4 5 6 7 8 9  
			char[] numCode = {
				'q','w','e','r','t',
				'y','u','i','o','p'
				}; 
			
			// ��ȣȭ
			
			//String src= "abc012";
			String src= "hello";
			
			String resultCode = "";
			
			for (int i = 0; i < src.length(); i++) {
			
			char ch = src.charAt(i);
			int n = (int)ch;
			
			// ���ĺ��� ���
			if(n >= 97 && n <= 122) {
				 n = n - 97;	// 97 == 0
				 resultCode = resultCode + abcCode[n];
			}
			// ������ ���
			if (n>= 48 && n <= 57) {
				n = n -48;		// 48 == 0
				resultCode = resultCode + numCode[n];
			}
			}
			
			System.out.println("����: " + src);
			System.out.println("��ȣȭ�� �ڵ�: " + resultCode);
			
			// ��ȣȭ
			String baseCode = "";
			for (int i = 0; i < resultCode.length(); i++) {
			
			char ch = resultCode.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			if (n >= 97 && n <= 122) {		// ��ȣȭ�� ����
				for (int j = 0; j < numCode.length; j++) {
					if(ch == numCode[j]) {
						index = j;	// 0 ~ 9 index number
						break;
					}
				}
				index = index + 48;		// ���ڰ� 0 ~ 9 �ƽ�Ű�ڵ尪
				baseCode = baseCode + (char)index;
			}
			else {							// ��ȣȭ�� ���ĺ�
				for (int j = 0; j < abcCode.length; j++) {
					if (ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;		// �ҹ��� a���� ����
				baseCode = baseCode + (char)index;
			}
			}
			
			System.out.println("��ȣȭ: " + baseCode);

	}

}
