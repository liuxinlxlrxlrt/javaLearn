package class4;

/*
 * ��ȡ���������е����ֵ
 * 
 * �ɴ˰�����Ҫ��Ϊ�˽���if����ǿ���Ƕ��ʹ�õģ������ǿ��������Ƕ��
 */

public class ChooseStructureDemo1ifFormatExercises03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
	    int c = 20;
	    
	    //��Ԫʵ��
	    int temp = (a>b)?a:b;
	    int max1 = (temp>c)?temp:c;
	    System.out.println("max1:"+max1);
	    
	    //��if���ʵ��
	    int max2;
	    if(a > b) {
	    	if(a > c) {
	    		max2 = a;
	    	}else {
	    		max2 = c;
	    	}
	    }else {
	    	if (b > c){
	    		max2 = b;
	    	}else {
	    		max2 = c;
	    	}
	    }
	    System.out.println("max2:"+max2);
	}
}
