package class7;

public class StandardPhoneTest {

	public static void main(String[] args) {
		// ��������
		StandardPhone p = new StandardPhone();

		// ����Ա������ֵ
		p.setBrand("������");
		p.setPrice(199);
		p.setColor("������");

		// ��ȡֵ
		System.out.println(p.getBrand() + "-" + p.getPrice() + "-" + p.getColor());
	}

}
