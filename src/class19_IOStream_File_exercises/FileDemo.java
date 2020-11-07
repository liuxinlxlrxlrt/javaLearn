package class19_IOStream_File_exercises;

import java.io.File;

/*
 * �ж�D��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * 
 * ������
 * 		A����װD��Ŀ¼
 * 		B����ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		D���Ƿ����ļ�
 * 			�ǣ������ж�����.jpg��β
 * 				�ǣ���������ļ�����
 * 				�񣺲�������
 * 			�񣺲�������
 * 
 */

public class FileDemo {

	public static void main(String[] args) {
		//��װD��Ŀ¼
		File file = new File("d:\\");
		
		//��ȡ��Ŀ¼�������ļ������ļ��е�File����
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			if(f.isFile()) {
				//�����ж�����.jpg��β
				//�ַ�����һ������endsWith()�ж���ʲô��β
				if(f.getName().endsWith(".jpg")) {
					System.out.println(f.getName());
				}
			}
		}
	}

}
