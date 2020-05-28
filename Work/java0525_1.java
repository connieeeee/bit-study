package work7;

import java.util.Scanner;

public class java0525_1 {

	public static void main(String[] args) {
		/*
		  
		  성적 통계 프로그램
		 
		 통계를 산출 할 학생의 수?
		 
		 동적할당 -> student[학생의 수][4]
		 홍길동 : 90 100 85
		 일지매 : 100 96 80
		 
		 이름, 과목 점수 입력
		 >> 숫자로 입력
		 숫자로 입력이 안될 경우 
		 >> 다시 입력해 주십시오
		 
		 1 ~ 100 사이의 숫자 외의 경우
		 >>범위를 초과했습니다.
		 
		 
		 과목 중 최고, 최저 점수
		 
		 모든 점수의 총합
		 
		 학생 수에 따른 평균
		 
		 
		*/
		
		Scanner sc = new Scanner(System.in);
		/*
		int student, score;
		int a = 0 , b = 0, c = 0;
		int i = 0;
		
		String n = null;
		
		System.out.println("성적 통계 프로그램");
		
		System.out.println("통계를 산출할 학생의 수 ");
		student = sc.nextInt();
		
		for(i = 0; i < student; i++) {
			System.out.println("이름을 입력하세요: ");
			 n = sc.next();{
				 for(int j=0; j < n.length();j++) {
					 System.out.println("국어 : ");
					 	a = sc.nextInt();
					 System.out.println("영어 : ");
					 	b = sc.nextInt();
					 System.out.println("수학 : ");
					 	c = sc.nextInt();
					
				 }	break;
				
			}
			
			 
			
			}
		 System.out.print(n);
			 System.out.println(" 국어 : " + a);
			 System.out.println(" 영어 : " + b);
			 System.out.println(" 수학 : " + c);
		
		//int StudentNo[][] = new int[student][i];
		//	{
			
			
			*/
			
		
		
		// 학생 성적 관리용 2차원 배열
		// String -> 이름, 숫자 -> parseInt	int -> 숫자
		//			  학생수, 이름 + 과목(국어, 영어, 수학)
		// 선언부
		String student[][] = null;
		int count;		// 학생수
		
		// 1. 학생 수를 입력
		System.out.print("학생수를 입력 = ");
		count = sc.nextInt();
		
		// 2. 동적할당
		student = new String[count][4];		// 카운트에 맞춰서 포인트가 생김
		
		// 3. 입력: 이름, 국어, 영어, 수학
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "번째 학생 >>");			
			
			System.out.print("이름:");
			String name = sc.next();
			
			String lang = "";
			while(true) {
				System.out.print("국어:");
				lang = sc.next();	// 98 100 10a
				
				boolean check = false;
				for(int j = 0;j < lang.length(); j++) {
					char c = lang.charAt(j);
					if((int)c < 48 || (int)c > 57) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
					continue;
				}
				
				// 1 ~ 100사이의 숫자 
				// >> 범위를 초과 했습니다
				int numLang = Integer.parseInt(lang);
				if(numLang < 0 || numLang > 100) {
					System.out.println("범위를 초과한 점수입니다. 다시 입력해 주십시오");
					continue;
				}
				
				break;
			}
			
			// 영어
			System.out.print("영어:");
			String eng = sc.next();
			
			// 수학
			System.out.print("수학:");
			String math = sc.next();
			
			// 데이터를 배열에 대입
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = eng;
			student[i][3] = math;			
		}	
		
		// 출력
		for (int j = 0; j < student.length; j++) {
			System.out.print(j + ":"); 
			for (int j2 = 0; j2 < student[0].length; j2++) {
				System.out.print(student[j][j2] + "\t");
			}
			System.out.println();			
		}
			int stuCount[][] = new int[student.length][3];
			for (int i = 0; i < student.length; i++) {
				stuCount[i][0]= Integer.parseInt(student[i][1]);	//국어
				stuCount[i][0]= Integer.parseInt(student[i][2]);	//국어
				stuCount[i][0]= Integer.parseInt(student[i][3]);	//국어
			}
		// 4. 국어, 수학, 영어 최고 점수. 	max
			int max = stuCount[0][1];
			for (int j = 0; j < student.length; j++) {
				if(max < stuCount[j][0]) {
					max = stuCount[j][0];
				}
			}
		// 5. 국어, 수학, 영어 최저 점수	min

			int min = stuCount[0][1];
			for (int j = 0; j < student.length; j++) {
				if(min > stuCount[j][1]) {
					min = stuCount[j][1];
				}
			}
		// 6. 모든 점수의 총합
			int sum = 0;
			for (int j = 0; j < stuCount.length; j++) {
				for (int j2 = 0; j2 < stuCount[0].length; j2++) {
					sum = sum + stuCount[j][j2];
				}
			}
		
		// 7. 학생 수에 따른 평군
			double avg = sum / (double)student.length;
		
		// 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
	}
}
