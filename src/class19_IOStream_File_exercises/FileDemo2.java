package class19_IOStream_File_exercises;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �ж�D��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�����������������
 * B����ȡ��ʱ����Ѿ���������(�ж�)�ˣ�Ȼ���������
 * 
 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ�������
 * �ļ����ƹ�������ʵ��˼�뼰����
 * public String[] list(FilenameFilter filter)��
 * public File[] listFiles(FilenameFilter filter)��
 * 
 */

public class FileDemo2 {
	public static void main(String[] args) {
		//��װD��Ŀ¼
		File file = new File("d:\\");
		
		//��ȡ��Ŀ¼�������ļ������ļ��е�String����
		//public String[] list(FilenameFilter filter)
		String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//return false;
				//return true;
				//ͨ��������ԣ����Ǿ�֪���ˣ����װ�����ļ������ļ��е����ƼӲ��ӵ�������,ȡ��������ķ���ֵ��true����false
				//System.out.println(dir+"---"+name);
//				File file = new File(dir,name);
//				//System.out.println(file);
//				boolean flag = file.isFile();
//				boolean flag2 = name.endsWith(".jpg");
//				return flag && flag2;
				return new File(dir,name).isFile() && name.endsWith(".jpg");
				

					
			}
		});
		
		for(String s : strArray) {
			System.out.println(s);
		}
	}


}
