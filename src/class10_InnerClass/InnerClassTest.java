package class10_InnerClass;

/*面试题：
 * 	要分别输出30,20,10，请填空
 * 
 * 注意：
 *   1.内部类和外部类没有继承关系
 * 	 2.通过外部类名限定this对象
 *     Outer.this.x
 */

class OuterT {
	public int num = 10;

	class Inner {
		public int num = 20;

		public void show() {
			int num = 30;
			System.out.println(num);
			// this.num表示当前类(Inner)的引用
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
