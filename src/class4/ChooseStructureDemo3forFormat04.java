package class4;
/*
 * ����
 *    A:���1-100֮������֮��
 *    B:���1-100֮��ż����
 *    C:���1-100֮��������
 */

public class ChooseStructureDemo3forFormat04 {
	public static void main(String[] args) {
		//���1-100֮������֮��
		int sum1 = 0;
		
		for(int x=1;x<=100;x++) {
			sum1 +=x;
		}
        System.out.println("1-100֮������֮��sum1�ǣ�"+sum1);
        System.out.println("---------------");
        //���1-100֮��ż����
        
        int sum2 = 0;
        
        for(int x=1;x<=100;x++) {
        	if(x%2 == 0){
        	sum2 +=x;
        	}
			//sum2 +=2*x;
		}
        System.out.println("1-100֮��ż����sum2�ǣ�"+sum2);
        System.out.println("---------------");
        
        int sum3 = 0;
        
        for(int x=0;x<=100;x+=2) {
        	//if(x%2 == 0){
        	//sum2 +=x;
        	//}
			sum3 +=x;
		}
        System.out.println("1-100֮��ż����sum3�ǣ�"+sum3);
        System.out.println("---------------");
       // ���1-100֮��������
        int sum4 = 0;
        
        for(int x=1;x<=100;x++) {
        	if(x%2 != 0){
            	sum4 +=x;
            	}
		}
        System.out.println("1-100֮��������sum4�ǣ�"+sum4);
	}
}
