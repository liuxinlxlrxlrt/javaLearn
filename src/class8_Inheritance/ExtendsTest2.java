package class8_Inheritance;
/*
 *������д�����
 *		A��һ����ľ�̬����飬�������飬���췽��ִ������
 *			��̬�����-->��������-->���췽��
 *		B:��̬��������������ļ��ض�����
 *			��̬���������ݻ�����ִ��
 *			�����ʼ��֮ǰ�����ȸ���ĳ�ʼ��
 *			���ӹ��������߸�����(��������͹��췽��)
 */

class Fu2{
	static {
		System.out.println("��̬�����Fu2");
	}
	{
		System.out.println("��������Fu2");
	}
	public Fu2() {
		System.out.println("���췽��Fu2");
	}

}
class Zi2 extends Fu2{
	static {
		System.out.println("��̬�����Zi2");
	}
	
	{
		System.out.println("��������Zi2");
	}
	
	
	public Zi2() {
		System.out.println("���췽��Zi2");
	}
}

public class ExtendsTest2 {

	public static void main(String[] args) {
		//��������
		Zi2 z = new Zi2(); 
	}
}
