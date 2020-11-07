package class19_IOStream_File_Get;
/*
 * �߼���ȡ����
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е����Ƶ�����
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File������
 * 
 * 
 */

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		//ָ��һ��Ŀ¼
		File file = new File("d:\\");
		
		//public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е����Ƶ�����
		String[] strString = file.list();
		for(String s : strString) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		//public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File������
		//listFiles()�����������ļ����ƣ��������þ���·������G ��·�����ļ���С
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			System.out.println(f.getName()+"-"+f.getAbsolutePath()+"-"+f.length()+"-"+f.lastModified());
		}
	}

}
