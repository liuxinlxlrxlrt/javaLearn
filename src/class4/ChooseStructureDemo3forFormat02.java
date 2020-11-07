package class4;

/*
 * 需求：请在控制台输出1-10
 */

public class ChooseStructureDemo3forFormat02 {
	public static void main(String[] args) {
		//原始做法
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		System.out.println("---------------");
		
		//如何改进呢？用循环改进
		for(int x = 1;x<=10;x++) {
			System.out.println(x);
		}
		System.out.println("---------------");
		for(int x = 0;x<10;x++) {
			System.out.println(x+1);
		}
	}
}
