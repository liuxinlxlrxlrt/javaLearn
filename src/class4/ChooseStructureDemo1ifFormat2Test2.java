package class4;

/*
 * ����if���ĵڶ��ָ�ʽ�ղ��������Ԫ�����������ɵ�Ч����
 * ���ԣ�������Ϊ���ǿ������һ���Ĳ�����
 * ���ǣ����Ǿ�һ������û����
 * 
 * ����
 *    ��Ԫ�����ʵ�ֵģ��������ò���if���ʵ�֣���֮������
 *    
 *    ʲôʱ��if���ʵ�ֲ�������Ԫ�Ľ��أ�
 *    ��if �����ƵĲ�����һ���������ʱ��Ͳ���
 *    Ϊʲô�أ���Ϊ��Ԫ�������һ��������������������Ͼ�Ӧ����һ�������������һ�����
 */

public class ChooseStructureDemo1ifFormat2Test2 {
	   public static void main(String[] args) {
		 //��ȡ�����������ֵ
			int a = 10;
		     int b = 20;
		     //��if���ʵ��
		     int max1;
		     
		     if(a > b) {
					max1 = a;
				}else {
					max1 = b;
				}
		     System.out.println("max1:"+max1);
		     
		     //����Ԫ�Ľ�
		     int max2 = (a >b)?a:b;
		     System.out.println("max2:"+max2);
		     System.out.println("----------------------------");
		     
		     //�ж�һ����������������ż��
		     int x = 100;
		     if(x%2 == 0) {
		    	 System.out.println(x+"�������ż��");
		     }else {
		    	 System.out.println(x+"�����������");
		     }
		     
		     //����Ԫ�Ľ�
		     //���ָĽ��Ǵ����
		     //String s =(x%2 == 0)?System.out.println(x+"�������ż��"); : System.out.println(x+"�����������");;
	}
}
