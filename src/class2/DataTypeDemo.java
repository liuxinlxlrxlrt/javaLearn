package class2;
/*
 * �������ͣ�Java��һ��ǿ���͵����ԣ����ÿһ�����Ͷ���������ȷ����������
 * �������ͷ��ࣺ
 *   A:������������
 *   B:�����������ͣ��࣬�ӿڣ����飩
 *  �����������ͣ�4��8��
 *  A������   ռ���ֽ���
 *    byte    1
 *    short   2
 *    int     4
 *    long    8
 *  B:������
 *      float      4
 *      double     8
 *  C:�ַ�
 *     char     2
 *  D:������
 *      boolean    1
 *  
 *  ע�⣺
 *  ����Ĭ��������int����
 *  ������������double����
 *  
 *  �����ͺ�׺��L����l������ʹ��L��
 *  
 *    
 */

public class DataTypeDemo {
	public static void main(String[] args){
		 //��������   ������ = ��ʼ��ֵ��
		 
		 //����һ���ֽڱ���
		 byte b =10;
		 System.out.println(b);
		 
	     //����һ��������
		 short s =100;
		 System.out.println(s);
		 
		 //����һ�����ͱ���
		 int i = 1000;
		  System.out.println(i);
		  
		 //������int��Χ
		//int j = 1000000000000;
		 long j = 1000000000000L;
		 System.out.println(j);
		 
		 //����һ��������������
		 float f =12.345f;
		 System.out.println(f);
		 
		 double d =12.345;
		 System.out.println(d);
		 
		 //�����ַ�����
		 char ch = 'a';
		System.out.println(ch);
		 
		 //���岼������
		 boolean flag = true;
		 System.out.println(flag);
		 }
}
