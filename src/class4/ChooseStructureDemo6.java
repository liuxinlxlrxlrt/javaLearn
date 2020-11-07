package class4;

/*
 * 注意死循环
 * 		A:一定要注意控制条件语句控制哪个变量的问题，不要弄丢了，否则就容易死循环
 * 		B:两种最简单的死循环格式
 */

public class ChooseStructureDemo6 {
	public static void main(String[] args) {
		int x = 0;
		while (x < 10) {
			System.out.println(x);
			x++;
		}
		System.out.println("----------------");

		/*
		 * while (true) { System.out.println("今天我很高兴学习了死循环"); }
		 */
		System.out.println("----------------");

		for (;;) {
			System.out.println("今天我很高兴学习了死循环");
		}
	}
}
