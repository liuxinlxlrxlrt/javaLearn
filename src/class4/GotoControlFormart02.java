package class4;
/*
 * continue:����
 * 
 * ʹ�ó�����
 * 		ѭ���У��뿪�˳���������
 * 
 * ���ԣ�������break������
 * 		break:��������ѭ������������ѭ����
 * 		continue:����һ��ѭ����������һ�ε�ִ��
 * 
 * ��ϰ�⣺
 * 			for(int x =0;x<=10;x++) {
			if(x%3==0) {
				//�ڴ˴���д����
			}
			System.out.println("Java������");
			���ڿ���̨���2�Σ���Java�����ࡱ
				break;
			���ڿ���̨���7�Σ���Java�����ࡱ
				continue;
			���ڿ���̨���13�Σ���Java�����ࡱ
				System.out.println("Java������");
 */

public class GotoControlFormart02 {

	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			if (x == 3) {
				break;
			}
			System.out.println(x);
		}
		System.out.println("----------------");
		for (int y = 0; y < 10; y++) {
			if (y == 3) {
				continue;
			}
			System.out.println(y);
		}
	}
}
