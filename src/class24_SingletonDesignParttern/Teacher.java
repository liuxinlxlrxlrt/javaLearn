package class24_SingletonDesignParttern;

/*
 * ������ʽ:
 * 		����ʽ����һ���ؾʹ�������
 * 		����ʽ���õ�ʱ����ȥ��������
 * 
 *�����⣺����ģʽ��˼����ʲô����дһ����������.
 *		����������ʽ(�ǲ��������ĵ���ģʽ)
 *		���ԣ�����ʽ(���ܻ������ĵ���ģʽ)
 *			A��������(�ӳ�˼��)
 *			B���̰߳�ȫ���⣺
 *				a���Ƿ���̻߳��� ��
 *				b���Ƿ������������	��
 *				c���Ƿ��ж����������������� ��
 */

public class Teacher {
	private Teacher() {
		
	}
	
	private static Teacher t = null;
	
	public synchronized static Teacher getTeacher() {
		if(t == null) {
			t = new Teacher();
		}
		
		return t;
	}
}
