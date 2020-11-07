package class7;

public class StandardPhoneTest {

	public static void main(String[] args) {
		// 创建对象
		StandardPhone p = new StandardPhone();

		// 给成员变量赋值
		p.setBrand("若基亚");
		p.setPrice(199);
		p.setColor("土豪金");

		// 获取值
		System.out.println(p.getBrand() + "-" + p.getPrice() + "-" + p.getColor());
	}

}
