
public class ex3_7 {
	public static void main(String[] args) {
		
		int a[] = new int[10];
		double sum=0;
		for(int i=0;i<10;i++) {
			a[i]=(int)(Math.random()*9)+11;
			sum+=a[i];
		}
		System.out.print("랜덤한 정수들...");
		
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("평균은 ");
		System.out.print(sum/10);
		
	}
	
	
}
