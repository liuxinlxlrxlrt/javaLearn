package class10_ReturnValueType;

/*
* ����ֵ���ͣ�
 * 		�������ͣ�
 * 		�������ͣ�
 * 			�ࣺ���ص��Ǹ���Ķ���
 * 			�����ࣺ���ص��Ǹó�����ĸ��������
 * 			�ӿڣ�
 */
//��������Ϊ����ֵ����
abstract class Person{
	public abstract void study();
}
class PersonDemo{
	public Person getPerson(){
		//Person p = new Student();
		//return p; 
		return new Student();
	}
	
class Student extends Person{
		public void study() {
			System.out.println("Good Good study,Day up");
		}
	}
}

public class PersonTest2 {
	public static void main(String[] args) {
		//������Ҫʹ��Person���е�study()����
		PersonDemo pd = new PersonDemo();
		//pd.getPerson()=new Student();
		//Person p = new Student();//��̬
		Person p =pd.getPerson();
		p.study();
	}
}
