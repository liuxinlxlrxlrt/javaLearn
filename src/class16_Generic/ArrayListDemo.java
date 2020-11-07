package class16_Generic;

/*
 * ArrayList�洢�ַ���������
 * 
 * ���ǰ���������д��д������򣬽��������
 * Ϊʲô��?
 * 		��Ϊ���ǿ�ʼ�洢��ʱ�򣬴洢��String��Integer�������͵�����
 * 		���ڱ�����ʱ�����ǰ����Ƕ�����String���ʹ���,����ת�������Ծͱ�����,
 * �����أ����ڱ���ʱ��ȴû�и������ǡ�
 * �����Ҿ;��������ƵĲ��á�
 * ����һ�£����ǵ�����
 * 		String[] strArray = new String[3];
 * 		strArray[0] = "hello";
 * 		strArray[0] = "hello";
 * 		strArray[0] = 10;
 * ����Ҳģ��������������������ڴ��������ʱ����ȷԪ�ص��������ͣ������Ͳ�����������
 * �����ּ�������Ϊ�������͡���
 * 
 * ���ͣ���һ�ְ�����������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ�����ȷ����������͡����������ͣ������͵�������һ�����ݡ�
 * ��ʽ��
 * 		<��������>
 * 		�˴�����������ֻ������������
 * 
 * �ô���
 * 		A��������ʱ�ڵ�������ǰ���˱����ڼ�
 * 		B��������ǿ������ת��
 * 		C���Ż�������ƣ�����˻�ɫ������
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		// �������϶���
		ArrayList<String> array = new ArrayList<String>();

		// ����Ԫ�ض��󣬲����Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		// Integer����������
		// array.add(new Integer(100));
		// array.add(10);//10�ǻ������ͣ�����JDK7�Ժ��Զ�װ��
		// �ȼ��ڣ�array.add(Integer.valueof(10));

		// ����
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			// String s = (String)it.next();//����Ҫǿת��
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("-------------------");

		// ������Ĵ���
//		String[] strArray = new String[3];
//		strArray[0] = "hello";
//		strArray[1] = "hello";
//		strArray[2] = 10;//Stringһ��ʼ�͸���������String���ͣ����Ծͱ�����
	}
}
