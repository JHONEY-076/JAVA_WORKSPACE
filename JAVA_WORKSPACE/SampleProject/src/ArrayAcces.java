import java.util.Scanner;

public class ArrayAcces {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		
		int intArray[]=new int[5];
		
		int max=0;
		int min=0;
		int sum=0;
		
		
		double average=0;
		
		
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0;i<intArray.length;i++) {
			
			intArray[i]=scanner.nextInt();
			
			while(intArray[i]<0) {
				
				intArray[i]=scanner.nextInt();
				
			}
			
			if(intArray[i]>max) {
				
				max=intArray[i];
			}
			
			if(intArray[i]<min) {
				min=intArray[i];
			}
			
			sum+=intArray[i];
			
		}
		
		average=sum/5;
		
		System.out.println("최댓값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합:"+sum);
		System.out.println("평균:"+average);

	}

}
