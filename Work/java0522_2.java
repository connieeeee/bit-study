package work4;

import java.util.Random;
import java.util.Scanner;

public class java0522_2 {

	public static void main(String[] args) {
		/*
		 1 ~ 10 �� 3���� ���� ���ϱ� random 3 
		 3�� �Է�
		 ��ġ�� Ʋ���� ball
		 ��ġ�� ������ strike
		 random ���� 3���� �� �޶�ߵȴ�.
		 
		 ��ȸ�� 10��
		 start
		 random 3
		 
		 //loop
		 user input
		 processing
		 message ( ball strike)
		 
		 end
		 replay
		 
		 */

		
		Scanner sc= new Scanner(System.in);
		
		int r_num[] = new int[3];
		int u_num[] = new int[3];
		boolean clear = false;
		
		boolean swit[] = new boolean[10];
		for(int i = 0; i <swit.length; i++) {
			swit[i] = false;	// 00000 00000
		}
		int r, w;
		w = 0;
		
		
		swit[0]= true;	
		// swit[21]= true;	// ���� ��
		
		
		// ����
		while(w < 3) {
			r = (int)(Math.random()*10);
			if(swit[r] == false) {
				swit[r]= true;	// 00100 00000
				r_num[w] = r + 1;	// 1 ~ 10
				w++;
				
			
			}
		}
		
		
		for (int i = 0; i < r_num.length; i++) {
			System.out.println( i + " : " +  r_num[i]);
		}
		
		
		// Debug != ����
		//�ǽð�
		//
		
				/*
				 * 
				 * 
				while(true) {
					r_num[0] = (int)(Math.random()*10)+1;
					r_num[1] = (int)(Math.random()*10)+1;
					r_num[2] = (int)(Math.random()*10)+1;
					for(int i = 0; i < r_num.length; i++) {
						r_num[i] = (int)(Math.random()*10)+1;
					}
					
					if(r_num[0] != r_num[1]
							&& r_num[0] != r_num[0]
									&& r_num[1]!=r_num[2]) {
						
					}
				 */
			
		
		
		/////////////////////////// loop 10
		w = 0;
		int strike, ball;
		while(w < 10) {
			
			// user input	u1 !=  u2 != u3
			boolean check;
			int w1;
			
			while(true) {
				check = false;
				w1  = 0;
				while(w1 < 3) {
					System.out.println((w1 + 1) + "��° �� = ");
					u_num[w1] = sc.nextInt();
					w1++;
				}
				
				// ���� ���ڰ� �ִ��� üũ
				out : for (int i = 0; i < u_num.length; i++) {
					for (int j = 0; j < u_num.length; j++) {
						if(u_num[i] == u_num[j] && i != j) {
							check = true;	// �Է��� ���� ���ڰ� ����
							break out;
						}
					}
				}
				
				if(check == false) {
					break;
				}
				System.out.println(" �Է��� ���� �߿� �ߺ��Ǵ� ���ڰ� �ֽ��ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
				
			}
			
			
			// process(��)
			strike = ball = 0;
			
				// ball
			for (int i = 0; i < u_num.length; i++) {
				for (int j = 0; j < r_num.length; j++) {
					if(u_num[i] == r_num[j] && i != j) {
						ball++;
					}
				}
			}
				// strike 
			for (int i = 0; i < u_num.length; i++) {
				if(u_num[i] == r_num[i]){
					strike++;
				}
			}
				// Ż��
			if(strike > 2) { 
				clear = true;
				break;
			}
			
			
			// �޽��� ���
			
			System.out.println(strike + "��Ʈ����ũ, " + ball + "�� �Դϴ�");
			
			w++;
		}
		if(clear) {
			System.out.println("Game Clearrr");
		}else {
			System.out.println("Game Over~");
		}
		
		}
		
		
		
	}


