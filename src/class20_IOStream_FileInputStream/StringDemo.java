package class20_IOStream_FileInputStream;

import java.util.Arrays;

/*
 * 计算机是如何识别什么时候该把两个字节转换为一个中文呢？
 * 在计算机中，中文的存储分两个字节：
 * 		第一个字节肯定是负数
 * 		第二个字节常见的是负数、可能有正数、但是没影响
 * 
 * 如果负数就拼接一个，正数就是单个字节，不用拼
 * 		
 */

public class StringDemo {

	public static void main(String[] args) {
		//String s = "abcde";
		//结果是：[97, 98, 99, 100, 101]
		
		String s = "我爱你美娜";
		//[-50, -46, -80, -82, -60, -29, -61, -64, -60, -56]
		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));

	}

}
