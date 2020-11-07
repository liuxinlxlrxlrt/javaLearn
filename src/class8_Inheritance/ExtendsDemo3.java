package class8_Inheritance;
/*
 * Java中继承的注意事项:
 * 		A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
 * 		B:子类不能继承父类的构造方法，但是可以通过super(马上讲)关键字去访问父类构造方法。
 * 		C：不要为了部分功能而去继承
 * 			class A{
 * 				public show1(){}
 * 				public show2(){}
 * 		}
 * 			class A{
 * 				public show2(){}
 * 				public show3(){}
 * 		}
 * 		我们发现B类中出现了和A类中一样的Show2()方法，所以，我们就用继承来体现
 * 		class B extends A{
 * 			public void show3(){}
 *     }
 *     这样其实不好，因为你不但有了show2()，还多了show3()
 *     有可能show1()不是你想要的
 *     
 *     那么，我们什么时候考虑使用继承呢？
 *     		继承其实体现的是一种关系："is a"
 *     			Person 
 *     				Student
 *     				Teacher
 *     			水果
 *     				苹果
 *     				香蕉
 *     				橘子
 *     			采用假设法：
 * 					有如果有两个类A,B,只要他们复核B是A的一种，就可以考虑使用继承
 * 		
 */

class Father3{
	private int num = 10;
	public int num2 = 20;
	
	//私有方法，子类不能继承
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
		//创建对象
		Son3 s = new Son3();
		s.show();
		//s.method();//子类不能继承父类的私有方法
		s.function();
	}
}
