package class20_IOStream_FileInputStream;
/*
 * һ�ζ�ȡһ���ֽ����飺
 * int read(byte[] b)��һ�ζ�ȡһ���ֽ�����
 * ����ֵint��ʵ�ʶ�ȡ�ĸ�������������ĳ���
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo02 {
		public static void main(String[] args) throws IOException {
			//�����ֽ�����������
//			FileInputStream fis = new FileInputStream("fis02.txt");
			FileInputStream fis = new FileInputStream("FileOutputStreamDemo.java");			
			//��ȡ����
			//����һ���ֽ�����
			//��һ�ζ�ȡ
//			byte[] bys = new byte[5];
//			int len = fis.read(bys);
////			System.out.println(len);
////			System.out.println(new String(bys));
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
//			
//			//�ڶ��ζ�ȡ
//			len = fis.read(bys);
//			//��ȡ\r\nwor
////			System.out.println(len);
////			System.out.println(new String(bys));
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
//			
//			//�����ζ�ȡ
//			len = fis.read(bys);
//			//��ȡld\r\nj
////			System.out.println(len);
//			//����byte[] bys = new byte[5];��new byte[115]�ͻ������
////			System.out.println(new String(bys));
//			//System.out.println��printlnȥ��ln,��Ȼ���൱����Ϊ�����һ��\n
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
//			
//			//���Ĵζ�ȡ
//			len = fis.read(bys);
//			//��ȡava\r\n
////			System.out.println(len);
////			System.out.println(new String(bys));
////			System.out.println(len);
////			System.out.println(new String(bys,0,len));
//			System.out.print(new String(bys,0,len));
////			1��hello\r\n
////			2��world\r\n
////			3��java\r\n
////			4���е�����
//			//���Ĵζ�ȡʱ��ȡ����ava\r\n
//			
////			1��hello\r\n
////			2��world\r\n
////			3��java\r\n
////			���ַ�
//			//���Ĵζ�ȡʱ��ȡ���������һ�ε�ǰ����(ld\r\n\j)
////			�õ���ava
////				 j
//			
//			//ѭ���Ľ�
//			//�����Ҳ�֪����������
////			len = fis.read(bys);
////			System.out.println(len);//-1
////			len = fis.read(bys);
////			System.out.println(len);//-1
//			//�����ȡ�ĵ�ʵ�ʳ�����-1����˵��û��������
		
//			byte[] bys = new byte[115];
//			int len = 0;
//			while((len=fis.read(bys))!=-1) {
//				System.out.print(new String(bys,0,len));
//				//System.out.print(new String(bys));//ǧ��Ҫ����len
//			}
			
			//���հ���룺
			//����ĳ���һ����1024����1024��������
			byte[] bys = new byte[1024];
			int len = 0;
			while((len=fis.read(bys))!=-1) {
				System.out.print(new String(bys,0,len));
				//System.out.print(new String(bys));//ǧ��Ҫ����len
			}
			
			
			//�ͷ���Դ
			fis.close();
		}
}
