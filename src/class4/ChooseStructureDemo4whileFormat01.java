package class4;

/*
 * while循环语句格式：
 *		基本格式
 *   		while(判断条件语句) {
 *         	循环体语句;
 *   		}
 *		扩展格式
 *  		初始化语句;
 *   		while(判断条件语句) {
 *        	循环体语句;
 *        	控制条件语句;
 *   		}
 *   通过这个格式，我们就看到其实和for循环是差不多的
 *   
 *   for(初始化语句；判断条件语句；控制条件语句){
 *   	循环语句体
 *   }
 */

public class ChooseStructureDemo4whileFormat01 {
	public static void main(String[] args) {
		// 首先输出10次“helloworld”

		for (int x = 0; x < 10; x++) {
			System.out.println("helloworld");
		}
		System.out.println("-----------------");

		// while语句版本
		int x = 0;
		while (x < 10) {
			System.out.println("hellworld");
			x++;
		}
	}
}
