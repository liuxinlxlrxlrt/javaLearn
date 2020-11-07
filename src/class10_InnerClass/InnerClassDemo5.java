package class10_InnerClass;
/*
 * 局部内部类：
 * 	A:可以直接访问外部类的成员
 * 	B:可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
 * 
 * 面试题：
 * 		局部内部类访问局部变量的注意事项：
 * 		A:必须被final修饰
 * 		B:因为局部变量会随着方法的调用完毕而消失，这个时候，
 * 		   局部对象并没有立马从堆内存中消失，还要使用那个变量。
 * 		 为了让数据还能继续被使用，就用fianl修饰，这样，
 *         在堆内存里面存储的其实是一个常量值。
 *        通过反编译工具可以看一下
 *       加入final修饰后，这个变量就变成常量，既然是常量，
 *      你消失了，我在内存中存储的数据是20，
 *      所以我还是有数据在使用
 */
import class10_InnerClass.OuterT.Inner;

class Outer5{
	private int num = 10;
	public void method() {
		//报错：从内部类中访问本地变量num2,需要被申明为最终类型
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
		 //对象是在垃圾空闲的时候回收
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
