package class21_OutputStreamWriter_InputStreamReader;
/*
 * OutputStreamWriter(OutputStream out)������Ĭ�ϱ�����ֽ���ת��Ϊ�ַ���
 * OutputStreamWriter(OutputStream out, String charsetName)������ָ��������ֽ���ת��Ϊ�ַ���
 * ���ֽ���ת��Ϊ�ַ���
 *  �ַ���=�ֽ���+�����
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		//��������
//		OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("osw.txt"));//Ĭ��GBK
		OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");//ָ��GBK		
//		OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");//ָ��GBK		
		
		//д����
		osw.write("�й�");
		
		//�ͷ���Դ
		osw.close();

	}

}
