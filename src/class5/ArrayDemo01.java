package class5;

/*
 * 数组:存储同一种数据类型多个元素的集合(容器)
 * 
 * 数组的定义格式
		A：数据类型[] 数组名;
		B：数据类型 数组名[];
	举例：
		A:int[] a;定义了一个int类型的数组a变量
		B:int a[];定义了一个int类型的a数组变量
		
	注意：效果可以认为是一样的，都是定义一个int类型，但是概念上有些小差别，推荐第一种
 *
 *	如何对数组初始化呢？
 *		A:数组初始化:为数组中的数组元素分配内存空间，并为每个数组元素赋值。
 *		B:两种方式：
 *				a:动态初始化: 只指定数组长度，由系统为数组分配初始值
 *				b:静态初始化: 指定每个数组元素的初始值，由系统决定数组长度。
 *
 *		动态初始化的格式：
 *			数据类型[] 数组名 = new 数据类型[数组长度];
 *			举例：
 *				int[] arr = new int[3];
 *
 *		如何获取数组中的元素呢?
 *			通过：
 *				数组名[索引];
 *				索引其实就是每个元素的编号，最大编号是数组的长度-1
 */

public class ArrayDemo01 {
	public static void main(String[] args) {
		//定义一个数组
		//int[] a;
		//System.out.println(a);
		
		int[] arr = new int[3];
		/*
		 * 左边：
		 * 		int：说明数组中的元素的数据类型是int类型
		 * 		[]:说明这是一个数组
		 * 		arr:是数组的名称
		 * 右边：
		 * 		new：为数组分配内存空间
		 * 		int:说明数组中的元素的数据类型是int类型
		 * 		3：数组长度，其实也是数组中元素的个数
		 */
		
		System.out.println(arr);//[I@15db9742 地址值(内存地址)
		//我要地址值没有意义啊，我要数据至，怎么办呢？
		//其实数组中的每个元素都是有编号的，并且是从0开始，最大编号是数组的长度-1
		//用数组名和编号的配合就可以获取数组中的制定编号的元素，这个编号的专业叫法：索引
		//通过数组名访问数据的格式是:数组名[]索引;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
