package class8;
/*
 * ������С��Ϸ(������1-100֮��)
 * 
 * ������
 * 		A���������һ������������µģ�
 * 		B������¼�����ݣ���µģ�
 * 		C������µĺͱ��µĽ��бȽ�
 * 			a������
 * 			b��С��
 * 			c:������
 * 		D:������βµĻ��ᣬ�����˾ͽ���
 * 			whlie()ѭ���������˾�break
 */

import java.util.Scanner;

public class GuessNumberGame {
	public static void main(String[] args) {
		// ����һ������������µģ�
		int randomnumber = (int) (Math.random() * 100) + 1;

		// ������βܵĻ���,���оͽ���
		while (true) {
			// ����¼�����ݣ���µģ�
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����(1-100)��");
			int guessnumber = sc.nextInt();

			if (guessnumber < randomnumber) {
				System.out.println("�����������" + guessnumber + "С�ˣ�");
			} else if (guessnumber > randomnumber) {
				System.out.println("�����������" + guessnumber + "���ˣ�");
			} else {
				System.out.println("��ϲ�㣬�����ˣ�");
				break;
			}
		}
	}
}
