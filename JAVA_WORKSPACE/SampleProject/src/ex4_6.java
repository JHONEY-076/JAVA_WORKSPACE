
public class ex4_6 {

	private int x;
	private int y;
	private int width;
	private int height;
	
	public ex4_6(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=y;
		this.height=height;
	}
	
	
	public boolean isSquare() {
		
		if(width==height) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean contains(ex4_6 r) {
	    // 사각형 r의 네 변이 현재 사각형의 경계 내에 있는지 확인
	    if (r.x < this.x) { 
	        return false; // r의 왼쪽 경계가 현재 사각형의 왼쪽 경계 밖에 있음
	    }
	    if (r.y < this.y) { 
	        return false; // r의 위쪽 경계가 현재 사각형의 위쪽 경계 밖에 있음
	    }
	    if (r.x + r.width > this.x + this.width) { 
	        return false; // r의 오른쪽 경계가 현재 사각형의 오른쪽 경계 밖에 있음
	    }
	    if (r.y + r.height > this.y + this.height) { 
	        return false; // r의 아래쪽 경계가 현재 사각형의 아래쪽 경계 밖에 있음
	    }
	    
	    // 모든 조건을 만족하면 r은 현재 사각형 내에 포함됨
	    return true;
	}

	
	public void show() {
		
		System.out.println("("+x+","+y+")"+"에서 크기가 "+width+"x"+height+"인"+"사각형");
		
		
	}
	
	public static void main(String[] args) {
		
		ex4_6 a= new ex4_6(3,3,6,6);
		ex4_6 b= new ex4_6(4,4,2,3);
		
		a.show();
		if(a.isSquare()) {
			System.out.println("a는 정사각형입니다.");
		}else {
			System.out.println("a는 직사각형입니다.");
		}
		
		if(a.contains(b)) {
			System.out.println("a는 b를 포함합니다.");
		}
		
		
	}

}
