import java.util.*;
public class ex7_5 {

	public static void main(String[] args) {
		System.out.println("*** 마일리지 관리 프로그램입니다. ***");
		
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		while(true) {
			
					
			System.out.print("이름과 마일리지>>");
			String name= scanner.next();
			if(name.equals("그만"))
				break;	
			
			int score= scanner.nextInt();
			
			if(h.containsKey(name)) {
				h.put(name,h.get(name)+score);
			}
			else {
				h.put(name, score);
			}
			
		}
		
		
		Set<String>keys=h.keySet();
		Iterator<String> it= keys.iterator();
		
		int topscore=0;
		String topCustomer=null;
		
		while(it.hasNext()) {
			
			String n=it.next();
			int s=h.get(n);
			
			System.out.print("("+n+":"+s+")");
			
			if(s>topscore) {
				topscore=s;
				topCustomer=n;
			}
			
		}
		
		System.out.println("\n가장 마일리지가 높은 고객은 "+ topCustomer+"입니다.");
		
		System.out.print("프로그램을 종료합니다.");
	}

}
