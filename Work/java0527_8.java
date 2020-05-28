package work9;

public class java0527_8 {

	public static void main(String[] args) {
		/*
		 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
		  (1)에 알맞은 코드를 넣어서 완성하시오. 
 
			
		

		
		 */
		/*
		
		*/
		
		String str = "abc01234";
		
		String  scode = security(str);
		System.out.println("암호화: " + scode);
		String dcode = deciphering(scode);
		System.out.println("복호화: " + dcode);
	
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
					
					// 알파벳의 경우
					if(n >= 97 && n <= 122) {
						 n = n - 97;	// 97 == 0
						 resultCode = resultCode + abcCode[n];
					}
					// 숫자의 경우
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
			if (n >= 97 && n <= 122) {		// 암호화된 숫자
				for (int j = 0; j < numCode.length; j++) {
					if(ch == numCode[j]) {
						index = j;	// 0 ~ 9 index number
						break;
					}
				}
				index = index + 48;		// 숫자가 0 ~ 9 아스키코드값
				baseCode = baseCode + (char)index;
			}
			else {							// 암호화된 알파벳
				for (int j = 0; j < abcCode.length; j++) {
					if (ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;		// 소문자 a부터 시작
				baseCode = baseCode + (char)index;
			}
		}
		return baseCode;
	}
	
	
}























