package class24_FactoryMethodPattern;

public class CatFactory implements FactoryMethod {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
