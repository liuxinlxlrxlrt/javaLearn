package class3;

/*
 * ��ϰ��
 *     ��ȡ���������е����ֵ
 *     ��ȡ���������е����ֵ
 *     �Ƚ����������Ƿ���ͬ
 */

public class OperatorDemo11Test {

	public static void main(String[] args) {
         int x = 100;
         int y = 200;
         
         int max = (x>y? x:y);
         System.out.println("max:"+max);
         
         //��ȡ���������е����ֵ
         int a = 10;
         int b = 20;
         int c = 20;
         
         //������
         //A:�ȱȽ�a,b�����ֵ
         //B����a,b�����ֵ�ٺ�c���бȽ�
         
         int temp = (a>b)?a:b;
         System.out.println(temp);
         int max1 = (temp>c?temp:c);
         System.out.println("max1:"+max1);
         
         //һ���㶨
         int max2 = (a >b )?((a > c)? a: c):((b > c)?b:c);
         System.out.println("max2:"+max2);
         //�����������Ƽ�
         int max3 = a >b ?a > c? a: c:b > c?b:c;
         System.out.println("max3:"+max3);
         
         //�Ƚ����������Ƿ���ͬ
         int m = 100;
         int n = 200;
         
         //boolean flag = (m == n)?true:false;
         boolean flag = (m == n);
         System.out.println(flag);
	}
}
