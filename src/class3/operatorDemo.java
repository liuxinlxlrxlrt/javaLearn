package class3;

/*
 *   �������
 *       ���ǶԳ����ͱ������в����ķ���
 *       
 *   ���ࣺ�������������ֵ��������Ƚ���������߼��������λ���������Ŀ�����
 *   
 *   �����������
 *          +,-,*,/,%,++,--
 *          
 *   ע�����
 *      A���������ֻ�ܵõ������������Ҫ�õ�С������������ݱ仯Ϊ������������
 *      B��/��ȡ���ǳ����������̣�%��ȡ���ǳ�������������
 * 
 */

public class operatorDemo {
     public static void main(String[] args) {
		 //�������
    	 int x =3;//��3��ֵ��int���͵ı���x
    	 int y =4;
    	 
    	 System.out.println(x+y);
    	 System.out.println(x-y);
    	 System.out.println(x*y);
    	 System.out.println(x/y); //�������ֻ�ܵõ�����
    	 
    	 //�Ҿ���õ�С������ô���أ�
    	 //ֻ��Ҫ�Ѳ����������������һ�����ݱ�Ϊ������
    	 
    	 System.out.println(x*1.0/y);
    	 
    	 //%��Ӧ��
    	 System.out.println(x%y);//�õ���������
     }
}
