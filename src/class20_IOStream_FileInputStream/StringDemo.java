package class20_IOStream_FileInputStream;

import java.util.Arrays;

/*
 * ����������ʶ��ʲôʱ��ð������ֽ�ת��Ϊһ�������أ�
 * �ڼ�����У����ĵĴ洢�������ֽڣ�
 * 		��һ���ֽڿ϶��Ǹ���
 * 		�ڶ����ֽڳ������Ǹ���������������������ûӰ��
 * 
 * ���������ƴ��һ�����������ǵ����ֽڣ�����ƴ
 * 		
 */

public class StringDemo {

	public static void main(String[] args) {
		//String s = "abcde";
		//����ǣ�[97, 98, 99, 100, 101]
		
		String s = "�Ұ�������";
		//[-50, -46, -80, -82, -60, -29, -61, -64, -60, -56]
		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));

	}

}
