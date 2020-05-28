package work9;

public class java0527_5 {

	public static void main(String[] args) {
		/*
		 메소드명 : max 
		 기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반홖한다. 
		 만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다. 
		 반환타입 : int 
		 매개변수 : int[] arr - 최대값을 구할 배열 
		 */
		
		int[] data= {1, 2, 3, 4, 5, 6};
		System.out.println(java.util.Arrays.toString(data));
		int r = max(data);
		System.out.println("최대값: " + r);
		System.out.println("최대값: " + max(data));
	}
	
	static int max(int data[]) {
		int max_num = data[0];		// 첫번째 배열을 넣으면 오류가 안난다. 0= 마이너스가 될수있기때문에x
		for (int i = 0; i < data.length; i++) {
			if (max_num < data[i]) {
				max_num = data[i];
			}
		}
		return max_num;
	}
	
	
}
