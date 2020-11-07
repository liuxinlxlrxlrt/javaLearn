package class19_IOStream_File;
/*
 * ɾ������:public boolean delete();
 * ע�⣺
 *  A������㴴���ļ������ļ�������д�̷�·����Ĭ������Ŀ·����
 *  B��Java�е�ɾ�����߻���վ
 *  C��Ҫɾ��һ���ļ��У����ļ����ڲ��ܰ����ļ��л����ļ�
 */

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		//�����ļ�
		//File file = new File("d:\\a.txt");
		//�����ļ�
		//System.out.println("createNewFile:"+file.createNewFile());
		
		//�Ҳ�С��д������������
		File file = new File("a.txt");
		System.out.println("createNewFile:"+file.createNewFile());
		//����ֵ��createNewFile:true
		//Ĭ������Ŀ·���£�D:\21-Develop\Java_code\javaLearn
		
		//�����漸��
		File file2 =new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:"+file2.mkdirs());
		
		//ɾ�����ܣ���Ҫɾ��a.txt����ļ�
		File file3 = new File("a.txt");
		System.out.println("delete:"+file3.delete());
				
		//ɾ�����ܣ���Ҫɾ��ccc����ļ���
		File file4 =new File("aaa\\bbb\\ccc");
		System.out.println("delete:"+file4.delete());
		
//		//ɾ�����ܣ���Ҫɾ��aaa����ļ���
//		File file5 =new File("aaa");
//		System.out.println("delete:"+file5.delete());
		
		//ɾ�����ܣ���Ҫɾ��aaa����ļ���
		File file6 =new File("aaa\\bbb");
		File file7 =new File("aaa");
		System.out.println("delete:"+file6.delete());
		System.out.println("delete:"+file7.delete());
	}

}
