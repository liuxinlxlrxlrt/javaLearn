package class3;

/*�����⣺
 *   ���Լ�ʵ������������������
 *   
 *   ע�⣺
 *     �Ժ󽲿εĹ����У���û����ȷָ�����ݵ����ͣ�Ĭ��int����
 */

public class OperatorDemo9Test {

	public static void main(String[] args) {
		  int a = 10;
		  int b = 20;
		  
		  System.out.println("a:"+a+",b:"+b);
		  
		  //��ʽһ��ʹ�õ���������(�������õ�)
		  /*
		  int c =a;
		  a = b;
		  b = c;
		  System.out.println("a:"+a+",b:"+b);
		  System.out.println("---------------------");
		  */
		  
		  //��ʽ������λ���ʵ��
		  //���:a,b,a
		  //�ұߣ�a^b
		  /*
		  a = a ^ b;
		  b = a ^ b;//b= a^b^b =a;a =a^b ,b=a
		  a = a ^ b;//a= a^b^a =b;a =a^b ,a=b
		  System.out.println("a:"+a+",b:"+b);
		  */
		  
		  //��ʽ�����ñ�����ӵ�����
		  /*
		  a = a+b;// a = 30
		  b = a-b;// b = 10
		  a = a-b;// a = 20
		  System.out.println("a:"+a+",b:"+b);
		  */
		  
		  //��ʽ�ģ�һ�仰�㶨
		  b = (a+b)-(a=b);//b=30-20 =10, a = 20
		  System.out.println("a:"+a+",b:"+b);
	}
}
