package class8_Inheritance;
/*
 * �����ɣ�
 * 		��Ա������
 * 		���췽����
 * 		��Ա������
 * �����������ֽ��˼̳У��������Ǿ�Ӧ�ÿ���һ�£������ɲ��ֵĸ��Թ�ϵ
 * 
 * �̳��г�Ա�����Ĺ�ϵ��
 * 		A:�����г�Ա�����͸����еĳ�Ա�������Ʋ�һ��
 * 		B:�����г�Ա�����͸����еĳ�Ա�������Ʋ�һ��
 * 			�����෽���з���һ�������Ĳ���˳��(�ͽ�ԭ��)��
 * 				a:�����෽���ľֲ���Χ�ң��о�ʹ��
 * 				b:������ĳ�Ա��Χ�ң��о�ʹ��
 * 				c:�ڸ���ĳ�Ա��Χ�ң��о�ʹ��
 * 
 * 
 * 
 */
class Father5{
	public int num = 10;
	
	public void method() {
		int num = 50;
	}
}
class Son5 extends Father5{
	public int num2 =20;
	public int num = 30;
	
	public void show() {
		int num = 40;
		System.out.println(num);
		System.out.println(num2);
//		System.out.println(num3);//����
	}
}

public class ExtendsDemo5 {
		public static void main(String[] args) {
			//��������
			Son5 s = new Son5();
			s.show();
		}
}
