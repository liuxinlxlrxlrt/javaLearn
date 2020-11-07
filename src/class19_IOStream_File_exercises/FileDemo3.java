package class19_IOStream_File_exercises;
/*
 * 需求：把D:\评书\三国演义下面的视频名称修改为
 * 	00？_介绍.avi
 * 
 * 思路
 * 		A：封装D盘目录
 * 		B：获取该目录下所有文件的File数组
 * 		C：遍历File数组，得到每一个File对象
 * 		D：拼接一个新的名称，然后重名即可
 * 举例：
 * 三国演义_001_[评述网]_赤壁之乱.avi
 * 		
 */

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
		//封装D盘目录
		File srcFolder = new File("D:\\评书\\三国演义");
		
		//获取该目录下所有文件的File数组
		File[] fileArray = srcFolder.listFiles();
		
		//遍历File数组，得到每一个File对象
		for(File file : fileArray) {
			//System.out.println(file);
			//D:\评书\三国演义\三国演义_001_[评述网]_赤壁之乱.avi
			//D:\评书\三国演义\001_赤壁之乱.avi
			String name = file.getName();//三国演义_001_[评述网]_赤壁之乱.avi
			
			int index = name.indexOf("_");
			String numberString = name.substring(index+1, index + 4);
            System.out.println(numberString);
			
//			int startIndex = name.lastIndexOf('_');
//			int endIndex = name.lastIndexOf('.');
//			String nameString = name.substring(startIndex+1 , endIndex);
//			//System.out.println(nameString);
			
			int endIndex = name.lastIndexOf('_');
			String nameString = name.substring(endIndex);
			
			String newName = numberString.concat(nameString);//001_赤壁之乱
            System.out.println(newName);
			File newFile = new File(srcFolder,newName);//D:\\评书\\三国演义\\
		
			//重命名即可
			file.renameTo(newFile);
		
		}
	}
}
