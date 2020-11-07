package class21_BufferedWriter_BufferedReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�d.txt��
 * 
 * ����Դ��
 * 	a.txt--��ȡ����--ת���ַ���--InputStreamReader--FileReader--BufferedReader
 * 
 * Ŀ�ĵأ�
 * 	d.txt--д������--ת���ַ���--OutputStreamWriter--FileWriter--BufferedWriter
 */
public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("d.txt"));
		
		//���ַ�ʽ���е�һ��һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs))!=-1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}

}
