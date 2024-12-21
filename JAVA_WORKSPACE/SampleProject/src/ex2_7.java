import java.util.Scanner;
public class ex2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("월을 입력하세요(1~12)>>");
		Scanner scanner=new Scanner(System.in);
		
		int month= scanner.nextInt();
		
//		if(month>=3&&month<=5) {
//			System.out.print("따뜻한 봄");
//		}
//		else if(month>=6&&month<=8) {
//			System.out.print("바다가 즐거운 여름");
//		}
//		else if(month>=9&&month<=11) {
//			System.out.print("낙엽이 지는 아름다운 가을");
//		}
//		else if(month==12||month==0||month==1) {
//			System.out.print("눈 내리는 하얀 겨울");
//			
//		}
//		else {
//			System.out.print("1~12만 입력하세요.");
//		}
		
		switch(month) {
		
		case 3,4,5:
			System.out.print("따뜻한 봄");
			break;
		
		case 6, 7, 8:
			System.out.print("바다가 즐거운 여름");
			break;
		
		case 9,10,11:
			System.out.print("낙엽이 지는 아름다운 가을");
			break;
			
		case 12, 0,1:
			System.out.print("눈 내리는 하얀 겨울");
			break;
			
		default:
			System.out.print("1~12만 입력하세요.");
		}
		
		
		
		scanner.close();
		
	}
	
}