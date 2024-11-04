import java.util.Scanner;

public class ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a= new Scanner(System.in);
		int arr[]=new int[10];
		
		
		System.out.print("양의 정수 10개 입력>>");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=a.nextInt();
		}
		
		
		System.out.print("3의 배수는..");
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
		
		
		
	}

}
