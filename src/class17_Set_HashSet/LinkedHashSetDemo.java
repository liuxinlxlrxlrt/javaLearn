package class17_Set_HashSet;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet:�ײ����ݽṹ�ɹ�ϣ��������б�ʵ��
 * ��ϣ��֤Ԫ�ص�Ψһ��
 * ����֤Ԫ�����򣨴洢��ȡ����һ�£�
 */

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//���������Ԫ��
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("world");
		lhs.add("java");
		
		//����
		for(String s : lhs) {
			System.out.println(s);
		}
	}
}
