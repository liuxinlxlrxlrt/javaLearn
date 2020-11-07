package class16_Generic;

public class InterDemo {
	public static void main(String[] args) {
		// 第一种情况的测试
//		Inter<String> i = new InterImp1();
//		i.show("hello");

		// 第二种情况的测试
		Inter<String> i = new InterImp1<String>();
		i.show("hello");

		Inter<Integer> ii = new InterImp1<Integer>();
		ii.show(100);

		Inter<Boolean> iii = new InterImp1<Boolean>();
		iii.show(true);
	}
}
