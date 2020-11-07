package class21_exercise;
/*
 *  * �����ı��ļ���
 * 
 * ������
 * 	�������ݣ��������֪���ü��±��򿪲��ܹ������������ַ������������ֽ���
 * 	ͨ����ԭ������֪������Ӧ�ò����ֽ���������һ��
 * 	���ֽ�����4�з�ʽ�������������Ŀ������4�з�ʽ���Ƽ�ʹ�õ�5��
 * 
 * ����Դ��
 *  c:\\������.jpg--FileInputStream--BufferedInputStream
 *  
 *Ŀ�ĵأ�
 *	d:\\������.jpg--FileOutputStream--BufferedOutputStream
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTupianDemo {

	public static void main(String[] args) throws IOException {
		//ʹ���ַ�����Ϊ·��
//		String srcString =  "c:\\������.jpg";
//		String destString = "d:\\�����.jpg";
		//ʹ��File������Ϊ����
		File srcFile = new File("c:\\������.jpg");
		File destFile1 = new File("d:\\�����.jpg");
		File destFile2 = new File("d:\\��ԲԲ.jpg");
		File destFile3 = new File("d:\\��ʫʫ.jpg");
		File destFile4 = new File("d:\\��¹��.jpg");
		File destFile5 = new File("d:\\��С��.jpg");
//		method1(srcFile,destFile1);
//		method2(srcFile,destFile2);
//		method3(srcFile,destFile3);
		method4(srcFile,destFile4);

	}
	//�ֽڻ�����дһ����д�ֽ�����
	private static void method4(File srcFile, File destFile4) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile4));
		
		byte[] bys = new byte[1024];
		int len =0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		bis.close();
	}
	//�ֽڻ�����дһ����д�ֽ�
	private static void method3(File srcFile, File destFile3) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile3));
		
		int by= 0;
		while((by = bis.read())!=-1) {
			bos.write(by);
		}
		
		bos.close();
		bis.close();
	}
	//һ�ζ�дһ���ֽ�����
	private static void method2(File srcFile, File destFile2) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile2);
		
		byte[] bys = new byte[1024];
		int len =0;
		while((len = fis.read(bys))!=-1) {
			fos.write(bys, 0, len);
		}
		
		fos.close();
		fis.close();
	}
	//һ�ζ�дһ���ֽ�
	private static void method1(File srcFile, File destFile1) throws IOException {
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile1);
		
		int by= 0;
		while((by = fis.read())!=-1) {
			fos.write(by);
		}
		
		fos.close();
		fis.close();
		
	}

}
