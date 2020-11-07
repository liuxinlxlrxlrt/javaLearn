package class12_String;
/*
 *统计大串中小串出现的次数
 *举例：在字符串” woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”
 *	 中java出现了5次
 *	 
 *	分析思路：
 *		前提是已经找得到了大串和小串
 *		A：定义一个统计变量，初始化值是0；
 *		B：先获取一次Java在这个大字符串中第一次出现的索引
 *			a：如果索引值是-1，就说明不存在，返回统计变量
 *			b：如果索引值不是-1，就说明存在，统计变量++
 *		（先判断一次，看java在这个这个大串中是否存在 ）
 *		C：把刚才的索引+小串的长度作为起始位置截取上一次大串为原始大串，
 *			返回一个新的字符串，并把改字符串重新赋值给大串
 *		D：回到B
 */

public class StringTest10 {

	public static void main(String[] args) {
		//定义大串
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		//定义小串
		String minString = "java";
		
		//写功能实现
		int count =getCount(maxString, minString);
		System.out.println("Java在大串中出现了："+count+"次");
}
/*
 * 两个明确：
 * 返回值类型：int
 * 参数类型：两个字符换
 */
public static int getCount(String maxString, String minString) {
	//定义一个统计变量，初始化值是0
	int count = 0;
	
	/*
	//先在大串中查找一次小串第一次出现的位置
	int index = maxString.indexOf(minString);
	
 	//a：如果索引值是-1，就说明不存在，返回统计变量
	while(index != -1) {
		count++;
		//把刚才的索引+小串的长度作为起始位置截取上一次大串为原始大串，
		 //返回一个新的字符串，并把改字符串重新赋值给大串
//		int startIndex = index + minString.length();
//		maxString = maxString.substring(startIndex);
		//改进版：
		maxString =maxString.substring(index + minString.length());
		//继续查
		index = maxString.indexOf(minString);
	}
	*/
	int index;
	while((index=maxString.indexOf(minString)) !=-1) {
		count++;
		maxString =maxString.substring(index + minString.length());
	}
 	//b：如果索引值不是-1，就说明存在，统计变量++
	return count;
 }
}