package class6;

public class PhoneDemo {
	public static void main(String[] args) {
		// �����ֻ�����
		// ���� ������ = new ����();
		Phone p = new Phone();

		// ֱ�������Ա����
		System.out.println(p.brand + "..." + p.price + "..." + p.color);

		// ����Ա������ֵ
		p.brand = "��ΪMate10";
		p.price = 3999;
		p.color = "����ɫ";
		System.out.println(p.brand + "..." + p.price + "..." + p.color);

		// ���÷���
		p.call("��ԲԲ");
		p.sendMessage();
		p.palyGame();
	}
}
