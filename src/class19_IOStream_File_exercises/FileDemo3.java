package class19_IOStream_File_exercises;
/*
 * ���󣺰�D:\����\���������������Ƶ�����޸�Ϊ
 * 	00��_����.avi
 * 
 * ˼·
 * 		A����װD��Ŀ¼
 * 		B����ȡ��Ŀ¼�������ļ���File����
 * 		C������File���飬�õ�ÿһ��File����
 * 		D��ƴ��һ���µ����ƣ�Ȼ����������
 * ������
 * ��������_001_[������]_���֮��.avi
 * 		
 */

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//��װD��Ŀ¼
		File srcFolder = new File("D:\\����\\��������");
		
		//��ȡ��Ŀ¼�������ļ���File����
		File[] fileArray = srcFolder.listFiles();
		
		//����File���飬�õ�ÿһ��File����
		for(File file : fileArray) {
			//System.out.println(file);
			//D:\����\��������\��������_001_[������]_���֮��.avi
			//D:\����\��������\001_���֮��.avi
			String name = file.getName();//��������_001_[������]_���֮��.avi
			
			int index = name.indexOf("_");
			String numberString = name.substring(index+1, index + 4);
            System.out.println(numberString);
			
//			int startIndex = name.lastIndexOf('_');
//			int endIndex = name.lastIndexOf('.');
//			String nameString = name.substring(startIndex+1 , endIndex);
//			//System.out.println(nameString);
			
			int endIndex = name.lastIndexOf('_');
			String nameString = name.substring(endIndex);
			
			String newName = numberString.concat(nameString);//001_���֮��
            System.out.println(newName);
			File newFile = new File(srcFolder,newName);//D:\\����\\��������\\
		
			//����������
			file.renameTo(newFile);
		
		}
	}
}
