class Point{
	private int x,y;
	public Point(int x ,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}


class ColorPoint extends Point{
	
	private String color;
	
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String toString() {
		return color+"색의 "+"("+getX()+","+getY()+")"+"의 점";
	}
	
	
}


class ColorPoint2 extends Point{
	private String color;
	
	public ColorPoint2() {
		super(0,0);
		this.color="WHITE";
	}
	
	public ColorPoint2(int x, int y) {
		super(x,y);
		this.color="";
	}
	
	public ColorPoint2(int x, int y, String color) {
		super(x,y);
		this.color=color;
	}
	
	public void set(String color) {
		
		this.color=color;
	}
	
	public void set(int x, int y) {
		move(x,y);
	}
	
	public String toString() {
		return color+"색의 "+"("+getX()+","+getY()+")"+"의 점";
	}
	
	public double getDistance(ColorPoint2 other) {
		
		int dx=other.getX()-this.getX();
		int dy=other.getY()-this.getY();
		
		double distance= Math.sqrt((dx*dx)+(dy*dy));
		
		return distance;
		
	}
	
}

	

public class ex5_3 {

	public static void main(String[] args) {
		
		ColorPoint cp= new ColorPoint(5,5,"RED");
		cp.setXY(10,20);
		cp.setColor("BLUE");
		String str=cp.toString();
		System.out.println(str+"입니다.");
		
		
		
		ColorPoint2 zeroPoint=new ColorPoint2();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint2 cp1 = new ColorPoint2(10,10,"RED");
		
		cp1.set("RED");
		cp1.set(10,20);
		System.out.println(cp1.toString()+" 입니다.");
		
		ColorPoint2 threholdPoint= new ColorPoint2(100,200);
		
		System.out.println("cp에서 임계점까지의 거리는 "+ cp1.getDistance(threholdPoint));
		
		
		
//		Point3D p= new Point3D(3,2,1);
//		System.out.println(p.toString()+"입니다.");
//		
//		p.moveUp(3);
//		System.out.println(p.toString()+"입니다.");
//	
//		p.moveDown(2);
//		System.out.println(p.toString()+"입니다.");
//		
//		p.move(5,5);
//		System.out.println(p.toString()+"입니다.");
//		
//		p.move(100,200,300);
//		System.out.println(p.toString()+"입니다.");
//		
//		
	}

}
