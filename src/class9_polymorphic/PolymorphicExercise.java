package class9_polymorphic;
/*
 * 多态案例：多态版
 * 猫狗案例练习多态版
 */

class Animal2{
	public void eat() {
		System.out.println("吃饭");
	}
}

class Dog2 extends Animal2{
	public void eat() {
		System.out.println("狗吃肉");
	}
	
	public void lookDoor() {
		System.out.println("狗看门");
	}
}

class Cat2 extends Animal2 {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void playGame() {
		System.out.println("猫捉迷藏");
	}
}

public class PolymorphicExercise {
	public static void main(String[] args) {
		//定义为狗
		Animal2 a = new Dog2();
		a.eat();
		System.out.println("------------");
		//还原成狗
		Dog2 d = (Dog2) a;
		d.eat();
		d.lookDoor();
		System.out.println("------------");
		//变成猫
		a = new Cat2();
		a.eat();
		System.out.println("------------");
		//还原成猫
		Cat2 c = (Cat2)a;
		c.eat();
		c.playGame();
		
		//演示错误的内容
		//编译错误
//		Dog2 dd = new Animal2();
//		Dog2 dd = new Cat2();
		//运行错误ClassCastException
//		Dog2 dd = (Dog2)a;
	}
}
