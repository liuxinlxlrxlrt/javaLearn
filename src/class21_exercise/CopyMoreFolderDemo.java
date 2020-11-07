package class21_exercise;
/*
 * 需求：复制多极文件夹
 * 
 * 数据源：D:\demo\demos
 * 目的地：D:\test
 * 
 * 分析：
 * 		A：封装数据源File
 * 		B：封装目的地File
 * 		C：判断File是文件夹还是文件
 * 			a：是文件夹
 * 				就在目的地目录下创建该文件就夹
 * 				获取File对象下的所有文件或者文夹File对象
 * 				遍历得到一个File对象
 * 				回到C
 * 			b:是文件就复制(字节流)
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMoreFolderDemo {

	public static void main(String[] args) throws IOException {
		//封装数据源File
		File srcFile = new File("D:\\demo\\demos");
		//封装目的地File
		File destFile = new File("D:\\test");
		
		//复制文件夹功能
		copyFolder(srcFile,destFile);
		
	}

	private static void copyFolder(File srcFile, File destFile) throws IOException {
		//判断File是文件夹还是文件
		if(srcFile.isDirectory()) {
			//文件夹
			File newFolder =new File(destFile,srcFile.getName());
			newFolder.mkdir();
			
			//获取该File对象下的所有文件或者文件夹File对象
			File[] fileArray = srcFile.listFiles();
			for(File file : fileArray) {
				copyFolder(file,newFolder);
			}
		}else {
			//文件
			File newFile = new File(destFile,srcFile.getName());
			copyFile(srcFile,newFile);
		}
		
	}

	private static void copyFile(File srcFile, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
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
