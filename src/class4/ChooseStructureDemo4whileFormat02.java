package class4;

/*
 * ��ϰ����whileѭ��ʵ��
 * 		��ߣ����1-100֮��
 * 		�ұߣ�ͳ��ˮ�ɻ����ж��ٸ�
 * 
 * 	��ʼ����䣺
 * 	while(�ж��������){
 *		 ѭ�����
 *		�����������
 * 	}
 */

public class ChooseStructureDemo4whileFormat02 {
	public static void main(String[] args) {
		// ���1-100֮������֮�ͣ�for���汾
		int sum1 = 0;
		for (int x = 1; x <= 100; x++) {
			sum1 += x;
		}
		System.out.println("1-100֮������֮��sum1�ǣ�" + sum1);
		System.out.println("---------------------");

		// while���汾
		int sum2 = 0;
		int y = 1;
		while (y <= 100) {
			sum2 += y;
			y++;
		}
		System.out.println(sum2);
		System.out.println("---------------------");
		// ͳ��ˮ�ɻ����ж��ٸ�
		// ����ͳ�Ʊ�������ʼ��ֵ��0
	}
}
