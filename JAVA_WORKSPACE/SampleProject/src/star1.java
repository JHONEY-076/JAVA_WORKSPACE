
public class star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int a=1;a<=10;a+=2) {
			
			for(int b=9;b>a;b-=2) {
				System.out.print(" ");
			}
			for(int c=0;c<a;c++) {
				
				System.out.print("*");
				
			}
			System.out.print("\n");
			
		}
		
		
		
		
		
		
		
		for(int i=1; i<10;i+=2) {
			
			for(int j=0;j<i;j+=2) {
				System.out.print(" ");
			}
			
			for(int j=8;j>i;j--) {
				
				System.out.print("*");
				
			}

			System.out.println();
			
		}
	
		
		
		
	}

}
