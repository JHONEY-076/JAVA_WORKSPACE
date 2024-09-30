import java.util.Scanner;

public class ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("양의 정수 입력>>");
		int a =scanner.nextInt();
		
		while(a<0) {
			System.out.print("양의 정수 입력>>");
			scanner.nextLine();
			a =scanner.nextInt();
		}
		
		for(int i=0;i<a;i++) {	
			for(int j=a;j>i;j--) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		
		
		
		
		
		
		
		
	
		
		
	}

}