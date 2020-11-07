package class17_Set_TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import class17_Set_TreeSet.Student3;


/*
 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
 * 
 * ������
 * 		A������ѧ����
 * 		B������һ��TreeSet����
 * 		C���ִܷӸߵ���������ʵ���أ�
 * 		D������¼��5��ѧ����Ϣ
 * 		E������TreeSet����
 */

public class TreeSetDemoHW {
		public static void main(String[] args) {
			//����һ��TreeSet����
			TreeSet<Student3> ts = new TreeSet<Student3>(new Comparator<Student3>() {
				@Override
				public int compare(Student3 s1, Student3 s2) {
					//�ִܷӸߵ���
					int num = s2.getSum()-s1.getSum();
					//�ܷ���ͬ�Ĳ�һ��������ͬ��
					int num2 = num==0?s2.getChinese()-s1.getChinese():num;
					//�ܷ���ͬ�Ĳ�һ����ѧ��ͬ��
					int num3 = num2 ==0?s2.getMath()-s1.getMath():num2;
					//�ܷ���ͬ�Ĳ�һ��Ӣ����ͬ��
					int num4=num3 ==0?s2.getEnglish()-s1.getEnglish():num3;
					//��������һ����ͬ�أ�
					int num5 = num4==0?s2.getName().compareTo(s1.getName()):num4;
					return num5;
				}
			});
			
			System.out.println("ѧ����Ϣ¼�뿪ʼ");
			//����¼��5��ѧ����Ϣ
			for(int x=1;x<=5;x++) {
				Scanner sc = new  Scanner(System.in);
				System.out.println("�������"+x+"��ѧ��������:");
				String name  = sc.nextLine();
				System.out.println("�������"+x+"��ѧ�������ĳɼ�:");
				String chineseString = sc.nextLine();
				System.out.println("�������"+x+"��ѧ������ѧ�ɼ�:");
				String mathString = sc.nextLine();
				System.out.println("�������"+x+"��ѧ����Ӣ��ɼ�:");
				String englishString = sc.nextLine();
				
				//�����ݷ�װ��ѧ������
				Student3 s = new Student3();
				s.setName(name);
				s.setChinese(Integer.parseInt(chineseString));
				s.setMath(Integer.parseInt(mathString));
				s.setEnglish(Integer.parseInt(englishString));
				
				//��ѧ��������ӵ�����
				ts.add(s);
			}
			System.out.println("ѧ����Ϣ¼�����");
			
			System.out.println("ѧ����Ϣ�Ӹߵ�����������");
			System.out.println("����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
			//��������
			for(Student3 s : ts){
				System.out.println(s.getName()+"\t"+s.getChinese()+"\t"+s.getMath()+"\t"+s.getEnglish());
			}
	}
}

