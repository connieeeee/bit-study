package work9;

public class java0527_3 {

	public static void main(String[] args) {

		// ��� �� (x,y)�� (x1, y1)���� �Ÿ��� ���Ѵ�. ��Ʈ (y1- y)2 + (x1 - x)2
		double dis = getDistance(1, 1, 2, 2);
		System.out.println("�Ÿ�: " + dis);
		
	}


	static double getDistance(int x, int y, int x1, int y1) {
		
		/*
		double dx, dy;
		double result;
		
		// ��Ʈ (y1- y)2 + (x1 - x)2
		// ��Ʈ	: sqrt		�¼�	: pow
		dx = Math.pow(y1-y, 2);
		dy = Math.pow(x1 - x, 2);
		
		result = Math.sqrt(dy + dx);
		return result;
	*/
		return Math.sqrt(Math.pow(y1-y, 2)+ Math.pow(x1-x, 2));
	}
		
	
	
	
	
}
