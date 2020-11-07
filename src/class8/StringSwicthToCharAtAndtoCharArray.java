package class8;

import java.util.Scanner;

//字符串转换成字符数组
public class StringSwicthToCharAtAndtoCharArray {
    public static void main(String[] args) {
		//1、charAt()功能类似于数组，可以把字符串看作是char类型的数组，
    	//它是把字符串拆分获取其中的某个字符；返回指定位置的字符。
    	//charAt(i)，i为int类型，i从0开始。
//			Scanner input = new Scanner(System.in);
//			String str01 = input.next();
//    		char[] ss = str01.toCharArray();
//    		for(int i=0; i<ss.length;i++) {
//    			System.out.println(ss[i]);
//    		}
    		String str = "hello123";
			//返回位置为1的字符
			//char c = str01.charAt(index);
			//字符串转换成字符数组
			char c = str.charAt(1);
			//类似于String [] str01 = {'h','e','l','l','o','1','2','3'};
			System.out.println(c);
			//output:c = e;
			
			//字符串转换成字符数组
			String str02 = "hello123";
			//将字符串转换成字符数组
			char[] ch1 = str02.toCharArray();
			for(int x=0;x<ch1.length;x++) {
				if(x == ch1.length-1) {
					System.out.print(ch1[x]+"}");
				}else if(x==0){
					System.out.print("{"+ch1[0]+",");
				}
				else{
					System.out.print(ch1[x]+",");
				}
			}
	}
}
