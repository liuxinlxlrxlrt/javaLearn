package class7;
/*作业：把手机类写成一个标准类，然后创建对象测试功能
 * 
 * 手机类：
 * 		成员变量：
 * 			品牌：String brand
 * 			价格：int price
 * 			颜色：String color
 * 		成员变量：
 * 			针对每一个成员变量给出对应的getXxx()和setXxx()方法
 * 		最后定义测试：
 * 			创建一个对象，先通过getXxx()方法输出成员变量的值，这一次的结果是null---0---null
 * 			然后通过setXxx()方法给成员变量赋值，再次输出结果，这一次的结果是三星---2999---土豪金
 */

class Phone01 {
	// 品牌
	private String brand;
	// 价格
	private int price;
	// 颜色
	private String color;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class PhoneTest {

	public static void main(String[] args) {
		// 创建第一个对象
		Phone01 p1 = new Phone01();
		System.out.println(p1.getBrand() + "---" + p1.getPrice() + "---" + p1.getColor());

		// 创建第一个对象
		Phone01 p2 = new Phone01();
		p2.setBrand("三星");
		p2.setPrice(2999);
		p2.setColor("土豪金");
		System.out.println(p2.getBrand() + "---" + p2.getPrice() + "---" + p2.getColor());
	}
}
