package class4;

/*
 * ע����ѭ��
 * 		A:һ��Ҫע����������������ĸ����������⣬��ҪŪ���ˣ������������ѭ��
 * 		B:������򵥵���ѭ����ʽ
 */

public class ChooseStructureDemo6 {
	public static void main(String[] args) {
		int x = 0;
		while (x < 10) {
			System.out.println(x);
			x++;
		}
		System.out.println("----------------");

		/*
		 * while (true) { System.out.println("�����Һܸ���ѧϰ����ѭ��"); }
		 */
		System.out.println("----------------");

		for (;;) {
			System.out.println("�����Һܸ���ѧϰ����ѭ��");
		}
	}
}
