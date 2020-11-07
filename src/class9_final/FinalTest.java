package class9_final;
/*
 * 面试题:final修饰 局部变量的问题
 * 
 * 	基本类型：基本类型的值不能发生改变
 * 	引用类型：引用类型的地址值不能发生改变，但是该对象的堆内存的值是可以改变的
 */
class Student{
	int age =10;
}

public class FinalTest {
	public static void main(String[] args) {
		//
		int x =10;
		System.out.println(x);
		final int y = 10;
		//无法为最终变量y分配值
		//final修饰基本类型，基本类型的内容不能改变
		//y= 100;
		System.out.println(y);
		System.out.println("----------------");
		//s和ss局部变量是引用数据类型
		Student s = new Student();
		s.age = 100;
		System.out.println(s.age);
		
		final Student ss = new Student();
		System.out.println(ss.age);
		ss.age =100;
		System.out.println(ss.age);
		//重新分配内存空间
		//final修饰引用类型，引用类型的地址值不能改变
		//但是地址值里面的内容是可以改变的
		//ss = new Student();
	}
}
