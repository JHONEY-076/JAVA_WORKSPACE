class Point1{
	private int  x,y;
	public Point1() {
		this.x=0;
		this.y=0;
	}
	public Point1(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
}

class ColorPoint1 extends Point1{
	private String color;
	
	public ColorPoint1(int x, int y, String color) {
		super(x,y); // 슈퍼 클래스 생성자의 매개변수를 전달할수 있음.
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	
}




public class superEX {

	public static void main(String[] args) {
		ColorPoint1 cp= new ColorPoint1(5,6,"blue");
		cp.showColorPoint();

	}

}
