package class16_JDK5newfeature;

/*public Object[] toArray()��������ת������
 * 
 * public static <T> List<T> asList(T... a):������ת����
 * 
 * ע�����
 * 		��Ȼ���԰�����ת�ɼ���,���Ǽ��ϵĳ��Ȳ��ܸı䡣
 * ��ԭ����������ϻ���һ�����顣
 */
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		// ����һ������
//		String [] strArray = {"hello","world","java"};
//		List<String> list = Arrays.asList(strArray);

		List<String> list = Arrays.asList("hello", "world", "java");
//		UnsupportedOperationException
//		list.add("javaee");
//		UnsupportedOperationException
//		list.remove(1);
		//
		list.set(1, "javaee");

		for (String s : list) {
			System.out.println(s);
		}
	}
}
