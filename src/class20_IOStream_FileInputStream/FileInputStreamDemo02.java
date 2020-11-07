package class20_IOStream_FileInputStream;
/*
 * 一次读取一个字节数组：
 * int read(byte[] b)：一次读取一个字节数组
 * 返回值int是实际读取的个数，不是数组的长度
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo02 {
		public static void main(String[] args) throws IOException {
			//创建字节输入流对象
//			FileInputStream fis = new FileInputStream("fis02.txt");
			FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");			
			//读取数据
			//定义一个字节数组
			//第一次读取
//			byte[] bys = new byte[5];
//			int len = fis.read(bys);
////			System.out.println(len);
////			System.out.println(new String(bys));
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
//			
//			//第二次读取
//			len = fis.read(bys);
//			//读取\r\nwor
////			System.out.println(len);
////			System.out.println(new String(bys));
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
//			
//			//第三次读取
//			len = fis.read(bys);
//			//读取ld\r\nj
////			System.out.println(len);
//			//避免byte[] bys = new byte[5];的new byte[115]就会出问题
////			System.out.println(new String(bys));
//			//System.out.println的println去掉ln,不然那相当于认为多加了一个\n
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
//			
//			//第四次读取
//			len = fis.read(bys);
//			//读取ava\r\n
////			System.out.println(len);
////			System.out.println(new String(bys));
////			System.out.println(len);
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
////			1：hello\r\n
////			2：world\r\n
////			3：java\r\n
////			4：有第四行
//			//第四次读取时读取的是ava\r\n
//			
////			1：hello\r\n
////			2：world\r\n
////			3：java\r\n
////			空字符
//			//第四次读取时读取的是替代上一次的前三个(ld\r\n\j)
////			得到：ava
////				 j
//			
//			//循环改进
//			//但是我不知道结束条件
////			len = fis.read(bys);
////			System.out.println(len);//-1
////			len = fis.read(bys);
////			System.out.println(len);//-1
//			//如果读取的到实际长度是-1，就说明没有数据了
		
//			byte[] bys = new byte[115];
//			int len = 0;
//			while((len=fis.read(bys))!=-1) {
//				System.out.print(new String(bys,0,len));
//				//System.out.print(new String(bys));//千万要带上len
//			}
			
			//最终版代码：
			//数组的长度一般是1024或者1024的整数倍
			byte[] bys = new byte[1024];
			int len = 0;
			while((len=fis.read(bys))!=-1) {
				System.out.print(new String(bys,0,len));
				//System.out.print(new String(bys));//千万要带上len
			}
			
			
			//释放资源
			fis.close();
		}
}
