package class18_Map01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map���ϵı���
 * map---���޶�
 * 
 * ˼·��
 * 		A����ȡ���н��֤�ļ���
 * 		B���������֤�ļ��ϵõ�ÿһ�����֤
 * 		C�����ݽ��֤��ȡ�ɷ������
 * 
 * ˼·ת����
 * 		A����ȡ���м�ֵ�Զ���ļ���
 * 		B��������ֵ�Զ���ļ���,��ȡ�õ�ÿһ����ֵ����
 * 		C�����ݼ�ֵ�Զ����ȡ ����ֵ
 * 
 *���������鷳�ľ��Ǽ�ֵ�Զ�����α�ʾ�أ�
 *�������ǿ�ʼ��һ��������
 *		Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
 * 
 */
import java.util.Set;

public class MapDemo4 {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String> map = new HashMap<String,String>();
		
		//����Ԫ�ز���ӵ�����
		map.put("���", "С��Ů");
		map.put("����", "����");
		map.put("�", "�����");
		map.put("������", "÷����");
		
		//��ȡ���м�ֵ�Զ���ļ���
		Set<Map.Entry<String,String>> set = map.entrySet();
		
		//������ֵ�Զ���ļ���,��ȡ�õ�ÿһ����ֵ����
		for(Map.Entry<String,String> me:set) {
			//���ݼ�ֵ�Զ����ȡ ����ֵ
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"---"+value);
		}
	}
}
