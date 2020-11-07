package class8;
/*
 * 我想要的数组进行操作
 * 
 * 如何制作一个说明书呢？
 * 		A：写一个工具类
 * 		B：对这个类加入文档注释
 * 			怎么加呢？
 * 			加些什么东西呢？
 * 		C：用工具解析文档注释
 * 			javadoc工具
 *  	D：格式：
 *  		javadoc -d 目录 -author -version ArrayTool2.java
 *  		目录：就可以写一个文件夹的路径
 *  
 *  制作帮助文档出错：
 *  	找不到可以文档化的公共或收保护的类，告诉我们类的权限不够
 *  	（如果权限不够在类名前面加public就可以了）
 *  有警告：
 */

public class ArrayDemo2 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = {28,55,37,46,19};
		//遍历
		ArrayTool2.printArray1(arr);
		System.out.println();
		
		//获取最值
		int max = ArrayTool2.getMax(arr);
		System.out.println("max："+max);
//		System.out.println("\t");
		
		//获取最小值
		int min = ArrayTool2.getMin(arr);
		System.out.println("min："+min);
//		System.out.println();
		
		//获取索引
		int index = ArrayTool2.getIndex(arr, 37);
		System.out.println(index);
	}
}
