package class3;
/*
 *  �Ƚ��������
 *  ==,!=,>,>=,<,<=
 * 
 *  �ص㣺
 *      ������Ĳ����Ǽ򵥻��Ǹ��ӣ������boolean����
 *      
 *  ע�����
 *      "=="����д��"="
 */

public class OperatorDemo5 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 3;
		
		System.out.println(x == y);
		System.out.println(x == z);
		
		System.out.println((x+y) == (x+z));
		System.out.println("--------------------");
		
		System.out.println(x != y);
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println("--------------------");
		
		int a = 10;
		int b = 20;
		
		boolean  flag = (a == b);
		//boolean  flag = (a = b);//��������⣬���Ǽ��ݵ�����
		System.out.println(flag);
		
		int c = (a = b);//��b��ֵ��a����a������ 
		System.out.println(c);
	}
}
