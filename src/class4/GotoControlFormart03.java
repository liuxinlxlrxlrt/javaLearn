package class4;
/*
 * return:返回
 * 
 * 其实它的作用不是结束循环的，而是结束方法的
 */

public class GotoControlFormart03 {
	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("退出");
				break;
			}
			System.out.println(x);
		}
		System.out.println("over");
		System.out.println("--------------");

		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("退出");
				continue;
			}
			System.out.println(x);
		}
		System.out.println("over");

		System.out.println("--------------");
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				System.out.println("退出");
				return;
			}
			System.out.println(x);
		}
		System.out.println("over");
	}
}
