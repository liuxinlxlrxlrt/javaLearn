package class22_RandomAccessFile_SequenceStream;
/*
 * NotSerializableException：未序列化异常
 * 
 * 类通过实现 java.io.Serializable 接口以启用其序列化功能。
 * 未实现此接口的类将无法使其任何状态序列化或反序列化。
 * 
 * 该接口居然没有任何方法，类似于这种没有方法的接口被称为标记接口
 * 
 * java.io.InvalidClassException:
 *  class22_otherStream.Person; local class incompatible: 
 *  stream classdesc serialVersionUID = 285545680831434765,
 *   local class serialVersionUID = 1548563184201878462
 *   
 * 为什么会有问题呢？
 * 		Person类实现了序列化接口，那么它本身也应该有一个标记值
 * 		这个标记值是100
 * 		Person.class -- id = 100
 * 		write数据：oos.txt ---id =100
 * 		read数据：oos.txt -- id = 100
 * 
 * 		现在：
 * 		Person.class -- id = 200
 * 		write数据：oos.txt ---id =100
 * 		read数据：oos.txt -- id = 100
 * 
 * 在实际开发中，可能还需要使用以前的数据，不能重新写入，怎么办呢？
 * 回想一下原因是它们的id值不匹配
 * 每次修改java文件的内容的时候，class文件的id值都会发生改变
 * 而读取文件的时候，会和class文件中的id值进行匹配，所以会出问题。
 * 但是呢，如果我有办法，让这个id值在java文件中是一个固定的值，这样你修改文件的时候，这个id值还会发生改变吗？
 * 不会，现在的关键是我们如何能知道这个id值如何表示呢？
 * 不用担心，你不用记住，也没关系，点击鼠标即可
 * 你难道没有看到黄色警告线吗？
 * 
 * 我们要知道的是：
 * 		看到类实现序列化接口的时候，要想解决黄色警告线问题，就可以自动产生一个序列化id
 * 		而且产生这个值以后，我们队类进行任何改动，它读取以前的数据都没有问题的。
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
