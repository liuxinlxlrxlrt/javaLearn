package class21_exercise;
/*
 * BufferedReader
 * public LineNumberReader(Reader in)
 * 		public int getLineNumber()：获取当前行号
 * 		public void setLineNumber(int lineNumber)：设置当前行号
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("MyBufferedReader.txt"));
		//从10开始比较好
//		lnr.setLineNumber(10);
		System.out.println(lnr.getLineNumber());
		System.out.println(lnr.getLineNumber());
		System.out.println(lnr.getLineNumber());
		
		String line = null;
		while((line = lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+"："+line);
		}
		lnr.close();
	}
}
