package class19_IOStream_File_exercises;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * A:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出
 * B：获取的时候就已经满足条件(判断)了，然后输出即可
 * 
 * 要想实现这个效果，就必须学习一个接口：文件过滤器
 * 文件名称过滤器的实现思想及代码
 * public String[] list(FilenameFilter filter)：
 * public File[] listFiles(FilenameFilter filter)：
 * 
 */

public class FileDemo2 {
	public static void main(String[] args) {
		//封装D盘目录
		File file = new File("d:\\");
		
		//获取该目录下所有文件或者文件夹的String数组
		//public String[] list(FilenameFilter filter)
		String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//return false;
				//return true;
				//通过这个测试，我们就知道了，到底把这个文件或者文件夹的名称加不加到数组中,取决于这里的返回值是true还是false
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
