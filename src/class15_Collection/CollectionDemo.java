package class15_Collection;
/*
 * ���ϵ�������
 * 	����ѧ��������������ԣ�������������Զ������������ͨ���������ֵģ�Ϊ�η���Զ��������в��������Ǿͱ������Ը�������д洢��
 *     ����Ҫ�洢������󣬾Ͳ�����һ�������ı�������Ӧ����һ���������͵ı�����������Ŀǰѧ����ֻ����ߣ�����Щ�������͵��أ�
 *     �����StringBuffer.�����أ�StringBuffer�Ľ����һ���ַ�������һ���������ǵ�Ҫ����������ѡ�����飬����Ƕ������顣
 *     �����������ֲ�����Ӧ�仯��������Ϊ����ĳ����ǹ̶��ģ����ʱ��Ϊ����Ӧ�仯������java���ṩ�˼����๩����ʹ�á�
 *     
 * ����ͼ��ϵ�����
 * 	A.��������
 *        ����ĳ��ȹ̶�
 *        ���ϵĳ��ȿɱ�
 *     B.���ݲ�ͬ
 *        ����洢����ͬһ�����͵�Ԫ��
 *        �����Ͽ��Դ洢��ͬ���͵�Ԫ��
 *     C.Ԫ�ص�������������
 *       ������Դ洢�����������ͣ�Ҳ���Դ洢��������
 *       ����ֻ�ܴ洢��������
 *       
 * �����Ǵ洢���Ԫ�أ�������?�洢���Ԫ������Ҳ���в�ͬ�����󣺱���˵������Ҫ����Ԫ���в�������ͬ��Ԫ�أ�
 * �ٱ���˵����Ҫ����Ԫ�ذ���ĳ�ֹ�������һ�£���Բ�ͬ������java���ṩ�˲�ͬ�ļ����࣬�����أ�java���ṩ�˺ܶ�������ࡣ
 * ��������������ݽṹ��ͬ���ṹ��ͬ����Ҫ����Ҫ������Ҫ�ܹ��洢���������һ�Ҫ�ܹ���Щ����������˵�жϣ���ȡ�ȡ�
 * ��Ȼ��������ô�������������й��Ե����ݣ����ǰ���Щ������Ĺ������ݲ��ϵ�������ȡ�����վ��ܹ��γɼ��ϵļ̳���ϵ�ṹ��
 * 
 * java�ṩ���ּ����࣬���ǵ����ݽṹ��ͬ���������ǿ϶��й��Ե����ݣ��洢����ȡ���жϵȣ���ͨ�����ϵ�������ȡ�����Ǿ��ܹ��õ�
 * һ�����ϵļ̳���ϵ�ṹͼ��
 * �������Ӿ��嵽����
 * ʵ�֣��ӳ��󵽾���
 * ʹ�ã�ʹ�þ���
 * 
 * ���ݽṹ�����ݵĴ洢��ʽ
 * 
 * Connection:�Ǽ����Ķ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ�������ġ�
 * 
 * Connection�Ĺ��ܸ�����
 *   1.��ӹ��ܣ�
 *      boolean add<Object  obj>:���һ��Ԫ�أ�Object�����������
 *      boolean addAll(Connection c):���һ�����ϵ�Ԫ��
 *   2.ɾ������
 *      void clear():�Ƴ�����Ԫ�� 
 *      boolean remove(Object o);�Ƴ�һ��Ԫ��
 *      boolean removeAll(Connection o); �Ƴ�һ�����ϵ�Ԫ��(��һ����������)
 *   3.�жϹ���
 *     boolean contains(Object  o):�жϼ������Ƿ����ָ����Ԫ��
 *     boolean containsAll(Connection c):�жϼ������Ƿ����ָ���ļ���Ԫ�أ�����һ���������У�
 *     boolean isEmpty()�жϼ����Ƿ�Ϊ�գ����ϵ�Ԫ��Ϊ�գ�
 *   4.��ȡ����
 *     Iterator<E> iterator()�ص�
 *   5.���ȹ���
 *   	int size();Ԫ�صĸ���
 *   	�����⣺������û��length()�����أ��ַ�����û��length()�����أ�������û��length()�����أ�
 *   6.�������ܣ�
 *   	boolean retainAll(Collection c);�������϶��е�Ԫ�أ�˼��Ԫ��ȥ�����ˣ����ص�boolean��������˼
 *   7.�Ѽ���ת��������
 *   	object[] toArray();
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		// ���Բ���ALL�ķ���

		// �������϶���
		// Collection c = new Collection();//������Ϊ�ӿڲ���ʵ����

		Collection c = new ArrayList();

		// 1.��ӹ��ܣ�boolean add(Object obj);���һ��Ԫ��
		// 2.System.out.println("add:"+c.add("hello"));//����add:truec:[hello]
		c.add("hello");
		c.add("world");
		c.add("java");
		// c.add("hello");c.add("world");c.add("java");����c:[hello, world, java]

		// 3.ɾ������:void clear();�Ƴ�����Ԫ��
		// c.clear();//����c:[]

		// 4.ɾ������:boolean remove(Object o);�Ƴ�һ��Ԫ��
		// System.out.println("remove:"+c.remove("hello"));//remove:true/c:[world, java]

		// 5.�жϹ���: boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
		// System.out.println("contains:"+c.contains("hello"));//contains:true/c:[hello,
		// world, java]

		// 6.�жϹ���:boolean isEmpty()�жϼ����Ƿ�Ϊ�գ����ϵ�Ԫ��Ϊ�գ�
		// System.out.println("isEmpty:"+c.isEmpty());//isEmpty:false/c:[hello, world,
		// java]

		// 7.���ȹ���int size();Ԫ�صĸ���
		// System.out.println("size:"+c.size()); //size:3/ c:[hello, world, java]

		// ֱ���������;
		// �����Ĳ��ǵ�ֵַ��˵����д�ˣ�
		// �����ĵ�ֵַ��˵��û�б���д
		System.out.println("c:" + c);// c:[]��д�ˣ�����add:true/c:[hello]
	}
}
