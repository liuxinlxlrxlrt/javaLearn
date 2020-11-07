package class21_encode;
/*
 * public String(byte[] bytes, String charsetName)��ͨ���ƶ����ַ��������ֽ�����
 * public byte[] getBytes(Charset charset):ʹ���ƶ����ַ����ϰ��ַ�������Ϊ�ֽ�����
 * 
 * ���룺�ѿ��ö��ı�ɿ�������
 * String -- byte[]
 *		 
 * ���룺�ѿ������ı�ɿ��ö���
 * byte[] -- String
 * 
 * ���
 * 		�ַ�    ��ֵ
 * 
 * ��������սƬ(���籨���ڵ籨)
 * Ҫ����һ�����֣�
 * 		�����������ϵط���
 *		���Ͷ� ����--��ֵ--������--����ȥ
 *		���նˣ�����--������--ʮ����--��ֵ--�ַ�--��
 * 		
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "���";
		
		//String -- byte[]
		byte[] bys = s.getBytes();//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");//[-60, -29, -70, -61]
		//byte[] bys =s.getBytes("UTF-8");//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));
		
		//byte[] -- String
		//String ss = new String(bys);//���
		//String ss = new String(bys,"GBK");//���
		String ss = new String(bys,"UTF-8");//???
		System.out.println(ss);
	}

}
