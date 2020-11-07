package class4;
/*
 * 需求：
 *    A:求出1-100之间数据之和
 *    B:求出1-100之间偶数和
 *    C:求出1-100之间奇数和
 */

public class ChooseStructureDemo3forFormat04 {
	public static void main(String[] args) {
		//求出1-100之间数据之和
		int sum1 = 0;
		
		for(int x=1;x<=100;x++) {
			sum1 +=x;
		}
        System.out.println("1-100之间数据之和sum1是："+sum1);
        System.out.println("---------------");
        //求出1-100之间偶数和
        
        int sum2 = 0;
        
        for(int x=1;x<=100;x++) {
        	if(x%2 == 0){
        	sum2 +=x;
        	}
			//sum2 +=2*x;
		}
        System.out.println("1-100之间偶数和sum2是："+sum2);
        System.out.println("---------------");
        
        int sum3 = 0;
        
        for(int x=0;x<=100;x+=2) {
        	//if(x%2 == 0){
        	//sum2 +=x;
        	//}
			sum3 +=x;
		}
        System.out.println("1-100之间偶数和sum3是："+sum3);
        System.out.println("---------------");
       // 求出1-100之间奇数和
        int sum4 = 0;
        
        for(int x=1;x<=100;x++) {
        	if(x%2 != 0){
            	sum4 +=x;
            	}
		}
        System.out.println("1-100之间奇数和sum4是："+sum4);
	}
}
