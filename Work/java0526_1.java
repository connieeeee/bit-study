package work8;

import java.util.Scanner;

public class java0526_1 {

	public static void main(String[] args) {
		
		// 2 array -> 1 array
		/*
		  	
		  	int arr2[][]={
		  		{ 1, 2, 3 },
		  		{ 4, 5, 6 }
		  	}
		 	int array[] = new int[ ? ];

		
		 
		 */
		Scanner sc = new Scanner(System.in);
		
		char array2[][] = {
				{'A', 'B', 'C'},
				{'D', 'E', 'F'},
				{'G', 'H', 'I'},
				{'J', 'K', 'L'}
			};
		
		char array1[] = new char[array2.length * array2[0].length];
		/*
		 	array2[0][0]	3 * 0 + 0	-> array1[0]
		 	array2[0][1]	3 * 0 + 1	-> array1[1]
		 	array2[0][2]	3 * 0 + 2	-> array1[2]
		 	
		 	array2[1][0]	3 * 1 + 0	-> array1[3]
		 	array2[1][1]	3 * 1 + 1	-> array1[4]
		 	array2[1][2]	3 * 1 + 2	-> array1[5]
		 	
		 		:
		 */
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				array1[array2[0].length * i + j] = array2[i][j];
			
				// array1[count] = array2[i][j];
			}
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(i + ":" + array1[i]);
		}
		
	}

}
