import java.util.*;
public class ex7_5 {

	public static void main(String[] args) {
		
		HashMap<String,Integer>h=new HashMap<String,Integer>();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("*** 마일리지 관리 프로그램입니다 ***");
		
			while(true) {
			
			System.out.print("이름과 마일리지>>");
			String name=scanner.next();
			
			if(name.equals("그만")) {
				break;
			}
			
			int score=scanner.nextInt();
			
			if(h.containsKey(name)) {
				h.put(name, h.get(name)+score);
				
			}
			else {
				h.put(name, score);
			}
			
		}

		int maxscore=0;
		String maxname="";
		Set<String>key=h.keySet();
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			 String name=it.next();
			 int score=h.get(name);
			
			 if(score>maxscore) {
				 maxscore=score;
				 maxname=name;
			 }
			 System.out.print("("+name+":"+score+") ");
		}
		
		System.out.println("\n가장 마일리지가 높은 고객은"+maxname+"입니다.");
		System.out.println("프로그램을 종료합니다.");
		
	}

}
