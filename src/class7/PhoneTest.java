package class7;
/*��ҵ�����ֻ���д��һ����׼�࣬Ȼ�󴴽�������Թ���
 * 
 * �ֻ��ࣺ
 * 		��Ա������
 * 			Ʒ�ƣ�String brand
 * 			�۸�int price
 * 			��ɫ��String color
 * 		��Ա������
 * 			���ÿһ����Ա����������Ӧ��getXxx()��setXxx()����
 * 		�������ԣ�
 * 			����һ��������ͨ��getXxx()���������Ա������ֵ����һ�εĽ����null---0---null
 * 			Ȼ��ͨ��setXxx()��������Ա������ֵ���ٴ�����������һ�εĽ��������---2999---������
 */

class Phone01 {
	// Ʒ��
	private String brand;
	// �۸�
	private int price;
	// ��ɫ
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
		// ������һ������
		Phone01 p1 = new Phone01();
		System.out.println(p1.getBrand() + "---" + p1.getPrice() + "---" + p1.getColor());

		// ������һ������
		Phone01 p2 = new Phone01();
		p2.setBrand("����");
		p2.setPrice(2999);
		p2.setColor("������");
		System.out.println(p2.getBrand() + "---" + p2.getPrice() + "---" + p2.getColor());
	}
}
