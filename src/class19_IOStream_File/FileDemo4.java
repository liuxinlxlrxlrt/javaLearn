package class19_IOStream_File;
/*
 * ���������ܣ�public boolean renameTo(File dest)
 * 		���·������ͬ���Ǹ���
 * 		���·������ͬ���Ǹ������Ҽ���
 * 
 * ·�����̷���ʼ������·�� c:\\a.txt
 * ·�������̷���ʼ�����·��  a.txt
 * 
 */

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
//		//����һ���ļ�����
//		File file = new File("����ϼ.jpg");
//		System.out.println("createNewFile:"+file.createNewFile());
//		//������Ҫ�޸�����ļ�������Ϊ����������.jpg��
//		File newFile = new File("��������.jpg");
//		System.out.println("renameTo:"+file.renameTo(newFile));
		
		File file2 = new File("��������.jpg");
		File newFile2 = new File("d:\\��������.jpg");
		System.out.println("renameTo:"+file2.renameTo(newFile2));
	}

}
