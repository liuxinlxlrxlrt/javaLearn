package class3;

/*
 * ++,--运算符的使用；
 *    单独使用：
 *        放在操作数的前面和后面效果一样(这样的用法是我们比较常见的)
 *    参与运算使用：
 *        放在操作数的前面，先自增或者自减，然后再参与运算
 *        放在操作数的后面，先参与运算，再自增或者自减。
 *    
 * 作用：就是对变量进行自增或者自减。
 */

public class operatorDemo2 {
      public static void main(String[] args) {
		 //定义两个变量
    	  int x = 3;
    	  int y = 4;
    	  int m = 3;
    	  int n =4;
    	  
    	 //字符串的拼接
    	  System.out.println("x:"+x);
    	  System.out.println("y:"+y);
    	  System.out.println("x:"+x+",y:"+y);
    	 
    	  //单独使用
    	  x++;
    	  y--;
    	  //System.out.println(x);
    	  System.out.println("x:"+x+",y:"+y);
    	  
    	  ++m;
    	  --n;
          System.out.println("m:"+m+",n:"+n);    	  
    	  
    	  //意外类型，常量是不可以这样做的
    	  //System.out.println(10++);
          
          System.out.println("----------------------");
          //参与运算使用
          int a = 3;
          int b = 4;
          
          int c = a++;//c =3;a=4 先运算后自增
          int d = b--;//d =4; c=3 先运算后自减
          
          int e = ++a;//e=5;a =5 先自增后运算
          int f = --b;// f =2;b=2  先自减后运算
          
          System.out.println("a:"+a);//5
          System.out.println("b:"+b);//2
          System.out.println("c:"+c);//3
          System.out.println("d:"+d);//4
          System.out.println("e:"+e);//5
          System.out.println("f:"+f);//2
	}
}




