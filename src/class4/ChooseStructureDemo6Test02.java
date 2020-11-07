package class4;

/*
 * 需求：请输出如下图形
			*
			**
			***
			****
			*****
 */
public class ChooseStructureDemo6Test02 {
	public static void main(String[] args) {
		// 通过观察，我们看到一个行为5，列数是变化的形状
		// 我们光打印一个5行5列的形状
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");

		// 列数是如何变化的呢？
		// 第一行：1列 int y=1;y<=1;y++
		// 第二行：2列 int y=1;y<=2;y++
		// 第三行：3列 int y=1;y<=3;y++
		// 第四行：4列 int y=1;y<=4;y++
		// 第五行：5列 int y=1;y<=5;y++
		// 外循环 x的变化，恰好就是1,2,3,4,5

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
