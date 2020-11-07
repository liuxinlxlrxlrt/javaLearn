package class19_IOStream_File;

import java.io.File;

/*
 * ����Ҫ��ʵ��IO�Ĳ������ͱ���֪��Ӳ�����ļ��ı�����ʽ
 * ��Java���ṩ��һ����File������ʹ��
 * 
 * File���ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 *���췽����
 *	File(String pathname)������һ��·���õ�File����
 *	File(String parent, String child)������һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 *	File(File parent, String child)������һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 * 
 * 
 */

public class FileDemo {
	public static void main(String[] args) {
		//File(String pathname)������һ��·���õ�File����
		//��D:\\xx\\1.txt��װ��һ��File����
		File file = new File("D:\\xx\\2.txt");
		
		//File(String parent, String child)������һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		File file2 = new File("D:\\xx","2.txt");
		
		//File(File parent, String child)������һ����File�����һ�����ļ�/Ŀ¼�õ�File����
		File file3 = new File("D:\\xx");
		File file4 = new File(file3,"2.txt");
		
		//����������ʽ��ʵЧ��һ��
	}
}
