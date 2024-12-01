import java.util.*;

public class ex7_1 {

	public static void main(String[] args) {

		HashMap <String,Integer> h =new HashMap <String,Integer>();
		System.out.println("*** 마일리지 관리 프로그램입니다.***");
		
		Scanner scanner= new Scanner(System.in);
		
		
		while(true) {
			System.out.print("이름과 마일리지>>");
			String name= scanner.next();
			if(name.equals("그만")) {
				break;
			}
			
			int score= scanner.nextInt();
			
			if(h.containsKey(name)) {
				h.put(name,h.get(name)+score);
			}
			else {
			
			h.put(name, score);
			}
}
		String topCustomer="";
		int topScore=0;
		
		Set<String>keys=h.keySet();
		Iterator<String>it=keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			int score=h.get(name);
			
			System.out.print("("+name+":"+score+")");
			
			if(score>topScore) {
				topScore=score;
				topCustomer=name;
			}
		}
		
		System.out.println("\n가장 마일리지가 높은 고객은 "+topCustomer+"입니다");
		
    }
}
