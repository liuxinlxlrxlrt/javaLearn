package class7;

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		//����¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�����볤���εĳ�");
		int length = sc.nextInt();
		System.out.println(length);
		System.out.println("�����볤���εĿ�");
		int width = sc.nextInt();
		System.out.println(width);
		//��������
		Rectangle r = new Rectangle();
		//�ȸ���Ա������ֵ
		r.setLength(length);
		r.setWidth(width);
		//�����ܳ�
		System.out.println("�ܳ��ǣ�"+r.getPerimeter());
		//�����ܳ�
		System.out.println("�����"+r.getAcreage());
	}
}
