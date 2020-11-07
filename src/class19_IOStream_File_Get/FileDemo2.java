package class19_IOStream_File_Get;
/*
 * 高级获取功能
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称的数组
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File的数组
 * 
 * 
 */

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		//指定一个目录
		File file = new File("d:\\");
		
		//public String[] list():获取指定目录下的所有文件或者文件夹的名称的数组
		String[] strString = file.list();
		for(String s : strString) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		//public File[] listFiles():获取指定目录下的所有文件或者文件夹的File的数组
		//listFiles()不仅可以拿文件名称，还可以拿绝对路径，相G 对路径，文件大小
		File[] fileArray = file.listFiles();
		for(File f : fileArray) {
			System.out.println(f.getName()+"-"+f.getAbsolutePath()+"-"+f.length()+"-"+f.lastModified());
		}
	}

}
