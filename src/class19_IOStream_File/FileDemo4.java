package class19_IOStream_File;
/*
 * 重命名功能：public boolean renameTo(File dest)
 * 		如果路径名相同就是改名
 * 		如果路径名不同就是改名并且剪切
 * 
 * 路径以盘符开始：绝对路径 c:\\a.txt
 * 路径不以盘符开始：相对路径  a.txt
 * 
 */

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
//		//创建一个文件对象
//		File file = new File("林青霞.jpg");
//		System.out.println("createNewFile:"+file.createNewFile());
//		//需求：我要修改这个文件的名称为“东方不败.jpg”
//		File newFile = new File("东方不败.jpg");
//		System.out.println("renameTo:"+file.renameTo(newFile));
		
		File file2 = new File("东方不败.jpg");
		File newFile2 = new File("d:\\东方不败.jpg");
		System.out.println("renameTo:"+file2.renameTo(newFile2));
	}

}
