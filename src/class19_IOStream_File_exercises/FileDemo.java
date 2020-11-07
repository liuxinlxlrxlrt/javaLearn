package class19_IOStream_File_exercises;

import java.io.File;

/*
 * 判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 
 * 分析：
 * 		A：封装D盘目录
 * 		B：获取该目录下所有文件或者文件夹的File数组
 * 		C：遍历File数组，得到每一个File对象，然后判断
 * 		D：是否是文件
 * 			是：继续判断是以.jpg结尾
 * 				是：就输出该文件名称
 * 				否：不搭理他
 * 			否：不搭理他
 * 
 */

public class FileDemo {

	public static void main(String[] args) {
		//封装D盘目录
		File file = new File("d:\\");
		
		//获取该目录下所有文件或者文件夹的File数组
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			if(f.isFile()) {
				//继续判断是以.jpg结尾
				//字符串的一个方法endsWith()判断以什么结尾
				if(f.getName().endsWith(".jpg")) {
					System.out.println(f.getName());
				}
			}
		}
	}

}
