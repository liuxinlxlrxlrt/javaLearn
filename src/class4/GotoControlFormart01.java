package class4;

/*
 * ������ת��䣺
 * 		break:�ж�
 * 		continue:����
 * 		return:����
 * 
 * break:�жϵ���˼��
 * 	ʹ�ó�����
 * 		A��switch�����
 * 		B��ѭ�������ܡ�
 * 			��ѭ������м�����if�жϣ�
 * 		ע�⣺�뿪�����������������������
 * 
 * 	���ʹ���أ�
 *   	A����������ѭ��
 *   	B���������ѭ��
 *   		Ҫ��ʵ�����������ͱ���֪��һ������������ǩ�����
 *   		��ʽ��
 *   			��ǩ�������
 */

public class GotoControlFormart01 {
	public static void main(String[] args) {
		// ��switch����loop�ⲿ�ж�
		// break

		// ��������ѭ��
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				break;
			}
			System.out.println("helloworld");
		}
		System.out.println("over");
		System.out.println("-------------------");

		wc: for (int x = 0; x < 3; x++) {
			nc: for (int y = 0; y < 4; y++) {
				if (y == 2) {
					// break nc;
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
