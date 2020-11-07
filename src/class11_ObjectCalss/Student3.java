package class11_ObjectCalss;

public class Student3 {
	private String name;
	private int age;
	public Student3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
//	@Override
//	public boolean equals(Object obj) {
//		//return super.equals(obj);
//		//return true;
//		//��Ҫ�Ľ�����������Ƚϵĳ�Ա��������������true����false
//		//����Ҫ�Ƚϵ���name��age
//		//���ǣ�name��String���͵ģ�����String���������͵ģ����ԣ����ﲻ��ֱ����==�Ƚϣ�Ӧ��equels()�Ƚ�
//		//String��equels()��������д ��Object��ģ��Ƚϵ����ַ����������Ƿ���ͬ
//		//this==s1
//		//this==s2
//		//����Ҫʹ�õ���ѧ���� �����г�Ա������Ҫ����ת��
//		Student3 s5 = (Student3)obj;
//		if(this.name.equals(s5.name)&&this.age == s5.age){
//			return true;
//		}else {
//			return false;
//		}
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		//Ϊ�����Ч��
//		if(this ==obj) {
//			return true;
//		}
//		
//		//Ϊ����߳���Ľ�׳��
//		//�����ж�obj�ǲ���ѧ���Ķ����������������ת�ͣ��������ֱ�ӷ���false
//		//���ʱ������Ҫ�жϵ��Ƕ����Ƿ���ĳ����Ķ���
//		//��סһ����ʽ�������� instanceof ����
//		//��ʾ���жϸö����Ƿ��Ǹ������Ķ���
//		
//		if(!(obj instanceof Student3)) {
//			return  false;
//		}
//		Student3 s6 = (Student3)obj;
//		//System.out.println("ͬһ������,����Ҫ����ת�ͱȽ���");
//		return this.name.equals(s6.name)&&this.age ==s6.age;
//	}
}
