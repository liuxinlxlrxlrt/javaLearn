package class24_FactoryMethodPattern;

public class AnimalDemo {

	public static void main(String[] args) {
		//��Ҫ��ֻ��
		FactoryMethod fm = new DogFactory();
		Animal a = fm.createAnimal();
		a.eat();
		System.out.println("--------");
		//������Ҫ��ֻè
		FactoryMethod fm02 = new CatFactory();
		a = fm02.createAnimal();
		a.eat();

	}

}
