package class4;

/*
 * 需求，请输出一个4行5列的星星图案
 * 
 * 循环嵌套：就是循环语句的循环体本身是一个循环语句
 * 
 * 通过结果我们知道这样的一个结论
 * 		外循环控制行数，
 * 		内循环控制列数
 */

public class ChooseStructureDemo6Test01 {
	public static void main(String[] args) {
		//原始做法
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-----------------------");
		
		//虽然可以完成需求，但是不是很好
		//如果是多行队列就会比较麻烦
		//如何改进呢？
		//如果在一行上打出多可“*”，而代码是重复的，所以我们就用循环改进
		for(int y=1;y<=5;y++) {
			System.out.print("*");
		}
		//我们可以通过空的输出实现换行
		System.out.println();
		System.out.println("-----------------------");
		
		//打印出第二行
		for(int y=1;y<=5;y++) {
			System.out.print("*");
		}
		//我们可以通过空的输出实现换行
		System.out.println();
		System.out.println("-----------------------");
		
		//同样的代码出现4次，说明我们程序写的不好，用循环改进
		for(int x=1;x<5;x++) {
			for(int y=1;y<=5;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
