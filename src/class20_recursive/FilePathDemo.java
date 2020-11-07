package class20_recursive;
/*
 * ����:���ң�\JavaSEĿ¼�����е�java��β���ļ��ľ���·��������ڿ���̨
 * 
 * ������
 * 		A����װĿ¼
 * 		B����ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 * 		C��������File���飬�õ�һ��File����
 * 		D���жϸ�File�����Ƿ����ļ���
 * 			�ǣ��õ�B��
 *			�񣺲�����
 */

import java.io.File;

public class FilePathDemo {
		public static void main(String[] args) {
			//��װĿ¼
			File srcFolder = new File("D:\\21-Develop\\Java_code\\javaLearn\\src");
			
			//�ݹ鹦��ʵ��
			getAllJavaFilePath(srcFolder);
		}
		public static void getAllJavaFilePath(File srcFolder) {
			//��ø�Ŀ¼�����е��ļ������ļ��е�File����
			File[] fileArray = srcFolder.listFiles();
			
			//����File���飬��һ��File����
			for(File file : fileArray){
				//�жϸ�File�����Ƿ����ļ���
				if(file.isDirectory()) {
					getAllJavaFilePath(file);
				}else {
					if(file.getName().endsWith(".java")) {
						System.out.println(file.getAbsolutePath());
					}
				}
			}
		}
}
