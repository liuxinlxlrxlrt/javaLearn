package class21_exercise;
/*
 * 需求：复制单极文件夹中指定文件并修改文件名称
* 指定的文件是：.jav文件
* 指定的后缀名：.jad
* 指定的目录是：jad
* 
* 数据源：D:\test\java\\A.java
* 目的地：D:\test\jad\\A.jad
* 
* 分析：
 *分析：
 * 	A：封装目录
 * 	B：获取该目录下的java文件的File数组
 * 	C：遍历File数组，得到每一个File对象
 * 	D：把该File进行复制
 * 	E：在目的地目录下改名
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class CopyFolderFileDemo {

	public static void main(String[] args) throws IOException {
		//封装目录,创建源文件夹对象
		File srcFolder = new File("D:\\test\\java");
		//封装目的地,创建目的地文件夹对象
		File destFolder = new File("D:\\test\\jad");
		//如果目的地目录不存在就创建
		if(!destFolder.exists()) {
			destFolder.mkdir();
		}
		
		//获取该目录下的java文件的File数组
		//获取指定目录下的所有文件或者文件夹的File的数组
		File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&& name.endsWith(".java");
			}
		});
		//遍历File数组，得到每一个File对象
		for(File file:fileArray) {
			//System.out.println(file);
			//数据源：D:\test\java\\A.java
			//目的地：D:\test\jad\\A.jad
			String name = file.getName();
			File newFile = new File(destFolder,name);
			
			copyFile(file,newFile);
		}
		//在目的地目录下改名
		//获取指定目录下的所有文件或者文件夹的名称的数组
		File[] destFileArray  = destFolder.listFiles();
		for(File destFile : destFileArray) {
			//System.out.println(destFile);
			//D:\\test\\jad\\DateTypeDemo1.java
			//D:\\test\\jad\\DateTypeDemo1.jad
			String name =destFile.getName();//DateTypeDemo1.java
			String newName = name.replace(".java", ".jad");
			//根据一个父File对象和一个子文件/目录得到File对象:D:\\test\\jad\\DateTypeDemo1.java
			File newFile = new File(destFolder,newName);
			destFile.renameTo(newFile);
			
		}
	}
	//复制文件
	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		
		bos.close();
		bis.close();
	}

}
