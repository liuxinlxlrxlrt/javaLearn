package class12_String;
/*
 * ���ǲ�����С��Ϸ�Ĵ���
 */

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {
		
	}
	
	public static void start() {
		//����һ�������
		int number = (int) (Math.random()*100)+1;
		
		while(true) {
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�µ�����(0-100):");
		int guessNumber = sc.nextInt();
		
		//�ж�
		if(guessNumber>number) {
			System.out.println("��µ�����"+guessNumber+"����");
		}else if(guessNumber<number){
			System.out.println("��µ�����"+guessNumber+"С��");
		}else {
			System.out.println("��ϲ�㣬������");
			break;
		}
		}
	}


}
