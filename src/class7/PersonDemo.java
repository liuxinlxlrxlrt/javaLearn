package class7;

public class PersonDemo {
	public static void main(String[] args) {
		//��������1
		Person p1 = new Person("��ѩ",23,"�й�");
		//����������Ͼʹ��ڴ�����ʧ
		p1.show();
		//��������2
		//Person p2 = new Person("����",25,"�й�");
		Person p2 = new Person("����",25);
		p2.show();
		//��������3
		//Person p3 = new Person("������",22,"�й�");
		Person p3 = new Person("������",22);
		p3.show();
		
		p3.country = "����";
		p3.show();
		
		p1.show();
		p2.show();
	}
}
