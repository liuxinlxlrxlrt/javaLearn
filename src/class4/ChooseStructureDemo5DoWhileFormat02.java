package class4;

/*
 * ѭ����������
 *    	do...whileѭ������ִ��һ��ѭ����
 *    	��for,whileѭ���������ж������Ƿ������Ȼ������Ƿ�ִ��ѭ�������
 *    
 *    ��ô������һ��ʹ������ѭ���أ�
 *    		���ȿ���for,��ο���while,�����do...while
 */

public class ChooseStructureDemo5DoWhileFormat02 {
	public static void main(String[] args) {
		int x = 3;
		while (x < 3) {
			System.out.println("helloworld");
		}
		System.out.println("------------------");

		int y = 3;
		do {
			System.out.println("helloworld");
			y++;
		} while (y < 3);
	}
}
