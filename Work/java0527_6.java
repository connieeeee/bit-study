package work9;

public class java0527_6 {

	public static void main(String[] args) {
		String num;
		/*
		 메소드명 : isNumber 
		 기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다. 
		 모두 숫자로만 이루어져 있으면 true를 반홖하고, 그렇지 않으면 false를 반홖한다. 
		 만일 주어진 문자열이 null이거나 빈 문자열“”이라면 false를 반홖한다. 
		 반홖타입 : boolean 
		 매개변수 : String str - 검사할 문자열 
 
		[Hint] String클래스의 charAt(int i)메소드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다. 
		 */
		int num1;
		num = isNumber("1");
		num1 = Integer.parseInt(num);
		int NumInput[] = {1,2,3,4}; 
		System.out.println(num1);
	}

	static String isNumber(String num12) {
		while(true) {
			String NumInput = null;
			boolean b = numberOk(NumInput);
			if(b == true) {
				System.out.println("false");
				continue;
			}
			break;
		}
		return num12;
	}
		
	static boolean numberOk(String snum) {
		boolean noNumber = false;
		for (int i = 0; i < snum.length(); i++) {
			char c = snum.charAt(i);
			if((int)c < 47 || (int) c > 57) {
				noNumber = true;
				break;
			}
		}return noNumber;
		}
	
}
