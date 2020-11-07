package class20_recursive;
/*
 * ���󣺵ݹ�ɾ�������ݵ�Ŀ¼
 * recursive(�ݹ�)
 * Ŀ¼��
 * 
 * ������
 * 		A����װĿ¼
 * 		B����ȡ��Ŀ¼�����е��ļ������ļ��е�File����
 * 		C��������File���飬�õ�ÿһ��File����
 * 		D���жϸ�File�����Ƿ����ļ���
 * 				�ǣ��ص�B
 * 				�񣺾�ɾ��
 * 		
 */

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		//��װĿ¼
		File srcFolder = new File("D:\\demo");
		
		//�ݹ�ʵ��
		deleteFolder(srcFolder);
	}
	private static void deleteFolder(File srcFolder) {
		//��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
		File[] fileArray = srcFolder.listFiles();
		//������File���飬�õ�ÿһ��File����
		for(File file : fileArray) {
			//�жϸ�File�����Ƿ����ļ���
			if(file.isDirectory()) {
				deleteFolder(file);
			}else {
				System.out.println(file.getName()+"---"+file.delete());
			}
		}
		System.out.println(srcFolder.getName()+"---"+srcFolder.delete());
	}

}
