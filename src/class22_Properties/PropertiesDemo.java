package class22_Properties;
/*
 * Properties:属性集合类，是一个可以和IO流向结合使用的集合类
 * Properties：课保存在流中或者从流中加载，属性列表中每个键及其对应值都是一个字符串
 * 
 * 是Hashtable的子类，说明是一个Map集合
 */

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		//创建集合对象
		//下面么这种用法是错误的，一定要看API，如果没有<>，就说明该类不是一个泛型类，在使用的时候就不能加泛型
//		Properties<String,String> prop = Properties<String,String>();
		
		Properties prop = new Properties();
		
		//添加元素
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
//		System.out.println("prop:"+prop);
		
		//遍历结合
		Set<Object> set = prop.keySet();
		for(Object key : set) {
			Object value = prop.get(key);
			System.out.println(key+"---"+value);
		}
		
	}
}
