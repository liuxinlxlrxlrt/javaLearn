package class22_PrintStream;
/*
 * ���Բ����������͵�����
 * 		print()
 * 		println()
 * 2.�����Զ�ˢ�£�
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
 * 		������ʹ��println()�ķ����ſ���
 * 		���ʱ�򲻽����Զ�ˢ���ˣ���ʵ�������ݵĻ���
 * 
 * 		println()
 * 		��ʵ�ȼ���
 * 		bw.write()
 * 		bw.newLine()
 * 		bw.close()
 * 
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo02 {

	public static void main(String[] args) throws IOException {
		//������ӡ������
//		PrintWriter pw = new PrintWriter("pw2.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
		//writer()�Ǹ㲻���ģ���ô���ء�
		//���ǾͿ�����������
//		pw.print(true);
//		pw.print(100);
//		pw.print("hello");
		
		pw.println("hello");
		pw.println(true);
		pw.println(100);
		
//		pw.close();
		
	}

}
