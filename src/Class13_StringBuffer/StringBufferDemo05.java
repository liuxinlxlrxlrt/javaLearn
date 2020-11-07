package Class13_StringBuffer;
/*
  * 反转功能	
 *  public StringBuffer reverse()
 */

public class StringBufferDemo05 {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//添加数据
		sb.append("我爱乔欣");
		System.out.println("sb:"+sb);//sb:我爱乔欣
		
		sb.reverse();
		System.out.println("sb:"+sb);//sb:欣乔爱我
	}
}
