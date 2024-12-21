import java.util.Scanner;
public class ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("생일을 입력 하세요>>");
		Scanner scanner =new Scanner(System.in);
		
		int birthday=scanner.nextInt();
		
		int Year=birthday/10000;
		int Month=((birthday/100)%100);
		int day=(birthday%100);
		
		System.out.println(Year+"년 "+Month+"월 "+day+"일");
		
		scanner.close();
	}

}