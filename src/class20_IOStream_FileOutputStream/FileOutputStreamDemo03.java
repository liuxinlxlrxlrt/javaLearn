package class20_IOStream_FileOutputStream;
/*
 * �ֽ���д���ݳ�������:
 * 	1.�����ֽ����������������Щ����?
 * 		A������ϵͳ����ȥ�����ļ�
 * 		B: ����fos����
 * 		C����fos����ָ������ļ�
 * 
 *	2.����д�ɹ���ΪʲôҪclose()?
 *		A�����������������������Ϳ��Ա�����������������
 *		B��֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
 *
 *  3.���ʵ�����ݵĻ���?
 *  	Ϊʲô����û�л����أ���Ϊ��ֻд���ֽ����ݣ�û��д�뻻�з��š�
 *  	���ʵ���أ�д�뻻�з��ż��ɡ�
 *  	�ղ����ǿ�������Щ�ı��ļ���ʱ���Եģ�ͨ��windows�Դ����Ǹ����У�Ϊʲô�أ�
 *  	windows:\r\n
 *  	linux:\n
 *  	Mac:\r
 *  	��һЩ�����ļ����߼����±����ǿ���ʶ�����⻻�з��ŵġ�
 *  
 *	4.���ʵ�����ݵ�׷��д��?
 *		�ù��췽�����ڶ���������true���������
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {

	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("fos3.txt");
		//
		FileOutputStream fos4 = new FileOutputStream("fos4.txt",true);		
		//д����
		for(int x=0;x<10;x++) {
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
		}
		
		for(int x=0;x<10;x++) {
			fos4.write(("hello"+x).getBytes());
			fos4.write("\r\n".getBytes());
		}
		
		//�ͷ���Դ
		fos.close();

	}

}
