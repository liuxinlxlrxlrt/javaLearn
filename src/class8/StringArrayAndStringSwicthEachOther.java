package class8;
//将字符串与字符串数组之间的互换
public class StringArrayAndStringSwicthEachOther {
	public static void main(String[] args) {
		//将字符串转换为字符串数组
		//方法一
		String content = "abcdefghijklmn";
		String array[] = new String[content.length()];
		for(int x=0;x<array.length;x++) {
			//将字符串转换成单个的字符
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
		//方法二
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
		//方法三
		String str3 = "abc,def,ghi";
		//注意分隔符是需要转译
		String[] strArr = str3.split(",");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);

		}
	}
}
