package class7;

public class PersonDemo {
	public static void main(String[] args) {
		//创建对象1
		Person p1 = new Person("韩雪",23,"中国");
		//方法调用完毕就从内存中消失
		p1.show();
		//创建对象2
		//Person p2 = new Person("智利",25,"中国");
		Person p2 = new Person("智利",25);
		p2.show();
		//创建对象3
		//Person p3 = new Person("甘婷婷",22,"中国");
		Person p3 = new Person("甘婷婷",22);
		p3.show();
		
		p3.country = "美国";
		p3.show();
		
		p1.show();
		p2.show();
	}
}
