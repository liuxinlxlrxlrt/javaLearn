package class21_exercise;
/*
 * 需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 分析：通过题目的意思我们可以指定如下的一下内容
 * 		ArrayList集合了存储的字符串
 * 		遍历ArrayLsit集合，把数据获取到
 * 		然后存储到文本文件中
 * 		文本文件说明使用字符流
 * 
 * 数据源：
 *		ArrayList<String>--里边每一个字符串数据
 *目的地：
 *		a.txt--FileWriter--BuuuferWriter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {

	public static void main(String[] args) throws IOException {
		//封装数据与创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("ab.txt"));
		
		//遍历集合
		for(String s : array) {
			//写数据
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
	}

}
