package class18_Map_LinkedHashMap;
/*
 * LinkedHashMap:Map �ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 * �ɹ�ϣ���ϼ���Ψһ��
 * ������֤���̵�����(�洢��ȡ����˳��һ��)
 */

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedHashMap<String,String> lhm= new LinkedHashMap<String,String>();
		
		//���������Ԫ��
		lhm.put("2345", "hello");
		lhm.put("1234", "world");
		lhm.put("3456", "java");
		lhm.put("1234", "javaee");
		lhm.put("3456", "android");
		
		//����
		Set<String> set = lhm.keySet();
		for(String key:set) {
			String value = lhm.get(key);
			System.out.println(key+"---"+value);
		}
	}
}
