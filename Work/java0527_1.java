package work9;

public class java0527_1 {

	public static void main(String[] args) {
		/*
		 
	 	toUpperCase 
	 		     문자열 -> 대문자
	 
	 */
		String str = "abcDEF";
		String rStr = toUpperCase(str);
		System.out.println("rStr = " + rStr);

	}

	
	static String toUpperCase(String str) {
		String rStr= "";
		
		for (int i = 0; i < str.length(); i++) {
			//char asc = str.charAt(i);
			int asc = (int)str.charAt(i);
			if(asc > 90) {
				asc = - 32;
				rStr = rStr + (char) asc;
			}else {
				rStr = rStr + asc;
			}
		}return rStr;
	}
}
