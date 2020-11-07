package class22_IO_DataStream;
/*
 * ���Զ�д�����������͵�����
 * ������������DataInputStream
 * 		DataInputStream(InputStream in) 
 * �����������DataOutputStream
 * 		DataOutputStream(OutputStream out) 
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		//д
		//write();
		
		//��
		read();
	}

	private static void read() throws IOException {
		//DataInputStream(InputStream in) 
		//������������������
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		char c = dis.readChar();
		boolean bl = dis.readBoolean();
		
		//�ͷ���Դ
		dis.close();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
		
		
		
	}

	private static void write() throws IOException {
		//DataOutputStream(OutputStream out) 
		//�������������
		 DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		 
		 //д����
		 dos.writeByte(10);
		 dos.writeShort(100);
		 dos.writeInt(1000);
		 dos.writeLong(10000);
		 dos.writeFloat(12.34F);
		 dos.writeDouble(12.56);
		 dos.writeChar('a');
		 dos.writeBoolean(true);
		 
		 //�ͷ���Դ
		 dos.close();
	}
}
package class20_IOStream_FileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 IO���ķ��ࣺ 
 	������������
		������	��������
		�����	д������
	������������
		�ֽ���
			�ֽ�������     ��ȡ����	 InputStream
			�ֽ������	д������	  OutputStream
		�ַ���
			�ַ�������     ��ȡ����	  Reader
			�ַ������	д������	  Writer
	ע�⣺һ��������̽��IO����ʱ�����û����ȷ˵�������ַ�����˵��Ĭ������°������������ֵġ�
 * ������Ҫ��һ���ı��ļ�������һ�仰��hello,io.
 * 
 * ������
 * 		A�������������ǲ����ַ��������������أ��ַ������ֽ���֮��ų��֣����ԣ������Ƚ����ֽ�����β���
 * 		B:�����������ļ���дһ�仰����������Ҫ�����ֽ������
 * 
 * ͨ������ķ���������֪��Ҫʹ�ã�OutputStream
 * ����ͨ���鿴API�����Ƿ��ָ���������һ�������࣬����ʵ������
 * ���ԣ�����Ҫ��һ����������ࡣ
 * ������Ҫ�ҵ�������ʲô���ֵ��أ����ʱ�򣬺ܼ򵥣������ǲ���Ҫ���ļ���дһ�仰 
 * �ļ�����һ�����ʣ�File
 * Ȼ���õ��ֽ�������������������ǣ�FileOutputStream
 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
 * 		xxxOutputStream
 * 		xxxInputStream
 * 		xxxReader
 * 		xxxWriter
 *�鿴FileOutputStream�Ĺ��췽����
 *		FileOutputStream(File file)
		FileOutputStream(String name)
		
     �ֽ�������������裺
		A�������ֽ����������
		B��д����
		C���ͷ���Դ
 */

public class FileOutputStreamDemo {
		public static void main(String[] args) throws IOException {
			//�����ֽ������
//			��һ�ַ�ʽ��FileOutputStream(File file)
//			File file = new File("file.txt");
//			FileOutputStream fos = new FileOutputStream(file);
			//�ڶ��ַ�����FileOutputStream(String name)
			FileOutputStream fos = new FileOutputStream("D:\\demo\\fos2.txt");
			/*
			 * �����ֽ�������������˼������飺
			 * A������ϵͳ����ȥ�����ļ�
			 * B:����fos����
			 * C����fos����ָ������ļ�
			 */
			
			//д����
			//write()����ֱ��дһ���ַ�����������ַ���ͨ��getBytes()����ת���ֽ�����
			fos.write("helloWorld.io".getBytes());
			
			//�ͷ���Դ
			fos.close();
			/*
			 * Ϊ��һ��close()�أ�
			 * A�����������������������Ϳ��Ա�����������������
			 * B��֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
			 */
			//fos.write("hello".getBytes());
			//java.io.IOException: Stream Closed
			
		}
}
ѧ����Ϣ
����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
�����,99,98,97
��ԲԲ,89,88,87
��¹��,79,78,77
������,69,68,67
����,59,58,57
