import java.util.Scanner;
public class ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("자동차 상태 입력>>");
		
		int status= scanner.nextInt();
		
		if((status&0b010000000)==0) {			
			System.out.print("자동차는 정지 상태이고 ");
		}
		else {
			System.out.print("자동차는 달리는 상태이고 ");
		}
		
		if((status&0b001000000)==0) {			
			System.out.print("에어컨이 꺼진 상태이고 ");
		}
		else {
			System.out.print("에어컨이 켜진 상태이고 ");
		}
	
		int temperture=status&0b000111111;
				
		System.out.print("온도는 "+temperture+"도이다");
		
	}

}