package class10;
/*
 * ���η���
 * 		Ȩ�����η�:
 * 			private,Ĭ�ϵ�,protected,public
 * 		״̬���η���
 * 			static,final
 * 		�������η���
 * 			abstract
 * 
 * �ࣺ
 * 		Ȩ�����η�:
 * 			Ĭ�ϵ�,public
 * 		״̬���η���
 * 			final
 * 		�������η���
 * 			abstract
 * 
 * 		�õ����ľ��ǣ�public
 * 
 * ��Ա������
 * 		Ȩ�����η�:
 * 			private,Ĭ�ϵ�,protected,public
 * 		״̬���η���
 * 			static,final
 * 
 * 		�õ������ǣ�private
 * 
 * 	���췽����
 * 		 Ȩ�����η�:
 * 			private,Ĭ�ϵ�,protected,public
 * 		״̬���η���
 * 			static,final
 *  	�õ�������public
 *  
 *  ��Ա������
 * 		Ȩ�����η�:
 * 			private,Ĭ�ϵ�,protected,public
 * 		״̬���η���
 * 			static,final
 * 		�������η���
 * 			abstract
 * 
* 		�õ����ľ��ǣ�public
* 
* �����������Ϲ���
* 		��Ա������public static final
* 		��Ա������public static 
* 				 public abstract
* 				 public final
 */
//�˴�������ʹ�����η�private
//�˴�������ʹ�����η�protected
//�˴�������ʹ�����η�static
public class Demo {
		//��Ա����
		private int x = 10;
		int y = 20;
		protected int z = 30;
		public int a = 40;
		
		public final int b = 50;
		public static int c = 60;
		public static final int d = 70;
		//�˴�������ʹ�����η�abstract
		//abstract int b = 50;
		
		//���췽��
		private Demo() {};
		Demo(String name) {};
		protected Demo(String name,int age) {};
		public Demo(String name,int age,String address) {};
		//�˴�������ʹ�����η�static
		//public static Demo() {}
		//�˴�������ʹ�����η�final
		//public final Demo() {}
		//�˴�������ʹ�����η�abstract
		//public abstract Demo() {}
		
		//��Ա����
		private void show() {}
		void show2() {}
		protected void show3() {}
		public void show4() {}
		
		static void show5() {}
		//abstract void show6();	
		final void show7() {}
}
