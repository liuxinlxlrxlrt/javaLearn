package class15_Collection;
/*
 * ���ϵı�������ʵ����һ�λ�ȡ�����е�ÿһ��Ԫ��
 * Object[] toArray();�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ���Ԫ��
		c.add("hello");// Object obj = "hello";����ת��
		c.add("world");
		c.add("java");

		// ����
		// �Ѽ���ת�������飺Object[] toArray();�Ѽ���ת�����飬����ʵ�ּ��ϵı���
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			// ���ÿһ�������е�ֵ
			// System.out.println(objs[x]);

			// ��֪��Ԫ�����ַ��������ڻ�ȡ��Ԫ�ص�ͬʱ������֪��Ԫ�صĳ���
			// System.out.println(objs[x]+"---"+objs[x].length());
			// Ϊʲô���ˣ���Ϊobjs[x]��һ��Ԫ�أ�Ԫ����object���ͣ�object����û��length()����
			// for(int x=0;x<objs.length;x++)Ϊʲô�����أ�
			// ��ΪĬ�ϵ��õ�objs��toString����

			// �����ʵ�ֲ���,ԭ����object��û��length()����
			// ������Ҫʹ���ַ����ķ������ͱ����Ԫ�ػ�ԭ���ַ���
			// ����ת��
			String s = (String) objs[x];
			System.out.println(s + "---" + s.length());
		}
	}
}
