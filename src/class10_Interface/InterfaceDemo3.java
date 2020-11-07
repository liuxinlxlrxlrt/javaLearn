package class10_Interface;
/*
 * 【接口出现后的一些小细节】
   1.类与类
		继承(is a)关系，只能单继承，但是可以多层继承
   2.类与接口
		实现(like a)关系，可以单实现，也可以多实现。还可以在继承一个类的同时实现多个接口
   3.接口与接口
		继承关系，可以单继承，也可以多继承
 */
//3.接口与接口
interface interA{
	void show1();
}
interface interAA{
	void show11();
}
interface interB extends interA,interAA{
	void show2();
}
class Test implements interB{
	public void show1() {};
	public void show2() {};
	public void show11(){};
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		//

	}

}
