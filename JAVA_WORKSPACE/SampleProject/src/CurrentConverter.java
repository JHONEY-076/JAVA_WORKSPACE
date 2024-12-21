import java.util.Scanner;


public class CurrentConverter {

	private static double rate;
	public static double toDallar(double won) {
		return won/rate;
	}
	public static double toKWR(double dallar) {
		return dallar*rate;
	}
	
	public static void setRate(double r) {
		rate=r;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("환율(1달러)>>");
		double rate=scanner.nextDouble();
		
		CurrentConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrentConverter.toDallar(1000000)+"입니다.");
		
		System.out.println("100$는 "+CurrentConverter.toKWR(100)+"달러입니다.");
		
		
		scanner.close();
		

	}

}
