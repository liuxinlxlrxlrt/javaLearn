package class15_Collection;
/*
 * Iterator iterator();�����������ϵ�ר�ñ�����ʽ
 * 		A.Object next();��ȡԪ��,���ƶ�����һ��λ��
 * 		B.NoSuchElementException��û��������Ԫ�أ���Ϊ���Ѿ��ҵ������
 * 		C.boolean hasNext();������е����ͷ���true��û�о�false
 * 		D.next();������һ��Ԫ��
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		// ��������
		Collection c = new ArrayList();

		// ���������Ԫ��
//		String s = "hello";
//		c.add(s);

		c.add("hello");
		c.add("world");
		c.add("java");

		// ��ȡ���ܣ�Iterator iterator();�����������ϵ�ר�ñ�����ʽ
		Iterator it = c.iterator();// ʵ�ʷ��صĿ϶���������������Ƕ�̬

//		Object obj = it.next();
//		System.out.println(obj);//���hello
//		System.out.println(it.next());//hello
//		System.out.println(it.next());//world
//		System.out.println(it.next());//java
//		System.out.println(it.next());//NoSuchElementException
//		//���һ������д����������Ӧ��ÿ�λ�ȡǰӦ����һ���жϾͺ���
		// �ж��Ƿ�����һ��Ԫ�أ��оͻ�ȡ��û�оͲ�������

//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}

		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
