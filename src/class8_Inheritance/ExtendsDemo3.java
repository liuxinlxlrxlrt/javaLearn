package class8_Inheritance;
/*
 * Java�м̳е�ע������:
 * 		A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
 * 		B:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super(���Ͻ�)�ؼ���ȥ���ʸ��๹�췽����
 * 		C����ҪΪ�˲��ֹ��ܶ�ȥ�̳�
 * 			class A{
 * 				public show1(){}
 * 				public show2(){}
 * 		}
 * 			class A{
 * 				public show2(){}
 * 				public show3(){}
 * 		}
 * 		���Ƿ���B���г����˺�A����һ����Show2()���������ԣ����Ǿ��ü̳�������
 * 		class B extends A{
 * 			public void show3(){}
 *     }
 *     ������ʵ���ã���Ϊ�㲻������show2()��������show3()
 *     �п���show1()��������Ҫ��
 *     
 *     ��ô������ʲôʱ����ʹ�ü̳��أ�
 *     		�̳���ʵ���ֵ���һ�ֹ�ϵ��"is a"
 *     			Person 
 *     				Student
 *     				Teacher
 *     			ˮ��
 *     				ƻ��
 *     				�㽶
 *     				����
 *     			���ü��跨��
 * 					�������������A,B,ֻҪ���Ǹ���B��A��һ�֣��Ϳ��Կ���ʹ�ü̳�
 * 		
 */

class Father3{
	private int num = 10;
	public int num2 = 20;
	
	//˽�з��������಻�ܼ̳�
	private void method() {
		System.out.println(num);
		System.out.println(num2);
	}
	
	public void show() {
		System.out.println(num);
		System.out.println(num2);
	}
}

class Son3 extends Father3{
   public void function() {
		System.out.println(num2);
   }
}

public class ExtendsDemo3 {
	public static void main(String[] args) {
		//��������
		Son3 s = new Son3();
		s.show();
		//s.method();//���಻�ܼ̳и����˽�з���
		s.function();
	}
}
