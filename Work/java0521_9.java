package work3;
import java.util.Scanner;
public class java0521_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 유저로부터 입력 받은 수들의 합계와 평균을 구하는 프로그램을 작성하라.\ 
		연산하고 싶은 숫자의 개수를 입력>> 
		 
		배열 동적 할당>> 
		 
		개수에 맞게 숫자를 입력 받음>> 
		 
		합계를 연산 
		 
		평균을 연산 
		 
		출력 
 
		 */
		
		// 선언
		int numArr[] = null;	// int *numArr	-> 참조 = null(0)	nul(빈문자)
								// 0xffffffff
								// 1111 -> f -> 4 bit
		int sum;				// 합계 변수
		double avg; 			// 평균 변수
		int count;
		
		// 초기화
		sum = 0;
		
		// 연산하고 싶은 숫자의 개수를 입력
		System.out.print("연산하고 싶은 숫자의 개수를 입력= ");
		count = sc.nextInt();
		
		// 그 개수에 맞게 배열 확보(동적 할당 = 참조)
		numArr = new int[count]; // 0 ~ n-1
		
		// 합계를 산출 할 숫자들을 입력
		for(int i = 0; i < numArr.length; i++) {	// 배열의 길이값 length
			System.out.println((i + 1) + "번째 수=");
			numArr[i] = sc.nextInt();
		}
		
		// 합계 산출
		for(int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		
		// 평균 산출
		avg = (double)sum / count;
		
		// 결과 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("숫자들: " +numArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
