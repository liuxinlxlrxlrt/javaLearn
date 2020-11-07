package class9_polymorphic;

/*
 * 多态的问题理解：
 */
class Fu3{
	public int age = 40;
	
	public void teach() {
		System.out.println("讲解JavaSE");
	}
}

class Zi3 extends Fu3{
	public int age = 20;
	
	public void teach() {
		System.out.println("讲解论语");
	}
	
	public void playGame() {
		System.out.println("英雄联盟");
	}
}

//Java培训特别火，很多人来Fu3去讲课，这一天Fu3被请求了
//但是还是有人来请，就剩Zi3在家，价格还挺高，Zi3一想，我是不是可以考虑去呢？
//然后穿上Fu3衣服，带上Fu3眼镜，粘上Fu3子，就开始装Fu3
//向上转型
//Fu3 f = new Zi3();
//到人家那里去了
//System.out.println(f.age);//40
//f.teach();//讲解论语
//f.playGame()//这是儿子才能做的

//讲完课了，下班回家了
//脱下Fu3的装备，换上自己的装备
//向下转型
//Zi3 k = (Fu3)f;
//System.out.println(f.age);//20
//f.teach();//讲解论语
//f.playGame()//英雄联盟

public class PolymorphicDemo5 {
	public static void main(String[] args) {
		//测试
		Fu3 f = new Zi3();
		System.out.println(f.age);
		f.teach();//方法teach被Zi3中的teach重写
		//结果是：40,讲解论语
		
		Zi3 z = (Zi3)f;
		System.out.println(z.age);
		z.teach();
		z.playGame();
		//结果是：20,讲解论语,英雄联盟
	}
}
