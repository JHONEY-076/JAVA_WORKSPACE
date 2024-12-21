import java.util.Scanner;
public class ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("연산 입력>>");
		double num1=scanner.nextDouble();
		
		String operator=scanner.next();
		
		double num2=scanner.nextDouble();
		
//		if(operator.equals("더하기")) {
//			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1+num2));
//			
//		}
//		else if(operator.equals("빼기")) {
//			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1-num2));
//		}
//		
//		else if(operator.equals("곱하기")) {
//			
//			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1*num2));
//		}
//		else if(operator.equals("나누기")) {
//			if(num2!=0) {
//			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1/num2));
//			}
//			else {
//				System.out.print("0으로 나눌수 없습니다.");
//			}
//		}
//		else {
//			System.out.print("사칙연산이 아닙니다.");
//		}
		
		switch(operator) {
		
		case "더하기":
			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1+num2));
			break;
			
		case "빼기":
			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1-num2));
			break;
			
		case "곱하기":
			System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1*num2));
			break;
			
		case "나누기":
			if(num2!=0) {
				System.out.print(num1+" "+operator+" "+ num2+"의 계산 결과는 "+(num1/num2));
				}
				else {
					System.out.print("0으로 나눌수 없습니다.");
			    }
			break;
		default:
			System.out.print("사칙연산이 아닙니다.");
			break;
		}
		
		scanner.close();
	}

}