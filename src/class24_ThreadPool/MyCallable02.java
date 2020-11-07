package class24_ThreadPool;

import java.util.concurrent.Callable;
/*
 * 线程求和案例
 */

public class MyCallable02 implements Callable<Integer> {

	private int number;
	
	public MyCallable02(int number) {
		this.number =number;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int x=1;x<=number;x++){
			sum +=x;
		}
		return sum;
	}

}
