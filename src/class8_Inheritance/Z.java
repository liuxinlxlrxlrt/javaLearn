package class8_Inheritance;

/*
 * ������д���:
 * 		A:��Ա�������⣺
 * 			int x = 10;//��Ա�����ǻ�������
 * 			Student s = new Studen();//��Ա��������������
 * 		B��һ����ĳ�ʼ�����̣�
 * 			��Ա�����ĳ�ʼ����
 * 				Ĭ�ϳ�ʼ��
 * 				��ʾ��ʼ��
 * 				���췽����ʼ��
 * 		C���Ӹ���ĳ�ʼ�������ֲ��ʼ����
 * 				�Ƚ��и��׵ĳ�ʼ����Ȼ����������ʼ��
 * 
 * 	�����YXYZ
 * 
 * 	���⣺
 * 		��Ȼ���๹�췽����Ĭ����һ��supper()
 * 		��ʼ����ʱ�򣬲��ǰ����Ǹ�˳����е�
 * 		���ǰ��շֲ��ʼ�����е�
 * 		��������ʾ�ȳ�ʼ���������ݣ��ٳ�ʼ����������
 */
class X {
	Y b = new Y();
	X(){
		System.out.println("X");
	}
}
class Y{
	Y(){
		System.out.println("Y");
	}
}
public class Z extends X{
	Y y = new Y();
	Z(){
		//super();//������ʾ�ȳ�ʼ���������ݣ��ٳ�ʼ����������
		System.out.println("Z");
	}
	public static void main(String[] args) {
		new Z();
	}
}
