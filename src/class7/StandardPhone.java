package class7;
/*
 * ��׼���ֻ��� ��ϰ
 * 
 * �ֻ���
 * 		��Ա������brand,price,color
 * 		���췽�����޲ι���
 * 		��Ա������getXxx()/setXxx()
 */

public class StandardPhone {
	//Ʒ��
	private String brand;
	//�۸�
	private int price;
	//��ɫ
	private String color;
	//�޲ι��췽��
	public StandardPhone() {}
	//getXxx()/setXxx()����
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


