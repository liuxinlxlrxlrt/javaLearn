package class8_Inheritance;

/*
 * �����ǣ�
 * 	1.�Ҳ�����Ҫ����ֲ���Χ��num,��Ҫ��������Ա��Χ��num,��ô���أ�
 * 		this�����ñ�����Ա����
 * 	2.�һ���Ҫ��������Ա��Χ��num,��ô���أ�		
 * 		�����һ��������this���ƣ����ǿ���ֱ�ӷ��ʸ�������ݾͺ��ˡ�
 * 		��ϲ�㣬����ؼ����Ǵ��ڵģ�super.
 * 
 * this��super������
 * �ֱ���ʲô�أ�
 * 		this�������Ӧ������
 * 		super������洢�ռ�ı�ʶ(�������Ϊ��������ã����Բ�������ĳ�Ա)��
 * 
 * ��ô���أ�
 *     A�����ó�Ա����
 *     		this.��Ա���������ñ���ĳ�Ա����
 *     		super.��Ա���������ø���ĳ�Ա���� 
 *     B�����ù��췽��
 *     		this(...) ���ñ���Ĺ��췽��
 *     		super(...) ���ø���Ĺ��췽��
 *     C�����ó�Ա����
 *     		this.��Ա���� ���ñ���ĳ�Ա����
 *     		super.��Ա���� ���ø���ĳ�Ա����
 *     
 * 
 */
class Father6 {
	public int num = 10;
}

class Son6 extends Father6 {
	public int num = 20;

	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

public class ExtendsDemo6 {
	public static void main(String[] args) {
		Son6 s = new Son6();
		s.show();
	}
}
