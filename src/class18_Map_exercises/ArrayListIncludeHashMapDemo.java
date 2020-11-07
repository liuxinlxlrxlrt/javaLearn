package class18_Map_exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*需求：ArrayList集合嵌套HashMap集合遍历
 * 假设ArrayList的元素HashMap集合,有3个
 * 每一个ArrayList集合的值是字符串
 * 	元素我已经完成，请遍历
 * 
 * 结果：
 * 三国演义
 *  	周瑜---小乔
 *  	吕布---貂蝉
 * 	神雕侠侣
 * 		郭靖---黄蓉
 * 		杨过---小龙女				
 * 	笑傲江湖
 * 		令狐聪---任盈盈
 * 		林平之---岳灵珊

 * 
 */

public class ArrayListIncludeHashMapDemo {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<HashMap<String,String>>  array = new ArrayList<HashMap<String,String>>();
		
		//创建元素1
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("周瑜", "小乔");
		hm1.put("吕布", "小龙女");
		
		array.add(hm1);
		
		//创建元素2
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm1.put("郭靖", "黄蓉");
		hm1.put("杨过", "貂蝉");
		array.add(hm2);
		
		
		//创建元素2
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm1.put("令狐聪", "任盈盈");
		hm1.put("林平之", "岳灵珊");
		array.add(hm3);
		
		//遍历
		for(HashMap<String,String> hm:array) {
			Set<String> set = hm.keySet();
			for(String key :set) {
				String value = hm.get(key);
				System.out.println(key+"---"+value);
			}
		}
	}

}
