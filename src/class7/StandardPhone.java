package class7;
/*
 * 标准的手机类 练习
 * 
 * 手机类
 * 		成员变量：brand,price,color
 * 		构造方法：无参构造
 * 		成员变量：getXxx()/setXxx()
 */

public class StandardPhone {
	//品牌
	private String brand;
	//价格
	private int price;
	//颜色
	private String color;
	//无参构造方法
	public StandardPhone() {}
	//getXxx()/setXxx()方法
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


