package class4;

/*
 * ����ͳ��ˮ�ɻ����ж��ٸ�
 */

public class ChooseStructureDemo4whileFormat03 {
	public static void main(String[] args) {
		// for���汾
		int count = 0;
		for (int x = 100; x < 1000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;

			if (x == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				// �����ͬ���ͰѸ������ڿ���̨���
				count++;
			}
		}
		System.out.println("ˮ�ɻ�������" + count + "��");
		System.out.println("--------------------");

		// while���汾
		int count2 = 0;
		int y = 100;
		while (y < 1000) {
			int ge = y % 10;
			int shi = y / 10 % 10;
			int bai = y / 10 / 10 % 10;

			if (y == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				// �����ͬ���ͰѸ������ڿ���̨���
				count++;
			}
			y++;
		}
		System.out.println("ˮ�ɻ�������" + count + "��");
	}
}
