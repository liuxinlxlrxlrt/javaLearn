package class6;

public class Phone {
	// 品牌
	String brand;
	// 价格
	int price;
	// 颜色
	String color;

	// 打电话的方法
	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}

	// 发短信的方法
	public void sendMessage() {
		System.out.println("群发短信");
	}

	// 玩游戏的方法
	public void palyGame() {
		System.out.println("玩游戏");
	}
}
