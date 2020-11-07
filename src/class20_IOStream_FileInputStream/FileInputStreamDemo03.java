package class20_IOStream_FileInputStream;
/*
 * ���󣺰�c:\\a.txt�����ݸ��Ƶ�d:\\b.txt
 * ����Դ��
 * c:\\a.txt--��ȡ����--FileInputStream
 * Ŀ�ĵأ�
 * d:\\b.txt--д������--FileOutputStream
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo03 {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		FileOutputStream fos = new FileOutputStream("d:\\b.txt");
		
		//��������
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}

}
