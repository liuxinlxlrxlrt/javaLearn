package class8;

public class StringSwicthToIntEachOther {
	public static void main(String[] args) {
		//������ int ת�����ִ� String A. ��3�ַ���:
//		String s = String.valueOf(i);
//		String s = Integer.toString(i);
//		String s = "" + i;
		
		//����һ
		int i1 = 123;
		String str1 = String.valueOf(i1);
		System.out.println(str1);
		
		//������
		int i2 = 456;
		String str2 =""+i2;
		System.out.println(str2);
		
		//������
		int i3 = 789;
		String str3 = Integer.toString(i3);
		System.out.println(str3);
		
		//���ִ� String ת�������� int��3������:
//		int i = Integer.parseInt([String]); 
//		i = Integer.parseInt([String],[int radix]);
//		int i = Integer.valueOf(my_str).intValue();

		

		//����һ
		String s1 = "123";
		int i01 = Integer.parseInt(s1);
		System.out.println(i01);
		//������

		//������
		String s3 = "789";
		int i03 = Integer.valueOf(str3);
		System.out.println(i03);
	}
}
