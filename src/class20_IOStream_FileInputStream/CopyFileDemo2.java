package class20_IOStream_FileInputStream;
/*
 *  ���󣺰�c���µ�a.txt�����ݸ��Ƶ�d���µ�b.txt��
 * 
 * ����Դ����������
 * c:\\a.txt ---��ȡ����---FileInputStream
 * 
 * Ŀ�ĵأ�������ȥ
 * d:\\b.txt ---д���� --- FileOutputStream
 * 
 * java.io.FileNotFoundException: a.txt (ϵͳ�Ҳ���ָ�����ļ���)
 * 
 * ��һ�θ�������û�г����κ����⣬Ϊʲô�أ�
 * 
 * ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ת��Ϊ���ַ����ݣ�Ȼ�����������̨��
 * ����һ���أ�ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڣ���û�����κε�ת����
 * �����Լ���ת����
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("C:\\a.txt");
		
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("D:\\b.txt");	
		
		int by =0;
		
		while((by= fis.read())!=-1) {
			fos.write(by);
		}
		
		//�ͷ���Դ(�ȹ�˭����)
		fos.close();
		fis.close();

	}

}
