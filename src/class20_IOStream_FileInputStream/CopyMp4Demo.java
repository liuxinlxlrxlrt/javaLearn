package class20_IOStream_FileInputStream;
/*
 * ���󣺰�e:\\01.01_���������(���������).avi���Ƶ���ǰ��ĿĿ¼�µ�01.01_copy���������(���������).avi��
 * 
 * ����Դ����������
 * c:\\01.01_���������(���������).avi ---��ȡ����---FileInputStream
 * 
 * Ŀ�ĵأ�������ȥ
 * 01.01_copy���������(���������).avi ---д���� --- FileOutputStream
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp4Demo {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("c:\\01.01_���������(���������).avi");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("01.01_copy���������(���������).avi");
		
		//������Ƶ
		int by =0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}

}
