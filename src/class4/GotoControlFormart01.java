package class4;

/*
 * 控制跳转语句：
 * 		break:中断
 * 		continue:继续
 * 		return:返回
 * 
 * break:中断的意思，
 * 	使用场景：
 * 		A：switch语句中
 * 		B：循环语句汇总。
 * 			（循环语句中加入了if判断）
 * 		注意：离开了上面的两个场景，无意义
 * 
 * 	如何使用呢？
 *   	A：跳出单层循环
 *   	B：跳出多层循环
 *   		要想实现这个结果，就必须知道一个东西，带标签的语句
 *   		格式：
 *   			标签名：语句
 */

public class GotoControlFormart01 {
	public static void main(String[] args) {
		// 在switch或者loop外部中断
		// break

		// 跳出单层循环
		for (int x = 0; x < 10; x++) {
			if (x == 2) {
				break;
			}
			System.out.println("helloworld");
		}
		System.out.println("over");
		System.out.println("-------------------");

		wc: for (int x = 0; x < 3; x++) {
			nc: for (int y = 0; y < 4; y++) {
				if (y == 2) {
					// break nc;
					break wc;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
