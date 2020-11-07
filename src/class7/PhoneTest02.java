package class7;

/*
 * 标准的手机类练习
 * 手机类：
 * 		成员变量：bread,price,color
 * 		构造方法：无参构造
 * 		成员方法：getXxx()和setXxx()
 */
class Phone02 {
	// 品牌
	private String brand;
	// 价格
	private int price;
	// 颜色
	private String color;

	// 无参构造方法
	public Phone02() {
	}

	// 带参构造
	public Phone02(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	// getXxx()和setXxx()

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

public class PhoneTest02 {

	public static void main(String[] args) {
		// 创建对象
		Phone02 p = new Phone02();

		// 给成员变量赋值
		p.setBrand("诺基亚");
		p.setPrice(199);
		p.setColor("灰色");

		// 获取值
		System.out.println(p.getBrand() + "--" + p.getPrice() + "---" + p.getColor());
	}
}
