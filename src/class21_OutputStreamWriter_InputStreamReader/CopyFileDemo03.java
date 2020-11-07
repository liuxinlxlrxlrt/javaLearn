package class21_OutputStreamWriter_InputStreamReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 由于我们常见的操作都是使用本地默认编码，所以不用指定编码，
 * 而转换流的名称有点长，所以，java就提供了其子类供我们使用
 * OutputStreamWriter = FileOutputStream+编码表(GBK)
 * FileWriter = FileInputString+编码表(GBK)
 * 
 * InputStreamReader = FileInputStream++编码表(GBK)
 * FileReader = FileInputStream++编码表(GBK)
 * 
 * * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 * 
 * 数据源：
 * 	c:\\a.txt--读取数据--转换字符流--InputStreamReader--FileReader
 * 
 * 目的地：
 * 	c.txt--写出数据--转换字符流--OutputStreamWriter--FileWriter
 */
public class CopyFileDemo03 {

	public static void main(String[] args) throws IOException {
		//封装数据源
		FileReader fr = new FileReader("a.txt");
		//封装目的地
		FileWriter fw = new FileWriter("c.txt");
		
		//复制数据
		//一次一个字符
//		int ch = 0;
//		while((ch = fr.read())!= -1) {
//			fw.write(ch);
//			fw.flush();
//		}
		
		//一次一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs))!=-1) {
			fw.write(chs, 0, len);
			fw.flush();
		}
		
		//释放资源
		fw.close();
		fr.close();

	}

}
