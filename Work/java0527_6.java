package work9;

public class java0527_6 {

	public static void main(String[] args) {
		String num;
		/*
		 �޼ҵ�� : isNumber 
		 �� �� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�. 
		 ��� ���ڷθ� �̷���� ������ true�� ���Q�ϰ�, �׷��� ������ false�� ���Q�Ѵ�. 
		 ���� �־��� ���ڿ��� null�̰ų� �� ���ڿ������̶�� false�� ���Q�Ѵ�. 
		 ���QŸ�� : boolean 
		 �Ű����� : String str - �˻��� ���ڿ� 
 
		[Hint] StringŬ������ charAt(int i)�޼ҵ带 ����ϸ� ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�. 
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
