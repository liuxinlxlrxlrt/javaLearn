package class2;

/*
 * 看结果写结果
 *    字符串数据和其他数据做+，结果是字符串类型
 *    这里的+不是加法运算，而是字符串连接符
 *    从左向右：字符串+其他，都为字符串
 *             其他+字符串，先运算其他，再合并字符串
 * 
 * 
 */
public class DataTypeDemo9 {
       public static void main(String[] args) {
		
    	   System.out.println("hello"+'a'+1);//结果是helloa1
   		   System.out.println('a'+1+"hello");//结果是98hello
   		   
   		   System.out.println("5+5="+5+5);//结果是5+5=55
   		   System.out.println(5+5+"=5+5");//结果是10=5+5
	}
}
