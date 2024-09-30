import java.util.Scanner;
public class ex2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("떡뽂이 몇 인분>>");
		int a=scanner.nextInt();
		
		
		System.out.print("김말이 몇 인분>>");
		int b= scanner.nextInt();
		
		
		System.out.print("쫄면 몇 인분>>");
		int c=scanner.nextInt();
		
		
		int sum=((a*2000)+(b*1000)+(c*3000));
		
		System.out.print("전체 금액은 "+sum+"입니다.");
		
		scanner.close();
		
	}

}