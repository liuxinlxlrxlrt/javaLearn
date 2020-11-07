package class21_exercise;
/*
 * ���󣺸��Ƶ����ļ�����ָ���ļ����޸��ļ�����
* ָ�����ļ��ǣ�.jav�ļ�
* ָ���ĺ�׺����.jad
* ָ����Ŀ¼�ǣ�jad
* 
* ����Դ��D:\test\java\\A.java
* Ŀ�ĵأ�D:\test\jad\\A.jad
* 
* ������
 *������
 * 	A����װĿ¼
 * 	B����ȡ��Ŀ¼�µ�java�ļ���File����
 * 	C������File���飬�õ�ÿһ��File����
 * 	D���Ѹ�File���и���
 * 	E����Ŀ�ĵ�Ŀ¼�¸���
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class CopyFolderFileDemo {

	public static void main(String[] args) throws IOException {
		//��װĿ¼,����Դ�ļ��ж���
		File srcFolder = new File("D:\\test\\java");
		//��װĿ�ĵ�,����Ŀ�ĵ��ļ��ж���
		File destFolder = new File("D:\\test\\jad");
		//���Ŀ�ĵ�Ŀ¼�����ھʹ���
		if(!destFolder.exists()) {
			destFolder.mkdir();
		}
		
		//��ȡ��Ŀ¼�µ�java�ļ���File����
		//��ȡָ��Ŀ¼�µ������ļ������ļ��е�File������
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&& name.endsWith(".java");
			}
		});
		//����File���飬�õ�ÿһ��File����
		for(File file:fileArray) {
			//System.out.println(file);
			//����Դ��D:\test\java\\A.java
			//Ŀ�ĵأ�D:\test\jad\\A.jad
			String name = file.getName();
			File newFile = new File(destFolder,name);
			
			copyFile(file,newFile);
		}
		//��Ŀ�ĵ�Ŀ¼�¸���
		//��ȡָ��Ŀ¼�µ������ļ������ļ��е����Ƶ�����
		File[] destFileArray  = destFolder.listFiles();
		for(File destFile : destFileArray) {
			//System.out.println(destFile);
			//D:\\test\\jad\\DateTypeDemo1.java
			//D:\\test\\jad\\DateTypeDemo1.jad
			String name =destFile.getName();//DateTypeDemo1.java
			String newName = name.replace(".java", ".jad");
			//����һ����File�����һ�����ļ�/Ŀ¼�õ�File����:D:\\test\\jad\\DateTypeDemo1.java
			File newFile = new File(destFolder,newName);
			destFile.renameTo(newFile);
			
		}
	}
	//�����ļ�
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		bis.close();
	}

}
