package class9_polymorphic;

/*
 * ��̬��������⣺
 */
class Fu3{
	public int age = 40;
	
	public void teach() {
		System.out.println("����JavaSE");
	}
}

class Zi3 extends Fu3{
	public int age = 20;
	
	public void teach() {
		System.out.println("��������");
	}
	
	public void playGame() {
		System.out.println("Ӣ������");
	}
}

//Java��ѵ�ر�𣬺ܶ�����Fu3ȥ���Σ���һ��Fu3��������
//���ǻ����������룬��ʣZi3�ڼң��۸�ͦ�ߣ�Zi3һ�룬���ǲ��ǿ��Կ���ȥ�أ�
//Ȼ����Fu3�·�������Fu3�۾���ճ��Fu3�ӣ��Ϳ�ʼװFu3
//����ת��
//Fu3 f = new Zi3();
//���˼�����ȥ��
//System.out.println(f.age);//40
//f.teach();//��������
//f.playGame()//���Ƕ��Ӳ�������

//������ˣ��°�ؼ���
//����Fu3��װ���������Լ���װ��
//����ת��
//Zi3 k = (Fu3)f;
//System.out.println(f.age);//20
//f.teach();//��������
//f.playGame()//Ӣ������

public class PolymorphicDemo5 {
	public static void main(String[] args) {
		//����
		Fu3 f = new Zi3();
		System.out.println(f.age);
		f.teach();//����teach��Zi3�е�teach��д
		//����ǣ�40,��������
		
		Zi3 z = (Zi3)f;
		System.out.println(z.age);
		z.teach();
		z.playGame();
		//����ǣ�20,��������,Ӣ������
	}
}
