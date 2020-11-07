package class21_exercise;
/*
 * 需求：复制单极文件夹(d:\\demo里面的文件复制到d:\\test)
 * 
 * 数据源：D:\\demo
 * 目的地：D:\\test
 * 
 *分析：
 * 	A：封装目录
 * 	B：获取该目录下的所有文件的File数组
 * 	C：遍历File数组，得到每一个File对象
 * 	D：把该File进行复制
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
		 //A：封装目录
		File srcFolder = new File("D:\\demo");
		//封装目的地
		File destFolder = new File("D:\\test");
		//如果目的地文件夹不存在,就创建
		if(!destFolder.exists()) {
			destFolder.mkdir();
		}
		//B：获取该目录下的所有文件的File数组
		File[] fileArray = srcFolder.listFiles();
		
		//C：遍历File数组，得到每一个File对象
		for(File file:fileArray) {
//			System.out.println(file);
			//数据源D:\\test\\e.mp3
			//目的地D:\\test\\e.mp3
			String name = file.getName();//e.mp3
			File newFile = new File(destFolder,name);//D:\\test\\e.mp3
			
			copyFile(file,newFile);
		}
		//D：把该File进行复制
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
