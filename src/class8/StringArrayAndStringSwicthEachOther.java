package class8;
//���ַ������ַ�������֮��Ļ���
public class StringArrayAndStringSwicthEachOther {
	public static void main(String[] args) {
		//���ַ���ת��Ϊ�ַ�������
		//����һ
		String content = "abcdefghijklmn";
		String array[] = new String[content.length()];
		for(int x=0;x<array.length;x++) {
			//���ַ���ת���ɵ������ַ�
			array[x] = String.valueOf(content.charAt(x));
			if(x == array.length-1) {
				System.out.print(array[x]+"}");
			}else if(x==0){
				System.out.print("{"+array[0]+",");
			}
			else{
				System.out.print(array[x]+",");
			}
		}
		System.out.println();
		//������
		String str2 = "abcdefg";
		char[] strarr2 = str2.toCharArray();
		for(int x=0;x<strarr2.length;x++) {
			if(x == strarr2.length-1) {
				System.out.print(strarr2[x]+"}");
			}else if(x==0){
				System.out.print("{"+strarr2[0]+",");
			}
			else{
				System.out.print(strarr2[x]+",");
			}
		}
		System.out.println();
		//������
		String str3 = "abc,def,ghi";
		//ע��ָ�������Ҫת��
		String[] strArr = str3.split(",");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);

		}
	}
}
