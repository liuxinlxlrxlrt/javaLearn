package class22_MemoryOperationStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：用于处理临时处理信息的，程序结束，数据就从内存中消失
 * 
 * 字节数据：
 * 		ByteArrayInputStream
 *		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 *		CharArrayWrite
 * 字符串：
 * 		StringReader
 *		StringWriter
 * 
 */
public class ByteArrayOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			//写数据
			//ByteArrayOutputStream：数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString() 获取数据
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			for(int x=0;x<10;x++) {
				baos.write(("hello"+x).getBytes());
			}
			
			//释放资源
			//铜鼓查看原码，这里什么都没做，所以根本不需要close
			//baos.close();
			
			//public byte[] toByteArray()
			//将baos的byte的数组使用 toByteArray()获取数据
			byte[] bys = baos.toByteArray();
			
			//读取数据
			//ByteArrayInputStream(byte[] buf)
			ByteArrayInputStream bais = new ByteArrayInputStream(bys);
			
			int by =0;
			while((by = bais.read())!=-1) {
				System.out.print((char)by);
			}
//			bais.close();
			
		}
}
