package class10_InnerClass;
/*
 * ��Ա�ڲ��ࣺ
 * 		���ֱ�ӷ����ڲ���ĳ�Ա��
 * 		�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
 */

class Outer3{
	private int num = 10;
	
	 class Inner3{
		 public void show() {
			 System.out.println(num);
		 }
	 }
}

public class InnerClassDemo3 {
	public static void main(String[] args) {
		//������Ҫ����Inner���е�show()����
//		Inner i = new Inner();
//		i.show()
		
		//��ʽ���ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������
		Outer3.Inner3 oi = new Outer3().new Inner3();
		oi.show();
	}
}
