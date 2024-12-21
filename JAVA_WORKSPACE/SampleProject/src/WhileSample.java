import java.util.Scanner;

public class WhileSample {
	public static void main(String[]args) {
		int count =0;
		
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		
		
		int n= scanner.nextInt();
		
		for(int i=0; i<10;i++) {
			
			if(n==-1) 
				break;
			sum+=n;
			count++;
			n=scanner.nextInt();
		}
		
		if(count==0) System.out.println("입력한 정수가 없습니다.");
		else {
			
			System.out.print("정수의 개수는 "+count+"개이며 ");
			System.out.print("평균은 "+(double)sum/count+"입니다");
		}
	
		
		scanner.close();
		
	}
	
}