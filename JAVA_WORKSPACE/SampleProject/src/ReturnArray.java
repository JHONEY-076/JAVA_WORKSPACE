import java.util.Scanner;
public class ReturnArray {

	static int[] makeArray(){
		int temp[]=new int[4];
		
		Scanner a=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=a.nextInt();
		}
		return temp;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[];
		
		
		arr=makeArray();
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	
}
