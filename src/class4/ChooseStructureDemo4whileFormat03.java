package class4;

/*
 * 需求：统计水仙花数有多少个
 */

public class ChooseStructureDemo4whileFormat03 {
	public static void main(String[] args) {
		// for语句版本
		int count = 0;
		for (int x = 100; x < 1000; x++) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 10 / 10 % 10;

			if (x == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				// 如果相同，就把该数据在控制台输出
				count++;
			}
		}
		System.out.println("水仙花数共有" + count + "个");
		System.out.println("--------------------");

		// while语句版本
		int count2 = 0;
		int y = 100;
		while (y < 1000) {
			int ge = y % 10;
			int shi = y / 10 % 10;
			int bai = y / 10 / 10 % 10;

			if (y == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				// 如果相同，就把该数据在控制台输出
				count++;
			}
			y++;
		}
		System.out.println("水仙花数共有" + count + "个");
	}
}
