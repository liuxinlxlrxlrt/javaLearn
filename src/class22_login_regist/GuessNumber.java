package class22_login_regist;

import java.util.Scanner;

/**
 * ����ǲ�����С��Ϸ
 * @author ��ԲԲ
 *@version V1.1
 */

public class GuessNumber {
	//˽�е��޲ι���
	private GuessNumber(){
		
	}
	//��̬����
	public static void start() {
		//����һ�������
		int number = (int) (Math.random()*100)+1;
		
		//����һ��ͳ�Ʊ���
		int count = 0;
		
		while(true) {
			//����¼��һ������
			Scanner sc = new Scanner(System.in);
			System.out.println("����������(1-100)��");
			int guessNumber = sc.nextInt();
			
			count++;
			
			//�ж�
			if(guessNumber>number) {
				System.out.println("��µ�����"+guessNumber+"����");
			}else if(guessNumber<number){
				System.out.println("��µ�����"+guessNumber+"С��");
			}else {
				System.out.println("��ϲ�㣬"+count+"�β�����");
				break;
			}
		}
	}
}