package class10_Interface;
/*
 * ���ӿڳ��ֺ��һЩСϸ�ڡ�
   1.������
		�̳�(is a)��ϵ��ֻ�ܵ��̳У����ǿ��Զ��̳�
   2.����ӿ�
		ʵ��(like a)��ϵ�����Ե�ʵ�֣�Ҳ���Զ�ʵ�֡��������ڼ̳�һ�����ͬʱʵ�ֶ���ӿ�
   3.�ӿ���ӿ�
		�̳й�ϵ�����Ե��̳У�Ҳ���Զ�̳�
 */
//3.�ӿ���ӿ�
interface interA{
	void show1();
}
interface interAA{
	void show11();
}
interface interB extends interA,interAA{
	void show2();
}
class Test implements interB{
	public void show1() {};
	public void show2() {};
	public void show11(){};
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		//

	}

}
