package work9;

public class java0527_4 {

	public static void main(String[] args) {
		/*
		  메소드명 : shuffle 
		  기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 
		  처리한 배열을 반홖한다. 
		  반환타입 : int[] 
		  매개변수 : int[] arr – 정수 값이 담긴 배열 
		 
		 */
		
		int original[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);		// 함수 호출된 후 original 실행 
		System.out.println(java.util.Arrays.toString(result));
		

	}

	
	static int[] shuffle(int[]original) {	// 제일 첫번째 있는 배열이 넘어간다.
		int temp;
		
		for (int i = 0; i < 100; i++) {		// random을 수행하기 위한 loop(회차)
			int r1 = (int)(Math.random() * original.length);	// 0 ~ 8
			int r2 = (int)(Math.random() * original.length);
			
			temp = original[r1];
			original[r1] = original[r2];
			original[r2] = temp;
			
		}
			return original;
		
	}
}
