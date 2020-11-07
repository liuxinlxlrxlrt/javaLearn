package Class13_StringBuffer;
/*
 * 添加功能
 *public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
 *public StringBuffer insert(int offset,String str):在 指定位置把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
 */

public class StringBufferDemo02 {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// public StringBuffer append(String str)
		// 可以把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
//			StringBuffer sb2 = sb.append("hello");
//			
//			System.out.println("sb:"+sb);//hello
//			System.out.println("sb2:"+sb2);//hello
//			System.out.println(sb==sb2);//true
//			
		// 一步一步的添加数据
		sb.append("hello");
//			sb.append(true);
//			sb.append(12);
//			sb.append(34.56);

		// 链接编程
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);
		// 结果是sb:hellohellotrue1234.56

		// public StringBuffer insert(int offset,String str):
		// 在指定位置把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
		// 添加不会被替换掉
		sb.insert(5, "world");
		System.out.println("sb:" + sb);
		// 结果是sb:helloworldhellotrue1234.56
	}
}
