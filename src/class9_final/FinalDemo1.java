package class9_final;

/*
 * final���������࣬������������
 * 
 * �ص㣺
 * 	final���������ࣺ���಻�ܱ��̳�
 * 		��final���ε���������࣬û�����࣬���ܱ��̳У�
 * 	final�������η������������ܱ���д
 * 	final�������α������ñ������ܱ����¸�ֵ����Ϊ���������ʵ�ǳ���
 * 
 * ������
 *  A������ֵ����
 *  		��Holle��,10,ture
 *  B:�Զ��峣��
 *  		final int x = 10;
 * 
 */
//final class Fu1 //�޷���������Fu1���м̳�
class Fu1 {
	public int num = 10;
	public final int num2 = 20;
//	public final void show() {
//	}
}

class Zi1 extends Fu1 {
	// Zi1�е�show()�����޷�����Fu1�б�final���ε�show()
	public void show() {
		num = 100;
		System.out.println(num);
//			num2 = 200;//�ñ������ܱ����¸�ֵ����Ϊ��final���ε����������ʵ�ǳ���
		System.out.println(num2);
	}
}

public class FinalDemo1 {
	public static void main(String[] args) {
		// ��������
		Zi1 z = new Zi1();
		z.show();
	}
}
