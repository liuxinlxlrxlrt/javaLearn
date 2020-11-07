package class21_OutputStreamWriter_InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream in)：用默认编码读取数据
 * InputStreamReader(InputStream in, String charsetName)：用指定编码读取数据
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		//创建对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		//读取数据
		//一次读取一个字符
		int ch = 0;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);
		}
	}

}
