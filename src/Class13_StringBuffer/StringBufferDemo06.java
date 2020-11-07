package Class13_StringBuffer;
/*
 * 截取功能
 *public String substring(int start):
 *public String substring(int start,int end):
 *
 *截取功能和前面几个功能的不同
 *返回值类型是String类型，本身没有发生改变
 */

public class StringBufferDemo06 {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//添加数据
		sb.append("hello").append("world").append("java");
		System.out.println("sb:"+sb);
		
		//public String substring(int start):
		String s = sb.substring(5);
		System.out.println("s:"+s);
		System.out.println("sb:"+sb);
		
		//public String substring(int start,int end):
		String ss = sb.substring(5, 10);
		System.out.println("ss:"+ss);
		System.out.println("sb:"+sb);
	}
}
