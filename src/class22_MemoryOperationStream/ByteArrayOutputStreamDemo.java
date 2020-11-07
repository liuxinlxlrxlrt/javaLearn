package class22_MemoryOperationStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * �ڴ�����������ڴ�����ʱ������Ϣ�ģ�������������ݾʹ��ڴ�����ʧ
 * 
 * �ֽ����ݣ�
 * 		ByteArrayInputStream
 *		ByteArrayOutputStream
 * �ַ����飺
 * 		CharArrayReader
 *		CharArrayWrite
 * �ַ�����
 * 		StringReader
 *		StringWriter
 * 
 */
public class ByteArrayOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			//д����
			//ByteArrayOutputStream�����ݱ�д��һ�� byte ���顣���������������ݵĲ���д����Զ���������ʹ�� toByteArray() �� toString() ��ȡ����
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			for(int x=0;x<10;x++) {
				baos.write(("hello"+x).getBytes());
			}
			
			//�ͷ���Դ
			//ͭ�Ĳ鿴ԭ�룬����ʲô��û�������Ը�������Ҫclose
			//baos.close();
			
			//public byte[] toByteArray()
			//��baos��byte������ʹ�� toByteArray()��ȡ����
			byte[] bys = baos.toByteArray();
			
			//��ȡ����
			//ByteArrayInputStream(byte[] buf)
			ByteArrayInputStream bais = new ByteArrayInputStream(bys);
			
			int by =0;
			while((by = bais.read())!=-1) {
				System.out.print((char)by);
			}
//			bais.close();
			
		}
}
