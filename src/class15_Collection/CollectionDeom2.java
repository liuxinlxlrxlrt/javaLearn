package class15_Collection;

/*����������һ�����϶��󣬵��õ�Ҳ��һ�����϶���
boolean addAll(Collection c);���һ�����ϵ�Ԫ��
boolean removeAll(Collection c);�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
boolean containsAll(Collection c);�жϼ������Ƿ����ָ���ļ���Ԫ�أ�����һ���������У�
boolean retainAll(Collection c);�������϶��е�Ԫ�أ�˼��Ԫ��ȥ�����ˣ����ص�boolean��������˼
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDeom2 {

	public static void main(String[] args) {
		// ��������1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// ��������2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// 1. ��ӹ��ܣ�boolean addAll(Collection c);���һ�����ϵ�Ԫ��
		// System.out.println("addAll:"+c1.addAll(c2));
		// addAll:true;c1:[abc1, abc2, abc3, abc4, abc4, abc5, abc6, abc7]/c2:[abc4,
		// abc5, abc6, abc7]

		// 2. ɾ�����ܣ�boolean removeAll(Collection c);�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
		// ֻҪһ��Ԫ�ر��Ƴ����ͷ���true
		// System.out.println("removeAll:"+c1.removeAll(c2));//removeAll:true/c1:[abc1,
		// abc2, abc3]/c2:[abc4, abc5, abc6, abc7]

		// 3.�жϹ��ܣ� boolean containsAll(Collection c);�жϼ������Ƿ����ָ���ļ���Ԫ�أ�����һ���������У�
		// C1ֻ�а���c2���е�Ԫ�أ��Žа���//
		// System.out.println("containsAll:"+c1.containsAll(c2));
		// ���أ�containsAll:false��c1:[abc1, abc2, abc3]��c2:[abc4, abc5, abc6, abc7]

		// 4.�������ܣ�boolean retainAll(Collection c);�������϶��е�Ԫ�أ�˼��Ԫ��ȥ�����ˣ����ص�boolean��������˼
		// ������������A,B
		// A��B�����������յĽ��������A�У�B����
		// ����ֵ��ʾ����A�Ƿ������ı�
		System.out.println("retainAll:" + c1.retainAll(c2));
		// ���أ�retainAll:true/c1:[abc4]/c2:[abc4, abc5, abc6, abc7]

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	}
}
