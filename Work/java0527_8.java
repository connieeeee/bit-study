package work9;

public class java0527_8 {

	public static void main(String[] args) {
		/*
		 ������ ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷��̴�.
		  (1)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�. 
 
			
		

		
		 */
		/*
		
		*/
		
		String str = "abc01234";
		
		String  scode = security(str);
		System.out.println("��ȣȭ: " + scode);
		String dcode = deciphering(scode);
		System.out.println("��ȣȭ: " + dcode);
	
	}

	static String security(String src) {
		
		char[] abcCode =   {  
				'`','~','!','@','#',
				'$','%','^','&','*',  
				'(',')','-','_','+',
				'=','|','[',']','{',  
				'}',';',':',',','.','/'
		}; 


		char[] numCode = {
			'q','w','e','r','t',
			'y','u','i','o','p'
			}; 
		
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
		
		return resultCode;
	} 
	
	static String deciphering(String src) {
		char[] abcCode =   {  
				'`','~','!','@','#',
				'$','%','^','&','*',  
				'(',')','-','_','+',
				'=','|','[',']','{',  
				'}',';',':',',','.','/'
		}; 


		char[] numCode = {
			'q','w','e','r','t',
			'y','u','i','o','p'
			}; 
		
		String baseCode = "";
		for (int i = 0; i < src.length(); i++) {
			
			char ch = src.charAt(i);
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
		return baseCode;
	}
	
	
}























