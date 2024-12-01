import java.util.*;


public class ex7_1 {

	public static void main(String[] args) {
		Vector <Integer> v=new Vector <Integer>();
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		
		System.out.print("정수 입력(-1이면 입력 끝)>>");
		while(true) {
			 int n=scanner.nextInt();
			 if(n==-1) break;
			v.add(n);
		}
		
		if (v.isEmpty()) { 
            System.out.println("입력된 숫자가 없음.");
            scanner.close(); 
            return;
        }
		
		// Iterator <E>로 반복문 수행하기
		Iterator <Integer> it =v.iterator();
		int min= v.get(0);
		while(it.hasNext()) {
			int num=it.next();
			if(num<min) {
				min=num;	
			}
		}
	
		
		// for문으로 반복문 수행하기

//		int min=v.get(0);
//		for(int i=1;i<v.size();i++) {
//			if(v.get(i)<min) {
//				min=v.get(i);
//			}
//		}
		
		scanner.close();
		
		System.out.print("제일 작은 수는 "+min);
	}
}
