package class20_recursive;
/*
 * 需求:请大家：\JavaSE目录下所有的java结尾的文件的绝对路径给输出在控制台
 * 
 * 分析：
 * 		A：封装目录
 * 		B：获取该目录下所有的文件或者文件夹的File数组
 * 		C：遍历该File数组，得到一个File对象
 * 		D：判断该File对象是否是文件夹
 * 			是：得到B：
 *			否：不理他
 */

import java.io.File;

public class FilePathDemo {
		public static void main(String[] args) {
			//封装目录
			File srcFolder = new File("D:\\21-Develop\\Java_code\\javaLearn\\src");
			
			//递归功能实现
			getAllJavaFilePath(srcFolder);
		}
		public static void getAllJavaFilePath(File srcFolder) {
			//获得该目录下所有的文件或者文件夹的File数组
			File[] fileArray = srcFolder.listFiles();
			
			//遍历File数组，得一个File对象
			for(File file : fileArray){
				//判断该File对象是否是文件夹
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
