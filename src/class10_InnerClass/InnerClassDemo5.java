package class10_InnerClass;
/*
 * �ֲ��ڲ��ࣺ
 * 	A:����ֱ�ӷ����ⲿ��ĳ�Ա
 * 	B:���Դ����ڲ������ͨ����������ڲ��෽������ʹ�þֲ��ڲ��๦��
 * 
 * �����⣺
 * 		�ֲ��ڲ�����ʾֲ�������ע�����
 * 		A:���뱻final����
 * 		B:��Ϊ�ֲ����������ŷ����ĵ�����϶���ʧ�����ʱ��
 * 		   �ֲ�����û������Ӷ��ڴ�����ʧ����Ҫʹ���Ǹ�������
 * 		 Ϊ�������ݻ��ܼ�����ʹ�ã�����fianl���Σ�������
 *         �ڶ��ڴ�����洢����ʵ��һ������ֵ��
 *        ͨ�������빤�߿��Կ�һ��
 *       ����final���κ���������ͱ�ɳ�������Ȼ�ǳ�����
 *      ����ʧ�ˣ������ڴ��д洢��������20��
 *      �����һ�����������ʹ��
 */
import class10_InnerClass.OuterT.Inner;

class Outer5{
	private int num = 10;
	public void method() {
		//�������ڲ����з��ʱ��ر���num2,��Ҫ������Ϊ��������
		int num2 = 20;
		final int num3 = 30;
		final int num4 = 40;
		 class Inner5{
			 public void show() {
				 System.out.println(num);
				 System.out.println(num3);
			 }
		 }
		 
		 System.out.println(num2);
		 System.out.println(num4);
		 //���������������е�ʱ�����
		 Inner5 i = new Inner5();
		 i.show();
	}

}

public class InnerClassDemo5 {
	public static void main(String[] args) {
		Outer5 o = new Outer5();
		o.method();
	}
}
