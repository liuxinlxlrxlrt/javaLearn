package class16_Generic;

/*
 * 实现类在实现接口的时候
 * 	1.第一种情况：已经知道该是什么类型的了
 * 	2.第二种情况：还不知道是什么类型的
 */

//public class InterImp1 implements Inter<String>{
//1.第一种情况：已经知道该是什么类型的了(不常见)
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//2.第二种情况：还不知道是什么类型的（常见）
public class InterImp1<T> implements Inter<T> {
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
