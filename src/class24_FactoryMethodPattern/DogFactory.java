package class24_FactoryMethodPattern;

public class DogFactory implements FactoryMethod {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
