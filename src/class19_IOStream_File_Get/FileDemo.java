package class19_IOStream_File_Get;
/*
 * ������ȡ����
 * public String getAbsolutePath():��ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ���ȣ��ֽ���
 * public long lastModified():��ȡ������ε��޸�ʱ��,����ֵ
 * 
 * 
 * 
 * 
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		//�����ļ�����
		File file = new File("demo\\test.txt");
		
		System.out.println("getAbsolutePath:"+file.getAbsolutePath());
		System.out.println("getPath:"+file.getPath());
		System.out.println("getName:"+file.getName());
		System.out.println("length:"+file.length());
		System.out.println("lastModified:"+file.lastModified());
		
		//1529843368501
		Date d = new Date(1529843368501L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}

}
