package Class13_StringBuffer;
/*
 * 删除功能
 *public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
 *public StringBuffer delete(int start,int end):删除从指定位置开始位置到结束位置的内容，并返回本身
 */

public class StringBufferDemo03 {
	public static void main(String[] args) {
		//创建对象
		StringBuffer sb = new StringBuffer();
		
		//添加功能
		sb.append("hello").append("world").append("java");
		
		//public StringBuffer deleteCharAt(int index):
		//public StringBuffer delete(int start,int end):删除从指定位置开始位置到结束位置的内容，并返回本身删除指定位置的字符，并返回本身
		//需求是我要删除e这个字符，怎么办？
		sb.deleteCharAt(1);
		////sb:hlloworldjava
		System.out.println("sb:"+sb);
		
		//需求：我奥删除第一个l这个字符，怎么办？
		sb.deleteCharAt(1);
		//sb:hloworldjava
		System.out.println("sb:"+sb);
		
		//public StringBuffer delete(int start,int end):
		//删除从指定位置开始位置到结束位置的内容，并返回本身
		//需求，我要删除world这个字符串
		sb.delete(3, 8);//包左不包右
		System.out.println("sb:"+sb);
		
		//需求：我要删除所有数据
		sb.delete(0, sb.length());
		System.out.println("sb:"+sb);
	}
}
