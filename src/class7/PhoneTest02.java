package class7;

/*
 * ��׼���ֻ�����ϰ
 * �ֻ��ࣺ
 * 		��Ա������bread,price,color
 * 		���췽�����޲ι���
 * 		��Ա������getXxx()��setXxx()
 */
class Phone02 {
	// Ʒ��
	private String brand;
	// �۸�
	private int price;
	// ��ɫ
	private String color;

	// �޲ι��췽��
	public Phone02() {
	}

	// ���ι���
	public Phone02(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	// getXxx()��setXxx()

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
		// ��������
		Phone02 p = new Phone02();

		// ����Ա������ֵ
		p.setBrand("ŵ����");
		p.setPrice(199);
		p.setColor("��ɫ");

		// ��ȡֵ
		System.out.println(p.getBrand() + "--" + p.getPrice() + "---" + p.getColor());
	}
}
