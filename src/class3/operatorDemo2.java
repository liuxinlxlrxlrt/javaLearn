package class3;

/*
 * ++,--�������ʹ�ã�
 *    ����ʹ�ã�
 *        ���ڲ�������ǰ��ͺ���Ч��һ��(�������÷������ǱȽϳ�����)
 *    ��������ʹ�ã�
 *        ���ڲ�������ǰ�棬�����������Լ���Ȼ���ٲ�������
 *        ���ڲ������ĺ��棬�Ȳ������㣬�����������Լ���
 *    
 * ���ã����ǶԱ����������������Լ���
 */

public class operatorDemo2 {
      public static void main(String[] args) {
		 //������������
    	  int x = 3;
    	  int y = 4;
    	  int m = 3;
    	  int n =4;
    	  
    	 //�ַ�����ƴ��
    	  System.out.println("x:"+x);
    	  System.out.println("y:"+y);
    	  System.out.println("x:"+x+",y:"+y);
    	 
    	  //����ʹ��
    	  x++;
    	  y--;
    	  //System.out.println(x);
    	  System.out.println("x:"+x+",y:"+y);
    	  
    	  ++m;
    	  --n;
          System.out.println("m:"+m+",n:"+n);    	  
    	  
    	  //�������ͣ������ǲ�������������
    	  //System.out.println(10++);
          
          System.out.println("----------------------");
          //��������ʹ��
          int a = 3;
          int b = 4;
          
          int c = a++;//c =3;a=4 �����������
          int d = b--;//d =4; c=3 ��������Լ�
          
          int e = ++a;//e=5;a =5 ������������
          int f = --b;// f =2;b=2  ���Լ�������
          
          System.out.println("a:"+a);//5
          System.out.println("b:"+b);//2
          System.out.println("c:"+c);//3
          System.out.println("d:"+d);//4
          System.out.println("e:"+e);//5
          System.out.println("f:"+f);//2
	}
}




