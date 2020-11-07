package class22_Properties;
/*
 * 特有功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key)：获取元素
 * public Set<String> stringPropertyNames()：获取所有的键的集合
 */

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {

	public static void main(String[] args) {
		//创建集合对象
		Properties prop = new Properties();
		
		//添加元素
		//public Object setProperty(String key,String value)：添加元素
		prop.setProperty("美娜", "22");
		prop.setProperty("陈小纭", "23");
		prop.setProperty("周海媚", "24");
		prop.setProperty("乔欣", "25");
		prop.setProperty("张美曦", "26");
		
		//public Set<String> stringPropertyNames()：获取所有的键的集合
		//public String getProperty(String key)：获取元素
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

