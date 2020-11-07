package class8;

public class CharAarrySwicthToString {

	public static void main(String[] args) {
		//将字符数组转换成字符串
		
		//方法1：直接在构造String时转换
		//字符数组
		char[] ch1 = {'a','b','c','d','e','1'};
		String str1  = new String(ch1);
		System.out.println(str1);
		
		//方法2：调用String类的方法转换
		String str21  = String.valueOf(ch1);
		System.out.println(str21);
	}

}
