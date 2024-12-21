import java.util.*;


public class ex7_1 {

	public static void main(String[] args) {
		
		Vector <Integer> v=new Vector<Integer>();
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("정수 입력(-1이면 입력 끝)>>");
		int n=scanner.nextInt();
		
		while(n!=-1) {
			v.add(n);
			n=scanner.nextInt();
		}
		
		int min= v.get(0);
		Iterator <Integer> it=v.iterator();
		while(it.hasNext()) {
			
			int num=it.next();
			if(num<min) {
				min=num; 
			}
			
		}
		
		
		
		
		
		
//		for(int i=1;i<v.size();i++) {
//			
//			if(v.get(i)<min) {
//				min=v.get(i);
//			}
//			
//		}
//		
		scanner.close();
		System.out.println("제일 작은 수는 "+min);
		
		
		
	}
}
