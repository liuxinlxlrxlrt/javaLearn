package class2;
/*
 * 数据类型：Java是一种强类型的语言，针对每一种类型都定义了明确的数据类型
 * 数据类型分类：
 *   A:基本数据类型
 *   B:引用数据类型（类，接口，数组）
 *  基本数据类型：4类8种
 *  A：整数   占用字节数
 *    byte    1
 *    short   2
 *    int     4
 *    long    8
 *  B:浮点数
 *      float      4
 *      double     8
 *  C:字符
 *     char     2
 *  D:布尔型
 *      boolean    1
 *  
 *  注意：
 *  整数默认类型是int类型
 *  浮点数类型是double类型
 *  
 *  长整型后缀用L或者l，建议使用L。
 *  
 *    
 */

public class DataTypeDemo {
	public static void main(String[] args){
		 //数据类型   变量名 = 初始化值；
		 
		 //定义一个字节变量
		 byte b =10;
		 System.out.println(b);
		 
	     //定义一个短整型
		 short s =100;
		 System.out.println(s);
		 
		 //定义一个整型变量
		 int i = 1000;
		  System.out.println(i);
		  
		 //超过了int范围
		//int j = 1000000000000;
		 long j = 1000000000000L;
		 System.out.println(j);
		 
		 //定义一个浮点数据类型
		 float f =12.345f;
		 System.out.println(f);
		 
		 double d =12.345;
		 System.out.println(d);
		 
		 //定义字符变量
		 char ch = 'a';
		System.out.println(ch);
		 
		 //定义布尔变量
		 boolean flag = true;
		 System.out.println(flag);
		 }
}
