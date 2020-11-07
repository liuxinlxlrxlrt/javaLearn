package class16_Generic;

//public class ObjectTool3<T> {
////	//方法的重载
//////	public void show(String s) {
//////		System.out.println(s);
//////
//////	}
//////	
//////	public void show(Integer i) {
//////		System.out.println(i);
//////	}
//////	
//////	public void show(Boolean b) {
//////		System.out.println(b);
//////	}
////	
////	public void show(T t) {
////	System.out.println(t);
////}
//
//	public void show(T t) {
//	System.out.println(t);
//	}
//}

public class ObjectTool3{
	//泛型定义在方法上，调用方法的时候你传什么类型，<T>就是什么类型
	public <T> void show(T t) {
	System.out.println(t);
	}
}
