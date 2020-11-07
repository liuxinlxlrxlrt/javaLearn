package class18_Map_TreeMap;
/*
 * TreeMap:�ǻ��ں������MAP�ӿڵ�ʵ�֡�
 * TreeMap<String,String>
 * ����String
 * ֵ��String
 * 
 * �޲ι��죺�õ�����Ȼ������Ȼ����ͱ����ö�����������ʵ��comparable�ӿ�
 * 
 */

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		//�������϶���
		//public final class String
		//implements Comparable<String>�ַ�������ʵ����Comparable�ӿ�
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		//����Ԫ�ز����Ԫ��
		tm.put("hello", "���");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("world", "����2");
		tm.put("javaee", "צ��EE");
		
		//��������
		Set<String> set = tm.keySet();
		for(String key :set) {
			String value = tm.get(key);
			System.out.println(key+"---"+value);
		}
		//���أ�hello---���
//				java---צ��
//				javaee---צ��EE
//				world---����2
		
	}
}
