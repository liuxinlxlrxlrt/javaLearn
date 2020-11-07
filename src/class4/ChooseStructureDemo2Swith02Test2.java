package class4;
/*
 * 模拟单项选择题。
 * 
 * 分析：
 * 		A：出一个选择题，然哦户供你选择
 * 		B：键盘录入选择的数据
 * 		C：根据选择来给出你选择的结论
 * 
 */

import java.util.Scanner;

public class ChooseStructureDemo2Swith02Test2 {
	public static void main(String[] args) {
		//出一个选择题，然后供你选择
		//由于我们现在没办法键盘录入得到一个'A','B'
	    //这样的东西，我们就用65,66这样的值代替
        //将来我们获取到这样的值以后，强制转换为字符类型		
		System.out.println("下面的几个人你最爱谁？");
		System.out.println("65 高圆圆");	
		System.out.println("66 刘亦菲");	
		System.out.println("67 张昕妤");	
		System.out.println("68 钟鹿纯");	
		
		//键盘录入选择的数据
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的选择：");
		int choiceNumber = sc.nextInt();
		
		//强制转换为字符类型
		char choice = (char) choiceNumber;
		
		switch(choice) {
				case 'A':
					System.out.println("恭喜你，选择正确");
					break;
				case 'B':
					System.out.println("不好意思，你的选择有误");
					break;
				case 'C':
					System.out.println("不好意思，你的选择有误");
					break;
				case 'D':
					System.out.println("不好意思，你的选择有误");
					break;
				default:
					System.out.println("没有改选项");
					break;
		}
	}
}
