package class8_Inheritance;
/*
 * ������д���
 * 		A:��Ա���� ���ͽ�ԭ��
 * 		B��this�� super������
 * 			this���ʱ���ĳ�Ա
 * 			super���ʸ���ĳ�Ա
 * 		C������Ĺ��췽��ִ��ǰ��ִ�и���Ĺ��췽��
 * 		D��һ����ĳ�ʼ�����̣�
 * 				��Ա�������г�ʼ��
 * 				Ĭ�ϳ�ʼ��
 * 				��ʾ��ʼ��
 * 				���췽����ʼ��
 */

class Fu{
	public int num =10;
	public Fu() {
		System.out.println("fu");
	}
}
class  Zi extends Fu{
	public int num =20 ;
	public Zi() {
		System.out.println("zi");
	}
	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		//��������
		Zi z = new Zi();
		z.show();
	}
}
