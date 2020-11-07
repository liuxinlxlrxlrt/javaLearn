package class16_Generic;

/*
 * ���ڵ�ʱ������ʹ��Object��������������
 * ����ת����û������ģ�����������ת�͵�ʱ����ʵ����������ת������
 * Ҳ����˵�����ĳ�����ʵ�����ǰ�ȫ�ģ�����Java��JDK5�������˷��ͣ���߳���İ�ȫ��
 */

public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		ot.setObj(new Integer(27));
		Integer i = (Integer) ot.getObj();
		System.out.println("�����ǣ�" + i);

		ot.setObj(new String("����ϼ"));
		String s = (String) ot.getObj();
		System.out.println("�����ǣ�" + s);

		System.out.println("----------------");
		ot.setObj(new Integer(30));
		// ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		String ss = (String) ot.getObj();
		System.out.println("�����ǣ�" + ss);
	}
}
