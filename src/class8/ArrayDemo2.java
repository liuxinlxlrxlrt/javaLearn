package class8;
/*
 * ����Ҫ��������в���
 * 
 * �������һ��˵�����أ�
 * 		A��дһ��������
 * 		B�������������ĵ�ע��
 * 			��ô���أ�
 * 			��Щʲô�����أ�
 * 		C���ù��߽����ĵ�ע��
 * 			javadoc����
 *  	D����ʽ��
 *  		javadoc -d Ŀ¼ -author -version ArrayTool2.java
 *  		Ŀ¼���Ϳ���дһ���ļ��е�·��
 *  
 *  ���������ĵ�����
 *  	�Ҳ��������ĵ����Ĺ������ձ������࣬�����������Ȩ�޲���
 *  	�����Ȩ�޲���������ǰ���public�Ϳ����ˣ�
 *  �о��棺
 */

public class ArrayDemo2 {
	public static void main(String[] args) {
		//��������
		int[] arr = {28,55,37,46,19};
		//����
		ArrayTool2.printArray1(arr);
		System.out.println();
		
		//��ȡ��ֵ
		int max = ArrayTool2.getMax(arr);
		System.out.println("max��"+max);
//		System.out.println("\t");
		
		//��ȡ��Сֵ
		int min = ArrayTool2.getMin(arr);
		System.out.println("min��"+min);
//		System.out.println();
		
		//��ȡ����
		int index = ArrayTool2.getIndex(arr, 37);
		System.out.println(index);
	}
}
