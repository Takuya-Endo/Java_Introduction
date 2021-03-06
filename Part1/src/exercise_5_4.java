
public class exercise_5_4 {
	
	public static void main(String[] args) {
		
		double triangleBottom = 10.0;
		double triangleHeight = 5.0;
		System.out.println("三角形の底辺の長さが" + triangleBottom + "、高さが" + triangleHeight +
				"の場合、面積は" + calcTriangleArea(triangleBottom, triangleHeight) + "㎠");
		
		System.out.println("縁の半径が5.0cmの場合、面積は" + calcCircleArea(5.0) + "㎠");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return (bottom * height) / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
