package class20_IOStream_FileInputStream;
/*
 * 需求：把e:\\林青霞.jpg内容复制到当前项目目录下的mn.jpg中
 * 数据源：从哪里来
 * c:\\杨铭铭.jpg ---读取数据---FileInputStream
 * 
 * 目的地：到哪里去
 * mn.txt ---写数据 --- FileOutputStream
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTupianDemo {

	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("C:\\杨铭铭.jpg");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		//复制数据
		int by = 0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		//释放资源
		fos.close();
		fis.close();
		
		
	}

}
