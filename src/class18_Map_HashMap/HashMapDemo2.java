package class18_Map_HashMap;
/*
 *  HashMap<String,String>
 *  ����Integer
 *  ֵ��String
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		//�������϶���
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//����Ԫ�ز����Ԫ��
		//Integer i = new Integer(27);
		//Integer i = 27;
		//String s = "����ϼ";
		//hm.put(i, s);
		//27����������(Integer),�����Զ�װ��
		hm.put(27, "����ϼ");
		hm.put(30, "������");
		hm.put(28, "����");
		hm.put(29, "����ϼ");
		//0��ͷ��ʾ�ǰ˽�������,�˽���ֻ����0-7��ɣ�008��8�����Բ���
		//�����д���ǰ˽���,���ǲ��ܳ���8���ϵĵ�������
//		hm.put(003, "hwllo");
//		hm.put(006, "hwllo");
//		hm.put(007, "hwllo");
//		hm.put(008, "hwllo");
		
		//����
		Set<Integer> set = hm.keySet();
		for(Integer key :set) {
			String value = hm.get(key);
			System.out.println(key+"---"+value);
		}
		//�������ַ�ʽ�����Ǽ��ϵ�Ԫ�ص��ַ�����ʾ
		System.out.println("hm:"+hm);
		
		System.out.println("-----------------");
////		String s =Integer.valueOf(i);
////		String s1 = Integer.toString(i);
//		
//		Set<Map.Entry<String, String>> set = hm.entrySet();
//		
//		for(Map.Entry<String, String> me:set) {
//			String key =(String) me.getKey();
//			String value = me.getValue();
//			System.out.println(key+"---"+value);
//		}
//		
//		
		
		
	}
}
