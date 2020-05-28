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
			
			// 암호화
			
			//String src= "abc012";
			String src= "hello";
			
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
			
			System.out.println("원본: " + src);
			System.out.println("암호화된 코드: " + resultCode);
			
			// 복호화
			String baseCode = "";
			for (int i = 0; i < resultCode.length(); i++) {
			
			char ch = resultCode.charAt(i);
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
			
			System.out.println("복호화: " + baseCode);

	}

}
