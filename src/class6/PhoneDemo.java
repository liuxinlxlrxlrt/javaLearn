package class6;

public class PhoneDemo {
	public static void main(String[] args) {
		// 创建手机对象
		// 类名 对象名 = new 类名();
		Phone p = new Phone();

		// 直接输出成员变量
		System.out.println(p.brand + "..." + p.price + "..." + p.color);

		// 给成员变量赋值
		p.brand = "华为Mate10";
		p.price = 3999;
		p.color = "银白色";
		System.out.println(p.brand + "..." + p.price + "..." + p.color);

		// 调用方法
		p.call("高圆圆");
		p.sendMessage();
		p.palyGame();
	}
}
