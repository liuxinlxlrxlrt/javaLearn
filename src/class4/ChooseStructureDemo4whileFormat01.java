package class4;

/*
 * whileѭ������ʽ��
 *		������ʽ
 *   		while(�ж��������) {
 *         	ѭ�������;
 *   		}
 *		��չ��ʽ
 *  		��ʼ�����;
 *   		while(�ж��������) {
 *        	ѭ�������;
 *        	�����������;
 *   		}
 *   ͨ�������ʽ�����ǾͿ�����ʵ��forѭ���ǲ���
 *   
 *   for(��ʼ����䣻�ж�������䣻�����������){
 *   	ѭ�������
 *   }
 */

public class ChooseStructureDemo4whileFormat01 {
	public static void main(String[] args) {
		// �������10�Ρ�helloworld��

		for (int x = 0; x < 10; x++) {
			System.out.println("helloworld");
		}
		System.out.println("-----------------");

		// while���汾
		int x = 0;
		while (x < 10) {
			System.out.println("hellworld");
			x++;
		}
	}
}
