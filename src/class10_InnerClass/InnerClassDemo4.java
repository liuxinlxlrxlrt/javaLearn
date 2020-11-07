package class10_InnerClass;
/*
 * 成员内部类的修饰符：
 * 		A：private 为了保证数据的安全性
 * 		B：static 为了让数据访问更方便
 * 			a.被静态修饰的成员内部类只能访问外部类的静态成员
			b.内部类被静态修饰后的方法
				静态方法	
				非静态方法
 * 
 * 案例：我有一个人(人有身体，身体内有心脏)
 * 
 * class Body{
 * 		private class Heart{
 * 			public void operator{
 * 			System.out.println("心脏搭桥");
 * 			}
 * 		}
 * 
 * 		public void method{
 * 		IF(如果你是外科医生){
 * 		Heart h = new Heart();
 * 		h.operator();
 * 		}
 * 		}
 * }
 * 
 * 按照我们刚才的讲解，来使用一下
 * Body.Heart bh = new Body().new Heart();
 * bh.operator();
 *加了private，就不能被访问了，那么，这么玩呢？
 */

import class10_InnerClass.Outer3.Inner3;

class Outer4{
	private int num = 10;
	private static int num2 = 100;
	//内部类用静态修饰
	//因为内部类可以看出是外部类的成员
	
	//静态内部类(static):只能访问外部的外部类的数据必须用静态修饰
	//静态类可以看成是外部的静态成员，静态成员可以通过类名调用
	public static class Inner4{
		public void show() {
			//报错
			//System.out.println(num);
			System.out.println(num2);
		}
		//静态的方法可以通过类名调用
		public static void show2() {
			//报错
			//System.out.println(num);
			System.out.println(num2);
		}
	}
}
public class InnerClassDemo4 {
	public static void main(String[] args) {
		//使用内部类
		//限定新静态类
//		Outer4.Inner4 oi = new Outer4().new Inner4();
//		oi.show();
//		oi.show2();
		
		//成员内部类被静态修饰后的访问方式是：
		//格式：外部类名。内部类类名 对象名 = new外部类名.内部类名();
		Outer4.Inner4 oi = new Outer4.Inner4();
		oi.show();
		oi.show2();
		System.out.println("-------------------");
		//show2的另一种方法
		Outer4.Inner4.show2();
	}
}
