package class10_Interface;
/*
 * �����ڽӿڵ���չ��
 * 	�̳�ͬʱ��ʵ��
 * 
 */

class Fu1{
	public void show() {
		System.out.println("show fu");
	}
}
interface Fu2{
	public abstract void show2();
}
//����ͨ���̳и�����չ���ܣ�ͨ���̳���չ�Ĺ��ܶ�������Ӧ�þ߱��Ļ�������
//���������Ҫ������չ�������е��������ܣ���ʱ����ͨ��interface�ӿ������
//�ӿڵĳ��ֱ����˵��̳еľ�����
//�����ж��������Ļ�������
//�ӿڶ�����������չ����
class Zi extends Fu1 implements Fu2{
	public void show() {
		System.out.println("show Zi");
	}
	public void show2() {
		System.out.println("show Fu2");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		//

	}

}
