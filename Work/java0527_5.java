package work9;

public class java0527_5 {

	public static void main(String[] args) {
		/*
		 �޼ҵ�� : max 
		 �� �� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ���Q�Ѵ�. 
		 ���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���, -999999�� ��ȯ�Ѵ�. 
		 ��ȯŸ�� : int 
		 �Ű����� : int[] arr - �ִ밪�� ���� �迭 
		 */
		
		int[] data= {1, 2, 3, 4, 5, 6};
		System.out.println(java.util.Arrays.toString(data));
		int r = max(data);
		System.out.println("�ִ밪: " + r);
		System.out.println("�ִ밪: " + max(data));
	}
	
	static int max(int data[]) {
		int max_num = data[0];		// ù��° �迭�� ������ ������ �ȳ���. 0= ���̳ʽ��� �ɼ��ֱ⶧����x
		for (int i = 0; i < data.length; i++) {
			if (max_num < data[i]) {
				max_num = data[i];
			}
		}
		return max_num;
	}
	
	
}
