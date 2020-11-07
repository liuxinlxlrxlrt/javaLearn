package class9_polymorphic;

/*
 * 多态：同一个对象（事物），在不同时刻体现出来的不同状态
 * 举例：
 *  	猫是猫，猫是动物
 *  	水{液体，固体，气体}
 *  
 *  多态的前提：
 *  	A: 要有继承关系	
 *  	B: 要有方法的重写
 *  			其实没有也是可以的，但是如果没有这个就没有意义
 *  			//猫狗在某些动作上不一样
 *  			//调用show()方法的时候猫和狗体现出来的不一样
 *  			动物 d = new 猫();
 *  			d.show();
 *  			动物 d = new 猫();
 *  			d.show();
 *  			多态就是要重写才有意义
 *  	C: 要有父类引用指向子类对象
 *  		父 f = new 子();
 *  
 *  用代码体现一下多态.
 *  
 *  多态中的成员访问特点：
 *  	A：成员变量
 *  		编译看左边，运行看左边
 * 		B：构造方法
 * 			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
 * 		C：成员方法
 * 			编译看左边，运行看右边
 * 		D：静态方法：
 * 			编译看左边，运行看左边
 * 		(静态和类相关，算不上重写，所以，访问还是左边的)	
 * 
 * 		由于成员方法发存在方法重写，所有看左边
 *  
 */
//polymorphic /pɑlɪ'mɔrfɪk/ adj. [生物] 多态的；[生物] 多形的；多形态的；[化学] 多晶形的（等于 polymorphous）

class Fu {
	public int num = 100;

	public void show() {
		System.out.println("show Fu");
	}

	public static void function() {
		System.out.println("function Fu");
	}
}

class Zi extends Fu {
	public int num = 1000;
	public int num2 = 200;

	public void show() {
		System.out.println("show Zi");
	}

	public void method() {
		System.out.println("method zi");
	}

	public static void function() {
		System.out.println("function Zi");
	}
}

public class PolymorphicDemo {
	public static void main(String[] args) {
		// 要有父类引用指向子类对象
		// 父 f = new 子();
		Fu f = new Zi();
		System.out.println(f.num);
		// 找不到符号
		// 多态中访问成员变量的时候，看的是父类
//			System.out.println(f.num2);

		f.show();
		// 找不到符号
		// f.method();
		f.function();
	}
}
