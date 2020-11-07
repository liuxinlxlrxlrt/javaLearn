package class19_IOStream_File_Get;
/*
 * 基本获取功能
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度，字节数
 * public long lastModified():获取最后依次的修改时间,毫秒值
 * 
 * 
 * 
 * 
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) {
		//创建文件对象
		File file = new File("demo\\test.txt");
		
		System.out.println("getAbsolutePath:"+file.getAbsolutePath());
		System.out.println("getPath:"+file.getPath());
		System.out.println("getName:"+file.getName());
		System.out.println("length:"+file.length());
		System.out.println("lastModified:"+file.lastModified());
		
		//1529843368501
		Date d = new Date(1529843368501L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}

}
