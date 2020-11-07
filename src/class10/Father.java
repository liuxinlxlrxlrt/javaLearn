package class10;
/*
 * Permission modifier权限修饰符
 * 				本类中      同包(子类和无关类)  不同包(子类)  不同包(无关类)
 * 	private		Yes
 * 	默认			Yes     Yes					
 * 	protected	Yes		Yes					Yes
 * 	public		Yes		Yes					Yes			Yes
 */

public class Father {
	private void show() {
		System.out.println("show");
	}
	void show2() {
		System.out.println("show2");
	}
	protected void show3() {
		System.out.println("show3");
	
	}
	public void show4() {
		System.out.println("show4");
	}

	public static void main(String[] args) {
		Father f =  new Father();
		f.show();
		f.show2();
		f.show3();
		f.show4();
	}
}
