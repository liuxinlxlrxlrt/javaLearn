package class9_final;
/*
 * �̳еĴ�������
 * 
 * ���ڼ̳��з�����һ�����󣬷���������
 * ���ԣ�����Ĺ��ܣ��ͻᱻ��������ǵ�
 * ��Щʱ�����ǲ���������ȥ���ǵ�����Ĺ��ܣ�ֻ������ʹ��
 * ���ʱ��������������Java�ṩ��һ���ؼ��֣�final
 * 
 * final�����յ���˼���������������������࣬������������
 */
class Fu{
	//��final���εķ�ʽ�ǲ����Ա���д��
	public final void show() {
		System.out.println("�����Ǿ�����Դ���κ��˲��ܸ���");
	}
}
 class Zi extends Fu {
	 public void show1() {
		 System.out.println("����һ������");
	 }
 }

public class finalDemo {
	public static void main(String[] args) {
		//��������
		Zi z = new Zi();
		z.show();
		z.show1();
	}
}
