package class19_IOStream_File;

import java.io.File;
import java.io.IOException;

/*
 * ��������
 *  public boolean createNewFile()�������ļ�
 *	public boolean mkdir()�������ļ��У���������������ļ��У��Ͳ�������
 *	public boolean mkdirs()�������ļ��У�������ļ��в�����,����㴴������,�����༶Ŀ¼
 * 
 * �����Ĳ�һ�������ӣ������ǰ೤
 * a.txt��β�Ĳ�һ�����ļ�
 * ע�⣺�㵽��Ҫ�����ļ������ļ��У����������������Ҫ�����ˡ�
 * 
 * 
 */

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		//��������ҪD��Ŀ¼�´���һ���ļ���demo
		File file = new File("D:\\demo");
		//�����ļ���
		System.out.println("mkdir:"+file.mkdir());
		
		////��������ҪD��Ŀ¼demo�´���һ���ļ�a.txt
		File file2 =new File("D:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//��������ҪD��testĿ¼�´���һ���ļ�b.txt
		//Exception in thread "main" java.io.IOException: ϵͳ�Ҳ���ָ����·����
		//ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���Ⱦͱ������
//		File file3 =new File("D:\\test\\a.txt");
//		System.out.println("createNewFile:"+file3.createNewFile());
		
		//������Ҫ��e��Ŀ¼test�´���aaaĿ¼
//		File file4 = new File("d:\\test\\aaa");
//		System.out.println("mkdir:"+file.mkdir());
		
		File file5 = new File("d:\\test");
		File file6 = new File("d:\\test\\aaa");
		System.out.println("mkdir:"+file5.mkdir());
		System.out.println("mkdir:"+file6.mkdir());
		
		//��ʵ�����и��򵥵ķ���
		File file7 = new File("d:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:"+file7.mkdirs());
		
		//������Ķ�����
		File file8 = new File("d:\\liuyi\\a.txt");
		//a.txt��β�Ĳ�һ�����ļ�
		System.out.println("mkdirs:"+file8.mkdirs());
		
	}

}
