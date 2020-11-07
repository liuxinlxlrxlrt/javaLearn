package class5;
/*
 * 定义第一个数组，定义完毕后，给数组元素赋值，赋值完毕后，在输出数组名称和元素
 * 定义第二个数组，定义完毕后，给数组元素赋值，赋值完毕后，在输出数组名称和元素
 * 定义第三个数组，把第一个数组的地址值赋给它(注意一致)，通过第三个数组的名称去把元素重复赋值。
 * 最后，再次输出第一个数组名称和元素
 */

public class ArrayDemo04 {
	public static void main(String[] args) {
		//定义第一个数组
		int[] arr1 = new int[3];
		arr1[0]=83;
		arr1[1]=33;
		arr1[2]=63;
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("--------");		
		
		//定义第二个数组
		int[] arr2 = new int[3];
		arr2[0]=22;
		arr2[1]=44;
		arr2[2]=88;
				
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("--------");	
		
		//定义第三个数组
		int[] arr3 = arr1;
		arr3[0]=100;
		arr3[1]=200;
				
		System.out.println(arr3);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
	}
}
