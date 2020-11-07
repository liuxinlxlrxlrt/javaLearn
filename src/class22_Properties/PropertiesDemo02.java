package class22_Properties;
/*
 * ���й��ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key)����ȡԪ��
 * public Set<String> stringPropertyNames()����ȡ���еļ��ļ���
 */

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {

	public static void main(String[] args) {
		//�������϶���
		Properties prop = new Properties();
		
		//���Ԫ��
		//public Object setProperty(String key,String value)�����Ԫ��
		prop.setProperty("����", "22");
		prop.setProperty("��С�", "23");
		prop.setProperty("�ܺ���", "24");
		prop.setProperty("����", "25");
		prop.setProperty("������", "26");
		
		//public Set<String> stringPropertyNames()����ȡ���еļ��ļ���
		//public String getProperty(String key)����ȡԪ��
		Set<String> set = prop.stringPropertyNames();
		for(String key:set) {
			String value = prop.getProperty(key);
			System.out.println(key+"---"+value);
		}
		
		
		
		
		
		
	}
}
/*
 * class Hashtable{
 * 		public V put(K key,V value){
 * 			...
 * 		}
 * }
 * 
 * class Properties extends Hashtable{
 * 		public V setProperty(String key,String value){
 * 			return put(key,value);
 * 		}
 * }
 * 
 */

