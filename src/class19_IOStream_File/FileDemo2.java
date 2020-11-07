package class19_IOStream_File;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能
 *  public boolean createNewFile()：创建文件
 *	public boolean mkdir()：创建文件夹，如果存在这样的文件夹，就不创建了
 *	public boolean mkdirs()：创建文件夹，如果父文件夹不存在,会帮你创建出来,创建多级目录
 * 
 * 骑白马的不一定是王子，可能是班长
 * a.txt结尾的不一定是文件
 * 注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。
 * 
 * 
 */

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		//需求：我在要D盘目录下创建一个文件夹demo
		File file = new File("D:\\demo");
		//创建文件夹
		System.out.println("mkdir:"+file.mkdir());
		
		////需求：我在要D盘目录demo下创建一个文件a.txt
		File file2 =new File("D:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//需求：我在要D盘test目录下创建一个文件b.txt
		//Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
		//注意：要想在某个目录下创建内容，该目录首先就必须存在
//		File file3 =new File("D:\\test\\a.txt");
//		System.out.println("createNewFile:"+file3.createNewFile());
		
		//需求：我要在e盘目录test下创建aaa目录
//		File file4 = new File("d:\\test\\aaa");
//		System.out.println("mkdir:"+file.mkdir());
		
		File file5 = new File("d:\\test");
		File file6 = new File("d:\\test\\aaa");
		System.out.println("mkdir:"+file5.mkdir());
		System.out.println("mkdir:"+file6.mkdir());
		
		//其实我们有更简单的方法
		File file7 = new File("d:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:"+file7.mkdirs());
		
		//看下面的东西：
		File file8 = new File("d:\\liuyi\\a.txt");
		//a.txt结尾的不一定是文件
		System.out.println("mkdirs:"+file8.mkdirs());
		
	}

}
