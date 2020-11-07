package class7;

/*
 * 定义一个DemoExercise,
 * 其中定一个求两个数据和的方法
 * 定一个DemoExerciseTest,进行测试
 * 
 * 变量是什么时候定义为成员变量
 * 		如果这个变量是用来描述这个类的细信息的，那么，改变量就应该定义为成员变量
 * 
 * 变量到底定义在哪里好呢?
 * 		变量的范围是越小越好，因为能及时的被回收
 */

public class DemoExercise {
	//方式1：固定写法
//	public int sum() {
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		return c;
//	}
	
	//方式2
//	public int sum(int a,int b) {
//		return a+b;
//	}
	
	//方式3
	int a;
	int b;
	
	public int sum () {
		return a+b;
	}
}

