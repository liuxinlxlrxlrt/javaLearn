package class7;

import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		//创建录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形的长");
		int length = sc.nextInt();
		System.out.println(length);
		System.out.println("请输入长方形的宽");
		int width = sc.nextInt();
		System.out.println(width);
		//创建对象
		Rectangle r = new Rectangle();
		//先给成员变量赋值
		r.setLength(length);
		r.setWidth(width);
		//计算周长
		System.out.println("周长是："+r.getPerimeter());
		//计算周长
		System.out.println("面积是"+r.getAcreage());
	}
}
