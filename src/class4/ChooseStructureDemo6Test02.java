package class4;

/*
 * �������������ͼ��
			*
			**
			***
			****
			*****
 */
public class ChooseStructureDemo6Test02 {
	public static void main(String[] args) {
		// ͨ���۲죬���ǿ���һ����Ϊ5�������Ǳ仯����״
		// ���ǹ��ӡһ��5��5�е���״
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");

		// ��������α仯���أ�
		// ��һ�У�1�� int y=1;y<=1;y++
		// �ڶ��У�2�� int y=1;y<=2;y++
		// �����У�3�� int y=1;y<=3;y++
		// �����У�4�� int y=1;y<=4;y++
		// �����У�5�� int y=1;y<=5;y++
		// ��ѭ�� x�ı仯��ǡ�þ���1,2,3,4,5

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
