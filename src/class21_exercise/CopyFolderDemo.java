package class21_exercise;
/*
 * ���󣺸��Ƶ����ļ���(d:\\demo������ļ����Ƶ�d:\\test)
 * 
 * ����Դ��D:\\demo
 * Ŀ�ĵأ�D:\\test
 * 
 *������
 * 	A����װĿ¼
 * 	B����ȡ��Ŀ¼�µ������ļ���File����
 * 	C������File���飬�õ�ÿһ��File����
 * 	D���Ѹ�File���и���
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		 //A����װĿ¼
		File srcFolder = new File("D:\\demo");
		//��װĿ�ĵ�
		File destFolder = new File("D:\\test");
		//���Ŀ�ĵ��ļ��в�����,�ʹ���
		if(!destFolder.exists()) {
			destFolder.mkdir();
		}
		//B����ȡ��Ŀ¼�µ������ļ���File����
		File[] fileArray = srcFolder.listFiles();
		
		//C������File���飬�õ�ÿһ��File����
		for(File file:fileArray) {
//			System.out.println(file);
			//����ԴD:\\test\\e.mp3
			//Ŀ�ĵ�D:\\test\\e.mp3
			String name = file.getName();//e.mp3
			File newFile = new File(destFolder,name);//D:\\test\\e.mp3
			
			copyFile(file,newFile);
		}
		//D���Ѹ�File���и���
	}

	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}
}
