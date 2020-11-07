package class20_IOStream_FileInputStream;
/*
 * 需求：把e:\\01.01_计算机基础(计算机概述).avi复制到当前项目目录下的01.01_copy计算机基础(计算机概述).avi中
 * 
 * 数据源：从哪里来
 * c:\\01.01_计算机基础(计算机概述).avi ---读取数据---FileInputStream
 * 
 * 目的地：到哪里去
 * 01.01_copy计算机基础(计算机概述).avi ---写数据 --- FileOutputStream
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp4Demo {

	public static void main(String[] args) throws IOException {
		//封装数据源
		FileInputStream fis = new FileInputStream("c:\\01.01_计算机基础(计算机概述).avi");
		//封装目的地
		FileOutputStream fos = new FileOutputStream("01.01_copy计算机基础(计算机概述).avi");
		
		//复制视频
		int by =0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}

}
