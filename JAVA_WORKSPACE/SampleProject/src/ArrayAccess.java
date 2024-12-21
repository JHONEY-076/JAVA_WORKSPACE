import java.util.Scanner;

public class ArrayAccess {

	public static void main (String [] args) {
		
		
		int x=2,y=10,z=0;
		
		z=x++*2+--y-5+x*(y%2);
		
		
		System.out.println(z);
		
		
		Scanner scanner=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		int max=0;
		
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0;i<arr.length;i++) {
			
			 arr[i]=scanner.nextInt();
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		}
		System.out.print("가장 큰수는 "+max+" 입니다");
		
		scanner.close();
		
	}
	
}
