package class22_Properties;
/*
 * 这里的集合必须是Properties集合：
 * public void load(Reader reader)：把文件中的数据读取到集合中
 * public void store(Writer writer,String comments)：把集合中的数据存储到文件
 * 
 * 单击版游戏：
 * 		速度保存和加载
 * 		三国奇侠传，三国志
 * 		
 * 		卢布=1
 * 		方天画戟=1
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo03 {
	public static void main(String[] args) throws IOException {
			myload();
			myStore();
		
	}

	private static void myStore() throws IOException {
		//创建结合对象
		Properties prop = new Properties();
		
		prop.setProperty("古力娜扎", "25");
		prop.setProperty("陈法拉", "27");
		prop.setProperty("林允儿", "26");
		System.out.println("prop"+prop);
		//public void store(Writer writer,String comments)：把集合中的数据存储到文件
		Writer w = new FileWriter("name.txt");
//		prop.store(w, "null");
//		prop.store(w, "描述");
		prop.store(w, "display");
		w.close();
		
	}

	private static void myload() throws IOException {
		Properties prop = new Properties();
		
		//public void load(Reader reader)：把文件中的数据读取到集合中
		//注意：这个文件的数据必须是键值对形式
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();
		
		System.out.println("prop:"+prop);
	}
}
