package class7;

/*
 * 定义一个长方形类,定义 求周长和面积的方法，
 * 然后定义一个测试了RectangleTest2，进行测试
 * 
 * 长方形的类：
 * 		成员变量：
 * 			长，宽
 * 		成员方法：
 * 			求周长：(长+宽)*2
 * 			求面积：长*宽
 * 
 * Rectangle/'rɛktæŋɡl/ n. 矩形；长方形
 */

public class Rectangle {
	//长方形的长
	private int length;
	//长方形的宽
	private int width;
	//无参构造方法
	public Rectangle() {}
	//getXxx()和setXxx()方法
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//求面积(acreage /'ekərɪdʒ/  )
	public int getAcreage() {
		return length*width;
	}
	//求周长(perimeter/pə'rɪmɪtɚ/ )
	public int getPerimeter() {
		return (length+width)*2;
	}
}
