package class17_Set_HashSet;

import java.util.HashSet;
import java.util.Set;

/*
 * Collnection
 * 		List
 * 			����(�洢˳���ȡ����˳��һ��)�����ظ�
 * 		Set
 * 			����(�洢˳���ȡ����˳��һ��)��Ψһ
 * 			��ȻSet���ϵ�Ԫ��������Ϊ������˵�����϶������Լ��Ĵ洢˳��
 * 			�����˳��ǡ�ú����Ĵ洢˳��һ�£�����������������Զ�洢һЩ���ݣ����ܿ���Ч����
 * Hashset:������֤set�ĵ���˳���ر���������֤��˳���ò��䡣
 */

public class SetDemo {

	public static void main(String[] args) {
		//�������϶���
		Set<String> set = new HashSet<String>();
		
		//���������Ԫ��
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("java");
		set.add("world");
		
		//��ǿfor
		for(String s:set) {
			System.out.println(s);
		}
	}
}
