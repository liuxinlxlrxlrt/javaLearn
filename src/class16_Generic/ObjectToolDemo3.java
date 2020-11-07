package class16_Generic;

public class ObjectToolDemo3 {
	public static void main(String[] args) {
//		ObjectTool3 ot3 = new ObjectTool3();
//		ot3.show("hello");
//		ot3.show(100);//自动装箱
//		ot3.show(true);

//		ObjectTool3<String> ot = new ObjectTool3<String>();
//		ot.show("hello");
//		
//		ObjectTool3<Integer> ot2 = new ObjectTool3<Integer>();
//		ot2.show(100);
//		
//		ObjectTool3<Boolean> ot3 = new ObjectTool3<Boolean>();
//		ot3.show(true);

		// 如果还听得懂，那就说明泛型类是没有问题的了，
		// 但是呢，谁说了我的方法要和类上的类型一致呢？
		// 我要是类上没有泛型的话，方法还能不能接受任意类型的参数了呢？

		// 定义泛型方法后
		ObjectTool3 ot = new ObjectTool3();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
	}
}
