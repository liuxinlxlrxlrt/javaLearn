package class24_SingletonDesignParttern;

/*
 * ����ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ��α�֤�����ڴ���ֻ��һ�������أ�
 * 		A���ѹ��췽��˽��
 * 		B���ڳ�Աλ���Լ���һ������
 * 		C��ͨ��һ�������ķ����ṩ����
 */

public class StudentDemo {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student();
//		System.out.println(s1 == s2);//false
//		//��Ϊÿһ������������������ģ����Ե���ģʽ����Ҫ�Ľ����������ǲ��ñ��������
//		//ֻҪ�������������Ͳ������ǵ���ģʽ
		
		//ͨ��������εõ������أ�
		
//		Student.s = null;
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);//true
		
		System.out.println(s1);//null
		System.out.println(s2);//null
		//s1=s2=null�����壬���������ֱ���޸�s��ֵ
	}

}
