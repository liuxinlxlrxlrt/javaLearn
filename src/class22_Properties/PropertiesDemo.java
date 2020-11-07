package class22_Properties;
/*
 * Properties:���Լ����࣬��һ�����Ժ�IO������ʹ�õļ�����
 * Properties���α��������л��ߴ����м��أ������б���ÿ���������Ӧֵ����һ���ַ���
 * 
 * ��Hashtable�����࣬˵����һ��Map����
 */

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		//�������϶���
		//����ô�����÷��Ǵ���ģ�һ��Ҫ��API�����û��<>����˵�����಻��һ�������࣬��ʹ�õ�ʱ��Ͳ��ܼӷ���
//		Properties<String,String> prop = Properties<String,String>();
		
		Properties prop = new Properties();
		
		//���Ԫ��
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
//		System.out.println("prop:"+prop);
		
		//�������
		Set<Object> set = prop.keySet();
		for(Object key : set) {
			Object value = prop.get(key);
			System.out.println(key+"---"+value);
		}
		
	}
}
