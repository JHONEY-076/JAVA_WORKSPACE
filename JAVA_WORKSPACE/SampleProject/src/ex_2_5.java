import java.util.Scanner;

public class ex_2_5 {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt(); // 점수 읽기

        if (score >= 90 && score <= 100) { // score가 90 이상 100 이하
            grade = 'A';
        } else if (score >= 80 && score < 90) { // score가 80 이상 90 미만
            grade = 'B';
        } else if (score >= 70 && score < 80) { // score가 70 이상 80 미만
            grade = 'C';
        } else if (score >= 60 && score < 70) { // score가 60 이상 70 미만
            grade = 'D';
        } else { 
            grade = 'F';
        // 유효하지 않은 점수 입력 시
        
        	System.out.println("잘못된 점수입니다. 0에서 100 사이의 값을 입력하세요.");
            scanner.close();
            return; // 프로그램 종료
        }

        System.out.println("학점은 " + grade + "입니다.");
        scanner.close();
    }
}
