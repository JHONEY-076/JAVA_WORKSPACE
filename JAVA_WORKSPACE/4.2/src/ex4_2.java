
public class ex4_2 {
	
	
	 private int row;
	 private int colum;  // 'colum'에서 'column'으로 수정
	 private int height;
	
	public ex4_2(int r, int c, int h) {
		
		row=r;
		colum=c;
		height=h;
		
	}
	
	public int getVolume() {
		return row*colum*height;
	}
	
	public void increase(int r, int c ,int h) {
		row += r;  
		colum += c;  
        height += h;  
	}
	
	
	public boolean isZero() {
        return row == 0 && colum == 0 && height == 0;
    }
	

	public static void main(String[] args) {
		
		
		ex4_2 cube = new ex4_2(1,2,3);
		
		System.out.println("큐브의 부피는 "+ cube.getVolume());
		
		cube.increase(1,2,3);
		
		System.out.println("큐브의 부피는 "+cube.getVolume());
		
		if(cube.isZero())
			System.out.println("큐브의 부피는 0");
		
		else
			System.out.println("큐브의 부피는 0이 아님");
		
		

	}

}