package work3;
import java.util.Scanner;
public class java0521_5 {

	public static void main(String[] args) {
		/*
		 임의 수를 입력 받고 그 해당하는 수의 구구단을 출력하는 프로그램을 작성하라.
		 */
		
		 Scanner sc = new Scanner(System.in);
		 
		
		System.out.println(">>> " );
		int a = sc.nextInt();
		
		for(int i=1; i <=9; i++) {
		System.out.println(i + "*" + a + "=" + i*a);
		}
		
		
		/*
		System.out.print("원하는 단을 입력하세요 : ");
        Scanner sc = new Scanner(System.in); //키보드로부터 입력 받기  
        int n = sc.nextInt(); //키보드로부터 정수형 값을 입력받아 n에 저장
        for(int i=1; i<=9; i++) // 구구단이 a*i 형태이므로 i의값을 1~9까지 반복실행 
        {
            System.out.println(n+"*"+i+"="+(n*i));// n=키보드로부터 입력받은 숫자, i=1~9
        }
*/
	
	}

}
