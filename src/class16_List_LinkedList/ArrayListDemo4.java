package class16_List_LinkedList;

/*
 *需求： ArrayList去除集合中字符串的重复值(字符串的内容相同)
 *要求：不能创建新的集合，就在以前的集合上去做
 *	
 *分析：选择排序
 *	如果有多个连续的重复元素,掉一个 ,向上面补位了，就漏掉了
 *	一旦有干掉的,先y--，后y++;
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建字符串对象
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");

		// 由选择排序思想引入，我们就可以通过这种思想做这个题目
		// 拿0索引的一次和后面的比较，有就把后面的干掉
		// 同理，拿1索引的
		for (int x = 0; x < array.size() - 1; x++) {
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;
				}
			}
		}

		// 遍历集合
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

		// 返回：hello
//				world
//				java
//				world(多了一个world)

	}
}
