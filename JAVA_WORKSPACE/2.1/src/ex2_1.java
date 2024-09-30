import java.util.Scanner;
public class ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("$1=1200원입니다. 달러를 입력하세요>>");
		Scanner scanner =new Scanner(System.in);
		
		int dallar =scanner.nextInt();
		System.out.println("$"+dallar+"는 "+dallar*1200+"입니다.");
		
		
		scanner.close();
	}

}