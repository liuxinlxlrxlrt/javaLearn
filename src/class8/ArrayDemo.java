package class8;
/*
 *  非静态只能造对象用
 *  
 *  在同一文件夹下，类定义在两个文件中和定义在一个文件中其实是一样的
 */

public class ArrayDemo {

	public static void main(String[] args) {
		//定义数组
		int[] arr = {28,55,37,46,19};
		//需求，遍历数组
//		for(int x=0;x<arr.length;x++) {
//			if (x==arr.length-1) {
//				System.out.print(arr[x]);
//			}else {
//				System.out.print(arr[x]+", ");
//			}
//		}
		
		//如果我有多个数组要进行遍历，那么代码的重复度就很高
		//如何改进？用方法改进
		//调用
		//静态方法调用
//		printArray(arr);
		
		//非静态方法调用
//		ArrayDemo ad = new ArrayDemo();
//		ad.printArray(arr);
		
		//测试类的作用，创建其他类的对象，调用其他类的功能
		//而我们现在的操作是跟数组相关的，你应该把这些做错顶到数组操作类中
		//定义一个数组操作类
		//有了数组操作类之后的调用
		//把构造方法私有，外界就不能创建对象了
//		ArrayTool at = new ArrayTool();
//		at.printArray(arr);
//		System.out.println("\t");//" "
		//方法改进为静态后，就可以直接通过类名调用
		ArrayTool.printArray1(arr);
		
	}
//	public static void printArray(int[] arr) {
//		for(int x=0;x<arr.length;x++) {
//		if (x==arr.length-1) {
//			System.out.print(arr[x]);
//		}else {
//			System.out.print(arr[x]+", ");
//		}
//	   }
//	}
	
	//假设该方法不是静态的
//	public void printArray(int[] arr) {
//		for (int x = 0; x < arr.length; x++) {
//			if (x == arr.length - 1) {
//				System.out.print(arr[x]);
//			} else {
//				System.out.print(arr[x] + ", ");
//			}
//		}
//	}
}
