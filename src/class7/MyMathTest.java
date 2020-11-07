package class7;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		//创建键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个操作数：");
		int fristNumber = sc.nextInt();
		System.out.println("请输入第二个操作数：");
		int secondNumber = sc.nextInt();
		
		//创建Mymath对象，并使用
		MyMath mm = new MyMath();
		
		System.out.println("加法结果："+mm.add(fristNumber, secondNumber));
		System.out.println("减法结果："+mm.sub(fristNumber, secondNumber));
		System.out.println("乘法结果："+mm.mul(fristNumber, secondNumber));
		System.out.println("除法结果："+mm.div(fristNumber, secondNumber));
	}
}
