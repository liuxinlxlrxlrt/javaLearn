package class18_Map_exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*����ArrayList����Ƕ��HashMap���ϱ���
 * ����ArrayList��Ԫ��HashMap����,��3��
 * ÿһ��ArrayList���ϵ�ֵ���ַ���
 * 	Ԫ�����Ѿ���ɣ������
 * 
 * �����
 * ��������
 *  	���---С��
 *  	����---����
 * 	�������
 * 		����---����
 * 		���---С��Ů				
 * 	Ц������
 * 		�����---��ӯӯ
 * 		��ƽ֮---����ɺ

 * 
 */

public class ArrayListIncludeHashMapDemo {

	public static void main(String[] args) {
		//�������϶���
		ArrayList<HashMap<String,String>>  array = new ArrayList<HashMap<String,String>>();
		
		//����Ԫ��1
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("���", "С��");
		hm1.put("����", "С��Ů");
		
		array.add(hm1);
		
		//����Ԫ��2
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm1.put("����", "����");
		hm1.put("���", "����");
		array.add(hm2);
		
		
		//����Ԫ��2
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm1.put("�����", "��ӯӯ");
		hm1.put("��ƽ֮", "����ɺ");
		array.add(hm3);
		
		//����
		for(HashMap<String,String> hm:array) {
			Set<String> set = hm.keySet();
			for(String key :set) {
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
		}
	}

}
