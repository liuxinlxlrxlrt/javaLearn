package class20_IOStream_FileInputStream;
/*
 * ���󣺰�e:\\����ϼ.jpg���ݸ��Ƶ���ǰ��ĿĿ¼�µ�mn.jpg��
 * ����Դ����������
 * c:\\������.jpg ---��ȡ����---FileInputStream
 * 
 * Ŀ�ĵأ�������ȥ
 * mn.txt ---д���� --- FileOutputStream
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTupianDemo {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("C:\\������.jpg");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		//��������
		int by = 0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
		
		
	}

}
