package class21_OutputStreamWriter_InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream in)����Ĭ�ϱ����ȡ����
 * InputStreamReader(InputStream in, String charsetName)����ָ�������ȡ����
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		//��������
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		//��ȡ����
		//һ�ζ�ȡһ���ַ�
		int ch = 0;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);
		}
	}

}
