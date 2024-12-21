import java.util.Scanner;

public class ex2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("나이를 입력하세요>>");
		Scanner scanner=new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		int red= age/10;
		
		int blue= (age%10)/5;
		
		int yellow=(age%10)%5;
		
		int sum=red+blue+yellow;
		
		if(age<0) {
			
			System.out.println("나이는 양수로만 입력하세요.");
		}else {
		System.out.println("빨간 초 "+red+"개, "+ "파란 초 "+blue+"개, "+"노란 초 "+yellow+
				"개. "+"총 "+sum+"개가 필요합니다.");
		}		
		
	
	}

}