package class20_IOStream_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�e:\\01.01_���������(���������).avi���Ƶ���ǰ��ĿĿ¼�µ�01.01_copy���������(���������).avi��
 * ����Դ����������
 * c:\\01.01_���������(���������).avi ---��ȡ����---FileInputStream
 * 
 * Ŀ�ĵأ�������ȥ
 * d:\\01.01_copy���������(���������).avi ---д���� --- FileOutputStream
 * 
 */

public class FileInputStreamDemo04 {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("c:\\01.01_���������(���������).avi");
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("d:\\01.01_copy���������(���������).avi");
		
		//����AIV ��Ƶ
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}

}
