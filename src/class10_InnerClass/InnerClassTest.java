package class10_InnerClass;

/*�����⣺
 * 	Ҫ�ֱ����30,20,10�������
 * 
 * ע�⣺
 *   1.�ڲ�����ⲿ��û�м̳й�ϵ
 * 	 2.ͨ���ⲿ�����޶�this����
 *     Outer.this.x
 */

class OuterT {
	public int num = 10;

	class Inner {
		public int num = 20;

		public void show() {
			int num = 30;
			System.out.println(num);
			// this.num��ʾ��ǰ��(Inner)������
			System.out.println(this.num);
//			System.out.println(new Outer().num);
			System.out.println(OuterT.this.num);
		}
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		OuterT.Inner oi = new OuterT().new Inner();
		oi.show();
	}
}
