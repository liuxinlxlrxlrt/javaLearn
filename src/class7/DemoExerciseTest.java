package class7;

public class DemoExerciseTest {
	public static void main(String[] args) {
		//创建对象
		//方法1测试
		//方法1满足了我们的要求，但是不好
		//因为参与操作的数据是固定的
//		DemoExercise d = new DemoExercise();
//		System.out.println(d.sum());
		
		//方法2测试
		//方式2可以满足我们的要求
		//但是呢，我们学习过了面向过了面向对象的思想
		//我就在想，a,b可以补可以定义为成员变量呢
		//如果可以，就改进一下
//		DemoExercise d = new DemoExercise();
//		System.out.println(d.sum(10,20));
		
		//方式3测试
		//虽然这种方式可以，并且好像符合了面向对象的思想
		//为什么不好呢?
		//因为我们曾经说过，类是一组相关的属性和行为的集合
		//并且类是通过事物转换过来的
		//为类中的成员变量就是事物的属性
		//属性是用来描述事物的
		//同理，成员变量其实是描述类的
		DemoExercise d = new DemoExercise();
		d.a = 10;
		d.b = 20;
		System.out.println(d.sum());
	}
}
