package class15_Collection;

/*
 * ����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
 *		 ѧ����Student
 *		 ��Ա������name,age
 *		 ���췽�����޲�,����
 *		 ��Ա������getXxx()/setXxx()
 *		 �洢ѧ��������?�Լ�����Ӧ����ʲô���ӵ�?
 * ������
 * 		A:����ѧ���ࡣ
 * 		B:����ѧ������(��������)��
 * 		C:����5��ѧ�����󣬲���ֵ��
 * 		D:��C�����Ԫ�أ��ŵ������С�
 * 		E:����ѧ�����顣
 */

public class ObjectArray {
	public static void main(String[] args) {
		// ����ѧ������(��������)
		StudentArray[] students = new StudentArray[5];

		// ����5��ѧ�����󣬲���ֵ
		StudentArray s1 = new StudentArray("��ԲԲ", 29);
		StudentArray s2 = new StudentArray("����", 28);
		StudentArray s3 = new StudentArray("����", 27);
		StudentArray s4 = new StudentArray("�����", 26);
		StudentArray s5 = new StudentArray("����Ӱ", 25);

		// ��C�����Ԫ�أ��ŵ�������
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;

		// ���������ƣ�����ѭ����
		// for (int x = 0; x < students.length; x++) {
		// students[x] = s + "" + (x + 1);
		// }
		// ������������

		// ����
		for (int x = 0; x < students.length; x++) {
			// System.out.println(students[x]);

			StudentArray s = students[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
