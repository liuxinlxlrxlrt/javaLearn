package class21_exercise;
/*
 * BufferedReader
 * public LineNumberReader(Reader in)
 * 		public int getLineNumber()����ȡ��ǰ�к�
 * 		public void setLineNumber(int lineNumber)�����õ�ǰ�к�
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("MyBufferedReader.txt"));
		//��10��ʼ�ȽϺ�
//		lnr.setLineNumber(10);
		System.out.println(lnr.getLineNumber());
		System.out.println(lnr.getLineNumber());
		System.out.println(lnr.getLineNumber());
		
		String line = null;
		while((line = lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+"��"+line);
		}
		lnr.close();
	}
}
