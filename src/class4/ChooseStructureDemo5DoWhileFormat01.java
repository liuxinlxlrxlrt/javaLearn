package class4;

/*do��whileѭ������ʽ��
������ʽ
   do {
         ѭ�������;
   }while((�ж��������);
��չ��ʽ
   ��ʼ�����;
   do {
         ѭ�������;
         �����������;
    } while((�ж��������);
 */

public class ChooseStructureDemo5DoWhileFormat01 {
	public static void main(String[] args) {
		// ���10��helloworld

		int x = 0;
		do {
			System.out.println("helloworld");
			x++;
		} while (x < 10);
		System.out.println("---------------");

		// ���1-100
		int sum = 0;
		int a = 1;
		do {
			sum += a;
			a++;
		} while (a <= 100);
		System.out.println(sum);
	}
}
