package class10_InnerClass;
/*
 * ��Ա�ڲ�������η���
 * 		A��private Ϊ�˱�֤���ݵİ�ȫ��
 * 		B��static Ϊ�������ݷ��ʸ�����
 * 			a.����̬���εĳ�Ա�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա
			b.�ڲ��౻��̬���κ�ķ���
				��̬����	
				�Ǿ�̬����
 * 
 * ����������һ����(�������壬������������)
 * 
 * class Body{
 * 		private class Heart{
 * 			public void operator{
 * 			System.out.println("�������");
 * 			}
 * 		}
 * 
 * 		public void method{
 * 		IF(����������ҽ��){
 * 		Heart h = new Heart();
 * 		h.operator();
 * 		}
 * 		}
 * }
 * 
 * �������ǸղŵĽ��⣬��ʹ��һ��
 * Body.Heart bh = new Body().new Heart();
 * bh.operator();
 *����private���Ͳ��ܱ������ˣ���ô����ô���أ�
 */

import class10_InnerClass.Outer3.Inner3;

class Outer4{
	private int num = 10;
	private static int num2 = 100;
	//�ڲ����þ�̬����
	//��Ϊ�ڲ�����Կ������ⲿ��ĳ�Ա
	
	//��̬�ڲ���(static):ֻ�ܷ����ⲿ���ⲿ������ݱ����þ�̬����
	//��̬����Կ������ⲿ�ľ�̬��Ա����̬��Ա����ͨ����������
	public static class Inner4{
		public void show() {
			//����
			//System.out.println(num);
			System.out.println(num2);
		}
		//��̬�ķ�������ͨ����������
		public static void show2() {
			//����
			//System.out.println(num);
			System.out.println(num2);
		}
	}
}
public class InnerClassDemo4 {
	public static void main(String[] args) {
		//ʹ���ڲ���
		//�޶��¾�̬��
//		Outer4.Inner4 oi = new Outer4().new Inner4();
//		oi.show();
//		oi.show2();
		
		//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ�ǣ�
		//��ʽ���ⲿ�������ڲ������� ������ = new�ⲿ����.�ڲ�����();
		Outer4.Inner4 oi = new Outer4.Inner4();
		oi.show();
		oi.show2();
		System.out.println("-------------------");
		//show2����һ�ַ���
		Outer4.Inner4.show2();
	}
}
