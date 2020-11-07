package class10_Interface;
/*
 * �������п�Ժ������󷽷���
 * ��һ���������еķ���ȫ�ǳ����ʱ����ʱ������ͨ����һ���������ʽ�����֣��ýӿ�����ʾ��
 * 
 * �ӿڸ���ζ����أ�
 * interface
 */

//abstract class Demo{
//	abstract void show1();
//	abstract void show2();
//}

/*
 * �ӿ��еĳ�Ա�Ѿ����޶�Ϊ�̶��ļ��֣�
 * ���ӿڵĶ����ʽ���Ƚ������֣�
 *  	A��������������Ǳ��������й̶������η�����,public static final �����Լ����еı���Ҳ��֮Ϊ����
 *  	B�����巽������λҲ�й̶������η���public abstract
 *  ��Ա����
		ֻ���ǳ���
		Ĭ�����η� public static final
   ���췽��
		û�У���Ϊ�ӿ���Ҫ����չ���ܵģ���û�о������
   ��Ա����
		ֻ���ǳ��󷽷�
		Ĭ�����η� public abstract
�ӿ��ص�
	�ӿ��ùؼ���interface��ʾ
		��ʽ��interface �ӿ��� {}
	��ʵ�ֽӿ���implements��ʾ
		��ʽ��class ���� implements �ӿ��� {}
	�ӿڲ���ʵ����
		��ô���ӿ����ʵ������?
		���ն�̬�ķ�ʽ���ɾ��������ʵ��������ʵ��Ҳ�Ƕ�̬��һ�֣��ӿڶ�̬��
	�ӿڵ�����
		Ҫô�ǳ�����
		Ҫô��д�ӿ��е����г��󷽷�

 *  �ӿ��еĳ�Ա���ǹ����ġ�
 *  
 *  ���ӿڵ��ص㡿
 *  	A���ӿڲ����Դ�������
 *  	B���������Ҫ���ǵ��ӿ������еĳ��󷽷�������ſ���ʵ����
 */

//����һ������ΪDemo�Ľӿ�
interface Demo{
	//���public static final��д�����������Զ�����
	public static final int NUM = 3;
	
	//���public abstractl��д�����������Զ�����
	public abstract void show1();
	public abstract void show2();
}

//��������ȥ���ǽӿ��еķ���,�������ͽӿڲ�����ϵ
//������֮��Ĺ�ϵ�̳У�
//����ӿ�֮��Ĺ�ϵ��ʵ�֣�ͨ���ؼ���implemnts
class DemoImpl implements Demo{
	//��д�ӿ��з���
	public void show1() {
		System.out.println("����");
	}
	public void show2() {
		System.out.println("����");
	}
}

/*
 * �ӿ�����Ҫ�����֣�
 * 		�����̳еı׶ˣ�����̳����ֻ�����java��ͨ����ʵ�������
 */
interface A{
	public abstract void show3();
}
interface B{
	public abstract void show4();
}
//��ʵ�֣�ͬʱʵ�ֶ���ӿ�
class C implements A,B{
	public void show3() {
		System.out.println("���μ�");
	}
	public void show4() {
		System.out.println("������");
	}
}
/*��ô�����̳еı׶˵��أ�
 * ��̳б׶ˣ���̳�ʱ�����������������ͬ����ʱ��������û������ȷ����
 * ��ʵ����ԭ����������̳и����й��������⣬�����µ�������ʱ����ȷ��������һ����������
Ϊʲô��ʵ�־��ܽ���أ�
��Ϊ�ӿ��еĹ��ܶ�û�з����壬Ӵ��������ȷ
 *interface A{
	public abstract void show();
}
interface B{
	public abstract void show();
}
//��ʵ�֣�ͬʱʵ�ֶ���ӿ�
class C implements A,B{
	public void show() {
		System.out.println("���μ�");
	}
	public void show() {
		System.out.println("������");
	}
} 
����C����ʱ��C��ͻ��
����ͻ
	C c = new C();
	c.show();
 */

public class InterfaceDemo {
	public static void main(String[] args) {
		DemoImpl d = new DemoImpl();
		d.show1();
		d.show2();
		
		C c = new C();
		c.show3();
		c.show4();
	}
}
