package class3;
/*
 * ������
 * 1. short s=1, s = s+1; 2. short s=1, s+=1;
 * ��������������û�����⣬����У�����������
 *     ��һ�������⣺short s���� �������㣬����ת��int���ͣ�Ȼ�������㣬Ȼ��ת��short���ͣ�������ʧ���� 
 *     
 *     Ϊʲô�ڶ���û�������أ�
 *        ��չ�ĸ�ֵ�������ʵ������һ��ǿ������ת��
 *        
 *        s +=1;
 *        ���ȼ��� s = s +1;
 *        ���ǵȼ��� s =(s����������)(s+1)
 */

public class OperatorDemo4Test {
	public static void main(String[] args) {
		//short s=1;
		//s = s+1;
		//System.out.println(s);
		//short s���� �������㣬����ת��int���ͣ�Ȼ�������㣬Ȼ��ת��short���ͣ�������ʧ����
     
		short s=1;
		s+=1; //������ s = s+1;
		System.out.println(s);
	}
}
