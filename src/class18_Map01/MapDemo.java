package class18_Map01;
/*
 * ��Ϊѧ����˵���Ǹ���ѧ��������ѧ���ģ���ô�����������Ѿ�֪����ѧ����ѧ�ţ���Ҫ����ѧ�ź�ȥ��ȡѧ�����������ʸ���ô����
 * �������ǰ�潲����ļ��ϣ�����ֻ�ܰ�ѧ�ź�ѧ��������Ϊһ������ĳ�Ա��Ȼ��洢�������󣬽���������ʱ���жϣ���ȡ��Ӧ�����ơ�
 * �����أ�������ܰ�ѧ�������ó����ˣ��һ���Ҫ���ݱ��ȥ����
 * �������Ŀǰ���������󣺽���֪��ѧ�ţ�����֪��ѧ�������������java���ṩ��һ���µļ���Map.
 * ͨ���鿴API������֪��Map���ϵ�һ������ص㣬���������Դ洢��ֵ�Ե�Ԫ�ء�
 * 		ѧ��1�� ����1
 *		ѧ��2�� ����2
 * 		ѧ��3�� ����3
 * 		ѧ��2(����)�� ����4
 * 		ѧ��4�� ����4(ֵ�����ظ�)
 * 
 * Map���ϵ��ص㣺
 * 		����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ��
 * 
 * Map���Ϻ�Colletion���ϵ�����
 * 		 Map���ϴ洢Ԫ���ǳɶԳ��ֵ�,Map���ϵļ���Ψһ��,ֵ�ǿ��ظ��ġ����԰�������Ϊ�����޶ԡ�
 * 		Colletion����Map���ϴ洢Ԫ�ǵ�����,Colletion���ϵĶ���Set��Ψһ��,List�ǿ��ظ��ġ����԰�������Ϊ�������	
 * 
 * ע��:
 * 		Map���ϵ����ݽṹ��Լ���Ч����ֵ�޹ء�
 * 			HashMap,TreeMap�Ȼὲ��
 * 		Collection���ϵ����ݽṹ�����Ԫ����Ч��
 * 
 * Map���ϵĹ��ܸ�����
 *		1����ӹ��ܺ��滻(�޸Ĺ���)
 *			V put(K key,V value)�����Ԫ�أ������ʵ������һ�����ܣ��Ȳ������㣬�Ȼὲ
 *				������ǵ�һ�δ���,��ֱ�Ӵ洢Ԫ�أ�����null;
 *				��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻��������ǰ��ֵ
 *
 *			void putAll(Map<? extends K,? extends V> m)��
 *		2��ɾ������
 *			void clear():�Ƴ����еļ�ֵ��Ԫ�ء�
 *			V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�ز���ֵ����
 *		3���жϹ���
 *			boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 *			boolean containsValue(Object Value):�жϼ����Ƿ����ָ����ֵ
 *			boolean isEmpty()���жϼ����Ƿ�Ϊ��
 *		4����ȡ����
 *			Set<Map.Entry<K,V>> entrySet()��???//���ص��Ǽ�ֵ�Զ���ļ���
 *			V(����) get(Object key)�����ݼ���ȡֵ
 *			Set<K> keySet()����ȡ���������м�
 *			Collection<V> values()����ȡ����������ֵ�ļ���
 *		5�����ȹ���
 *			int size()�����ؼ����еļ�ֵ�ԵĶ���
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		//�������϶���
		Map<String,String>  map = new HashMap<String,String>();
		
		//���Ԫ��
		//V put(K key,V value)�����Ԫ�أ������ʵ������һ�����ܣ��Ȳ������㣬�Ȼὲ
//		System.out.println("put:"+map.put("����", "�����P"));
//		System.out.println("put:"+map.put("����", "Ҧ��"));
		//����ֵ��put:�����P,map:{����=Ҧ��}
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "������");
		map.put("������", "����");
		//����ֵ��map:{�˳�=��ٳ, �ܽ���=������, ������=��ӱ, ������=����}
		
		//ɾ������
		//void clear():�Ƴ����еļ�ֵ��Ԫ�ء�
//		map.clear();
		
		//V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�ز���ֵ����
		//System.out.println("remove:"+map.remove("������"));
		//���أ�remove:��ӱ
		//System.out.println("remove:"+map.remove("������"));
		//remove:null
		
		//�жϹ���
		//boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		System.out.println("containsKey"+map.containsKey("������"));
		//����ֵ��containsKeytrue
		System.out.println("containsKey"+map.containsKey("������"));
		//����ֵ��containsKeyfalse
		//boolean containsValue(Object Value):�жϼ����Ƿ����ָ����ֵ
		System.out.println("containsValue"+map.containsValue("����"));
		//����ֵ��containsKeytrue
		System.out.println("containsValue"+map.containsValue("���"));
		//����ֵ��containsKeyfalse
		//boolean isEmpty()���жϼ����Ƿ�Ϊ��
		System.out.println("isEmpt:"+map.isEmpty());
		//����ֵisEmpt:false
		
		//���ȹ���
		//int size()�����ؼ����еļ�ֵ�ԵĶ���
		System.out.println("size:"+map.size());
		
		//�����������
		System.out.println("map:"+map);
	}
}
