package class10_Interface;
/*
 * ���������Ƿ���Բ�������󷽷�
 * ���Եģ�ԭ���� ���ø��ഴ������
 * 
 * 
 */
interface inter{
	//����������ʾ����
	public void show1();
	public void show2();
	public void show3();
	public void show4();
}

////�������࣬Ҫʹ�õ�һ����ʾ����
//class InterImpl1 implements inter{
//	//Ҫ����show1()����
//	public void show1() {
//		System.out.println("show1 run");
//	}
//	//Ϊ���ø���ʵ����������Ҫ��������������������Ȼ�����ò���
//	public void show2() {}
//	public void show3() {}
//	public void show4() {}
//}
////��һ��������Ҫʹ����ʾ������
//class InterImpl3 implements inter{
//	//Ҫ����show3()����
//	public void show3() {
//		System.out.println("show3 run");
//	}
//	//Ϊ���ø���ʵ����������Ҫ��������������������Ȼ�����ò���
//	public void show2() {}
//	public void show1() {}
//	public void show4() {}
//}
/*
 * �������⣺
 * Ϊ��ʹ�ýӿ��еĲ��ַ�������������ȫ���ķ���������ÿһ�����඼Ҫ��ô���������Բ�
 * 
 * ����Щ���õķ�������ȡ��һ������������
 * ������ȥʵ�ֽӿڣ������ǽӿ��е����з���
 */

//������е���Щ�����ľ���ʵ�������𣿲�֪��
//����ֻ��Ϊ�˺������ഴ�����󷽱㣬�����п�ʵ��
//����ʱ������ഴ�����������������û�����塣����ഴ���Ͳ���Ҫ��ֱ�ӽ�����󻯡�
//���������û�г��󷽷��ĳ�����
abstract class InterImpl implements inter{
	//ʵ��inter�ӿ��е����з���
	public void show1() {}
	public void show2()	{}
	public void show3()	{}
	public void show4()	{}
}
//���������ʹ����ʾ1������������̳�InterImplʵ����Ϳ�����
class InterImpl1 extends InterImpl{
	public void show1() {
		System.out.println("show1 run");
	}
}
class InterImpl3 extends InterImpl{
	public void show3() {
		System.out.println("show3 run");
	}
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		InterImpl in = new InterImpl1();
		in.show1();
		in = new InterImpl3();
		in.show3();
		
	}

}
