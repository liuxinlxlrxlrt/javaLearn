package class14_RegularExpression;
/*
 * 我有如下一个字符串:”91 27 46 38 50”
 * 请写代码实现最终输出结果是：”27 38 46 50 91”
 * 
 * 分析：
 * 		A：定义一个字符串
 * 		B：把字符串进行分割，得到一个字符串数组
 * 		D：把字符串数组变换成Int数组
 * 		C：对Int数组排序
 * 		E：把排序后的数组再组装成字符串	
 */

import java.util.Arrays;

public class regularExpressionTest {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "91 27 46 38 50";
		
		//把字符串进行分割，得到一个字符串数组
		String[] strArray = s.split(" ");
		
		//把字符串数组变换成Int数组
		int [] arr =new int[strArray.length];
		
		for(int x=0;x<arr.length;x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}
		
		//对Int数组排序
		Arrays.sort(arr);
		
		//把排序后的数组再组装成字符串
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<arr.length;x++) {
			sb.append(arr[x]).append(" ");
		}
		//转换为字符串
		String result = sb.toString().trim();
		
		//输出字符串
		System.out.println("result："+result);
	}
}
