package class21_encode;
/*
 * �ֽ�����ȡ���Ŀ��ܳ��ֵ�С���⣺
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("fis.txt");
		
		//��ȡ����
//		int by = 0;
//		while((by=fis.read())!=-1) {
//			//System.out.print(by);
//			System.out.print((char)by);
//		}
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
		
		//�ͷ���Դ
		fis.close();
	}

}
