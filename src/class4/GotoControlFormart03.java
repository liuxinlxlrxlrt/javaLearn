package class4;
/*
 * return:����
 * 
 * ��ʵ�������ò��ǽ���ѭ���ģ����ǽ���������
 */

public class GotoControlFormart03 {
	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("�˳�");
				break;
			}
			System.out.println(x);
		}
		System.out.println("over");
		System.out.println("--------------");

		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("�˳�");
				continue;
			}
			System.out.println(x);
		}
		System.out.println("over");

		System.out.println("--------------");
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("�˳�");
				return;
			}
			System.out.println(x);
		}
		System.out.println("over");
	}
}
