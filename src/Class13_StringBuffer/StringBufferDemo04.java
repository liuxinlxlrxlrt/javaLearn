package Class13_StringBuffer;
/*
 * 替换功能
 *public StringBuffer replace(int start,int end,String str):从start到end用str替换，包左不包右
 */
public class StringBufferDemo04 {
	public static void main(String[] args) {
		//创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		//添加数据
		sb.append("hello").append("world").append("java");
		System.out.println("sb:"+sb);
		
		//public StringBuffer replace(int start,int end,String str):
		//从start到end用str替换，包左不包右
		//需求：我要把world替换成节日快乐
		sb.replace(5, 10, "节日快乐");
		System.out.println("sb:"+sb);
	}
}
