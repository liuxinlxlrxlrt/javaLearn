package class21_encode;
/*
 * public String(byte[] bytes, String charsetName)：通过制定的字符集解码字节数组
 * public byte[] getBytes(Charset charset):使用制定的字符集合把字符串编码为字节数组
 * 
 * 编码：把看得懂的变成看不懂的
 * String -- byte[]
 *		 
 * 解码：把看不懂的变成看得懂的
 * byte[] -- String
 * 
 * 码表：
 * 		字符    数值
 * 
 * 举例：谍战片(发电报，节电报)
 * 要发送一段文字：
 * 		今天晚上在老地方见
 *		发送端 ：今--数值--二进制--发出去
 *		接收端：接收--二进制--十进制--数值--字符--今
 * 		
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好";
		
		//String -- byte[]
		byte[] bys = s.getBytes();//[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");//[-60, -29, -70, -61]
		//byte[] bys =s.getBytes("UTF-8");//[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));
		
		//byte[] -- String
		//String ss = new String(bys);//你好
		//String ss = new String(bys,"GBK");//你好
		String ss = new String(bys,"UTF-8");//???
		System.out.println(ss);
	}

}
