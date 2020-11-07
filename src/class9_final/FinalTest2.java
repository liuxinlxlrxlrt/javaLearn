package class9_final;
/*
 * final修饰变量的初始化时机
 * 		A:被final修饰的变量只能赋值一次
 * 		B：在构造方法完毕前,（非静态的常量）
 */
class Demo{
	//成员变量初始化
//	int num = 10;
//	final int num2 = 20;
	
	int num;
	final int num2;
	//先走构造代码块num2被赋值
//	{
//		num2 = 2;
//	}
	
	public Demo() {
		//构造方法修改num 的值
		num =100;
		//final可以修饰变量：该变量不能被重新赋值，因为这个变量其实是常量
		//常量不能被赋值
		//num2 =200;
		
		//如果final修饰的变量没有被赋值，是可以赋值的
		num2 =200;
	}
}

public class FinalTest2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.num);
		System.out.println(d.num2);
	}
}
