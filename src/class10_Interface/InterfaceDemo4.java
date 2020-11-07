package class10_Interface;
/*
 * 抽象类中是否可以不定义抽象方法
 * 可以的，原因是 不让该类创建对象
 * 
 * 
 */
interface inter{
	//定义四种显示功能
	public void show1();
	public void show2();
	public void show3();
	public void show4();
}

////定义子类，要使用第一种显示方法
//class InterImpl1 implements inter{
//	//要覆盖show1()方法
//	public void show1() {
//		System.out.println("show1 run");
//	}
//	//为了让该类实例化，还需要覆盖其他三个方法，虽然该类用不上
//	public void show2() {}
//	public void show3() {}
//	public void show4() {}
//}
////另一个子类需要使用显示三方法
//class InterImpl3 implements inter{
//	//要覆盖show3()方法
//	public void show3() {
//		System.out.println("show3 run");
//	}
//	//为了让该类实例化，还需要覆盖其他三个方法，虽然该类用不上
//	public void show2() {}
//	public void show1() {}
//	public void show4() {}
//}
/*
 * 出现问题：
 * 为了使用接口中的部分方法，而覆盖了全部的方法，而且每一个子类都要这么做，复用性差
 * 
 * 将这些不用的方法都抽取到一个独立的类中
 * 让这类去实现接口，并覆盖接口中的所有方法
 */

//这个类中的这些方法的具体实现内容吗？不知道
//所以只能为了后期子类创建对象方便，而进行空实现
//而这时，这个类创建对象的有意义上吗？没有意义。这个类创建就不需要，直接将其抽象化。
//所以这就是没有抽象方法的抽象类
abstract class InterImpl implements inter{
	//实现inter接口中的所有方法
	public void show1() {}
	public void show2()	{}
	public void show3()	{}
	public void show4()	{}
}
//如果有子类使用显示1方法，让子类继承InterImpl实现类就可以了
class InterImpl1 extends InterImpl{
	public void show1() {
		System.out.println("show1 run");
	}
}
class InterImpl3 extends InterImpl{
	public void show3() {
		System.out.println("show3 run");
	}
}
public class InterfaceDemo4 {

	public static void main(String[] args) {
		InterImpl in = new InterImpl1();
		in.show1();
		in = new InterImpl3();
		in.show3();
		
	}

}
