package class10_Interface;
/*
 * 【基于接口的扩展】
 * 	继承同时多实现
 * 
 */

class Fu1{
	public void show() {
		System.out.println("show fu");
	}
}
interface Fu2{
	public abstract void show2();
}
//子类通过继承父类扩展功能，通过继承扩展的功能都是子类应该具备的基础功能
//如果子类想要继续扩展其他类中的其他功能？这时可以通过interface接口来完成
//接口的出现避免了单继承的局限性
//父类中定义的事物的基本功能
//接口定义的事物的扩展功能
class Zi extends Fu1 implements Fu2{
	public void show() {
		System.out.println("show Zi");
	}
	public void show2() {
		System.out.println("show Fu2");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		//

	}

}
