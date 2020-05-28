package work9;

public class java0527_3 {

	public static void main(String[] args) {

		// 듀두 점 (x,y)와 (x1, y1)간의 거리를 구한다. 루트 (y1- y)2 + (x1 - x)2
		double dis = getDistance(1, 1, 2, 2);
		System.out.println("거리: " + dis);
		
	}


	static double getDistance(int x, int y, int x1, int y1) {
		
		/*
		double dx, dy;
		double result;
		
		// 루트 (y1- y)2 + (x1 - x)2
		// 루트	: sqrt		승수	: pow
		dx = Math.pow(y1-y, 2);
		dy = Math.pow(x1 - x, 2);
		
		result = Math.sqrt(dy + dx);
		return result;
	*/
		return Math.sqrt(Math.pow(y1-y, 2)+ Math.pow(x1-x, 2));
	}
		
	
	
	
	
}
