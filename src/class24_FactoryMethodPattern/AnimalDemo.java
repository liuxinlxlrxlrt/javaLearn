package class24_FactoryMethodPattern;

public class AnimalDemo {

	public static void main(String[] args) {
		//我要买只狗
		FactoryMethod fm = new DogFactory();
		Animal a = fm.createAnimal();
		a.eat();
		System.out.println("--------");
		//需求：我要买只猫
		FactoryMethod fm02 = new CatFactory();
		a = fm02.createAnimal();
		a.eat();

	}

}
