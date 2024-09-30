import java.util.Scanner;
public class ex_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.print("학생1>>");
		String s1_name=scanner.next();
		
		int s1_late_score= scanner.nextInt();
		int s1_absent_score=scanner.nextInt();
		
		
		System.out.print("학생2>>");
		String s2_name=scanner.next();
		
		int s2_late_score= scanner.nextInt();
		int s2_absent_score=scanner.nextInt();
		
		
		int s1_total_score= 100-(s1_late_score*3)-(s1_absent_score*8);
		int s2_total_score=100-(s2_late_score*3)-(s2_absent_score*8);
		
	
		
	
		if(s1_total_score>s2_total_score) {
			System.out.print(s1_name+"의 출석 점수가 더 높음.");
			System.out.print(s1_name+" 출석 점수는 "+s1_total_score);
		}
		else if(s1_total_score<s2_total_score){
			System.out.print(s2_name+"의 출석 점수가 더 높음. ");
			System.out.print(s2_name+" 출석 점수는 "+s2_total_score);
		}
		else if(s1_total_score==s2_total_score) {
			System.out.print("점수 동일");
		}
	
		scanner.close();
	
	}
	
}