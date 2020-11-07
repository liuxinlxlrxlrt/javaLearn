package class20_IOStream_FileOutputStream;
/*
 * 加入异常处理的字节输出流操作
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {

	public static void main(String[] args){
		//分开做异常处理
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("fos5.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//写数据
//		try {
//			fos.write("java".getBytes());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//释放资源
//		try {
//			fos.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//一起做异常处理	
//		try {
//			FileOutputStream fos = new FileOutputStream("fos5.txt");
//			fos.write("java".getBytes());
//			fos.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//改进
		//为了在finally里面能够看到对象就必须定义到外面，为了访问不出问题，还必须给初始化值
		FileOutputStream fos =null;
		try {
//			fos = new FileOutputStream("z:\\fos5.txt");
			fos = new FileOutputStream("fos5.txt");
			fos.write("java".getBytes());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//为了保证close()一定能执行，就放到这里了
			try {
				//如果fos不是null，才需要close()
				if(fos != null) {
					fos.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
