package class20_BufferedOutputStream_BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *�ֽ������ַ�ʽ�����ļ���
 *�����ֽ���һ�ζ�дһ���ֽ�
 *�����ֽ���һ�ζ�дһ���ֽ�����
 * ��Ч�ֽ���һ�ζ�дһ���ֽ�
 *��Ч�ֽ���һ�ζ�дһ���ֽ����� 
 */
public class CoyeMP4Demo {

	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();
		try {
			method1("C:\\������.avi","cpoy1.avi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end1 = System.currentTimeMillis();
		System.out.println("����ʱ��"+(end1-start1)+"����");
		
		long start2 = System.currentTimeMillis();
		try {
			method2("C:\\������.avi","cpoy2.avi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end2 = System.currentTimeMillis();
		System.out.println("����ʱ��"+(end2-start2)+"����");
		
		long start3 = System.currentTimeMillis();
		try {
			method3("C:\\������.avi","cpoy3.avi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end3 = System.currentTimeMillis();
		System.out.println("����ʱ��"+(end3-start3)+"����");
		
		long start4 = System.currentTimeMillis();
		try {
			method4("C:\\������.avi","cpoy4.avi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end4 = System.currentTimeMillis();
		System.out.println("����ʱ��"+(end4-start4)+"����");
		
	}
	 //�����ֽ���һ�ζ�дһ���ֽ�
	public static void method1(String srcString,String destString) throws IOException{
		//��װ����Դ
		FileInputStream fis = new FileInputStream(srcString);
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream(destString);
		
		int by = 0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
		
	}
	
	 //�����ֽ���һ�ζ�дһ���ֽ�����
	public static void method2(String srcString,String destString)throws IOException {
	//��װ����Դ
	FileInputStream fis = new FileInputStream(srcString);
	//��װĿ�ĵ�
	FileOutputStream fos = new FileOutputStream(destString);
	
	byte[] bys = new byte[1024];
	int len = 0;
	while((len=fis.read(bys))!=-1) {
		fos.write(bys,0,len);
	}
	fos.close();
	fis.close();
	}
	 // ��Ч�ֽ���һ�ζ�дһ���ֽ�
	public static void method3(String srcString,String destString) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
		
		int by = 0;
		while((by= bis.read())!=-1) {
			bos.write(by);
		}
		bos.close();
		bis.close();
	}
	 //��Ч�ֽ���һ�ζ�дһ���ֽ����� 
	public static void method4(String srcString,String destString) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len= bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
	}
}
