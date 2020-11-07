package class3;

public class OperatorDemo2Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		   
		 a = b++;//a = 10; b=11;
		 c = --a;// c= 9; a= 9;
		 b = ++a;// b= 10; a =10;
		 a = c--;//  c= 8, a =9;
		   
		 System.out.println("a:"+a);//5
	     System.out.println("b:"+b);//2
	     System.out.println("c:"+c);//3
	      System.out.println("----------------------------");
		
	       int x =4;
	       int y =(x++)+(++x)+(x*10);
	       //4+6+60=70
	       //x=5,6,60
	       System.out.println("y:"+y);
	}
}
