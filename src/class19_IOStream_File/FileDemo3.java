package class19_IOStream_File;
/*
 * 删除功能:public boolean delete();
 * 注意：
 *  A：如果你创建文件或者文件夹忘了写盘符路径，默认在项目路径下
 *  B：Java中的删除不走回收站
 *  C：要删除一个文件夹，该文件夹内不能包含文件夹或者文件
 */

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		//创建文件
		//File file = new File("d:\\a.txt");
		//创建文件
		//System.out.println("createNewFile:"+file.createNewFile());
		
		//我不小心写成这样样子了
		File file = new File("a.txt");
		System.out.println("createNewFile:"+file.createNewFile());
		//返回值：createNewFile:true
		//默认在项目路径下：D:\21-Develop\Java_code\javaLearn
		
		//继续玩几个
		File file2 =new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:"+file2.mkdirs());
		
		//删除功能：我要删除a.txt这个文件
		File file3 = new File("a.txt");
		System.out.println("delete:"+file3.delete());
				
		//删除功能：我要删除ccc这个文件夹
		File file4 =new File("aaa\\bbb\\ccc");
		System.out.println("delete:"+file4.delete());
		
//		//删除功能：我要删除aaa这个文件夹
//		File file5 =new File("aaa");
//		System.out.println("delete:"+file5.delete());
		
		//删除功能：我要删除aaa这个文件夹
		File file6 =new File("aaa\\bbb");
		File file7 =new File("aaa");
		System.out.println("delete:"+file6.delete());
		System.out.println("delete:"+file7.delete());
	}

}
