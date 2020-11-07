package class22_RandomAccessFile_SequenceStream;
/*
 * NotSerializableException��δ���л��쳣
 * 
 * ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�
 * δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 * 
 * �ýӿھ�Ȼû���κη���������������û�з����Ľӿڱ���Ϊ��ǽӿ�
 * 
 * java.io.InvalidClassException:
 *  class22_otherStream.Person; local class incompatible: 
 *  stream classdesc serialVersionUID = 285545680831434765,
 *   local class serialVersionUID = 1548563184201878462
 *   
 * Ϊʲô���������أ�
 * 		Person��ʵ�������л��ӿڣ���ô������ҲӦ����һ�����ֵ
 * 		������ֵ��100
 * 		Person.class -- id = 100
 * 		write���ݣ�oos.txt ---id =100
 * 		read���ݣ�oos.txt -- id = 100
 * 
 * 		���ڣ�
 * 		Person.class -- id = 200
 * 		write���ݣ�oos.txt ---id =100
 * 		read���ݣ�oos.txt -- id = 100
 * 
 * ��ʵ�ʿ����У����ܻ���Ҫʹ����ǰ�����ݣ���������д�룬��ô���أ�
 * ����һ��ԭ�������ǵ�idֵ��ƥ��
 * ÿ���޸�java�ļ������ݵ�ʱ��class�ļ���idֵ���ᷢ���ı�
 * ����ȡ�ļ���ʱ�򣬻��class�ļ��е�idֵ����ƥ�䣬���Ի�����⡣
 * �����أ�������а취�������idֵ��java�ļ�����һ���̶���ֵ���������޸��ļ���ʱ�����idֵ���ᷢ���ı���
 * ���ᣬ���ڵĹؼ������������֪�����idֵ��α�ʾ�أ�
 * ���õ��ģ��㲻�ü�ס��Ҳû��ϵ�������꼴��
 * ���ѵ�û�п�����ɫ��������
 * 
 * ����Ҫ֪�����ǣ�
 * 		������ʵ�����л��ӿڵ�ʱ��Ҫ������ɫ���������⣬�Ϳ����Զ�����һ�����л�id
 * 		���Ҳ������ֵ�Ժ����Ƕ�������κθĶ�������ȡ��ǰ�����ݶ�û������ġ�
 */

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 285545680831434765L;
	private String name;
//	private int age;
//	int age;
	private transient int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
