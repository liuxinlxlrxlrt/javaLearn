package class8;

import java.util.Scanner;

//�ַ���ת�����ַ�����
public class StringSwicthToCharAtAndtoCharArray {
    public static void main(String[] args) {
		//1��charAt()�������������飬���԰��ַ���������char���͵����飬
    	//���ǰ��ַ�����ֻ�ȡ���е�ĳ���ַ�������ָ��λ�õ��ַ���
    	//charAt(i)��iΪint���ͣ�i��0��ʼ��
//			Scanner input = new Scanner(System.in);
//			String str01 = input.next();
//    		char[] ss = str01.toCharArray();
//    		for(int i=0; i<ss.length;i++) {
//    			System.out.println(ss[i]);
//    		}
    		String str = "hello123";
			//����λ��Ϊ1���ַ�
			//char c = str01.charAt(index);
			//�ַ���ת�����ַ�����
			char c = str.charAt(1);
			//������String [] str01 = {'h','e','l','l','o','1','2','3'};
			System.out.println(c);
			//output:c = e;
			
			//�ַ���ת�����ַ�����
			String str02 = "hello123";
			//���ַ���ת�����ַ�����
			char[] ch1 = str02.toCharArray();
			for(int x=0;x<ch1.length;x++) {
				if(x == ch1.length-1) {
					System.out.print(ch1[x]+"}");
				}else if(x==0){
					System.out.print("{"+ch1[0]+",");
				}
				else{
					System.out.print(ch1[x]+",");
				}
			}
	}
}
