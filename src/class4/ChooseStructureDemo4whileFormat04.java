package class4;

/*
 * whileѭ����forѭ��������
 * 		ʹ���������������ѭ�������󣬼���ʹ�ÿ����������Ǹ���������whileѭ����������forѭ������֪����forѭ��
 * 				��Ϊ��������Ĵ��ڴ�����ʧ����������ڴ��ʹ��Ч��
 * 
 * 		��ʵ����һ�ֳ�������⣺
 * 			�����һ����Χ�ģ���forѭ���ǳ���ȷ
 * 			�������ȷҪ�����ٴΣ���whileѭ����Ϊ����
 * 				������������
 */

public class ChooseStructureDemo4whileFormat04 {
	public static void main(String[] args) {
		// forѭ��ʵ��
		for (int x = 0; x < 10; x++) {
			System.out.println("ѧϰjava�����ļ�ǿ���й��������ǲ���");
		}
		// ���ﲻ���ټ���������
		// System.out.println(x);

		// whileѭ��ʵ��
		int y = 0;
		while (y < 10) {
			System.out.println("ѧϰjava�����ļ�ǿ���й��������ǲ���");
			y++;
		}
		// �����ǿ��Լ������ʵ�
		System.out.println(y);
	}
}
