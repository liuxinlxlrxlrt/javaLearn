package class4;

/*
 * 获取三个数据中的最大值
 * 
 * 由此案例主要是为了讲解if语句是可以嵌套使用的，而且是可以任意的嵌套
 */

public class ChooseStructureDemo1ifFormatExercises03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
	    int c = 20;
	    
	    //三元实现
	    int temp = (a>b)?a:b;
	    int max1 = (temp>c)?temp:c;
	    System.out.println("max1:"+max1);
	    
	    //用if语句实现
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
