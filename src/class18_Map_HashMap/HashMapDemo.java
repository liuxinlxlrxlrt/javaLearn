package class18_Map_HashMap;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap���ǻ��ڹ�ϣ���Map�ṹʵ��
 * ��ϣ���������������֤����Ψһ�Եġ�
 * 
 *  HashMap<String,String>
 *  ����String
 *  ֵ��String
 */

public class HashMapDemo {
		public static void main(String[] args) {
			//�������϶���
			HashMap<String,String> hm = new HashMap<String,String>();
			
			//����Ԫ�ز����Ԫ��
//			String key1 = "it001"
//			String value1 = "����"
//			hm.put(key1, value1);
			
			hm.put("it001", "����");
			hm.put("it003", "����");
			hm.put("it004", "�ǲ�˹");
			hm.put("it005", "�ų���");
			hm.put("it002", "�ò���");//wps
			hm.put("it001", "�ȶ��Ǵ�");
			
			//����
			Set<String> set = hm.keySet();
			for(String key : set){
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
			
			//Ϊʲôû���������أ�
			//��Ϊ���Ǽ���Ψһ�ģ�HashMap�ǻ��ڹ�ϣ��Ľṹ���ײ�������hashCode()��equals()����,
			//���ڼ���String,String��д��hashCode()��equals()����,���Ծ��ܱ�֤Ψһ�ԡ�
			
		}
}
