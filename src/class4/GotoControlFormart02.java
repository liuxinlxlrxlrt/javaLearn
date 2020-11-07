package class4;
/*
 * continue:继续
 * 
 * 使用场景：
 * 		循环中，离开此场景无意义
 * 
 * 测试：扎到和break的区别
 * 		break:跳出单层循环（跳出整个循环）
 * 		continue:跳出一次循环，进入下一次的执行
 * 
 * 练习题：
 * 			for(int x =0;x<=10;x++) {
			if(x%3==0) {
				//在此处填写代码
			}
			System.out.println("Java基础班");
			我在控制台输出2次：“Java基础班”
				break;
			我在控制台输出7次：“Java基础班”
				continue;
			我在控制台输出13次：“Java基础班”
				System.out.println("Java基础班");
 */

public class GotoControlFormart02 {

	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			if (x == 3) {
				break;
			}
			System.out.println(x);
		}
		System.out.println("----------------");
		for (int y = 0; y < 10; y++) {
			if (y == 3) {
				continue;
			}
			System.out.println(y);
		}
	}
}
