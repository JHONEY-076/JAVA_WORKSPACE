import java.util.*;


public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> h=new HashMap<String,Integer>();
		Scanner scanner=new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
		
			System.out.print("이름과 점수를 입력하시오>>");
			
			String name=scanner.next();
			int score=scanner.nextInt();
			
			h.put(name, score);
			
		}
		
		
		
		System.out.println("HashMap의 요소의 개수:"+h.size());
		
		Set<String>keys=h.keySet();
		
		Iterator<String> it= keys.iterator();
		
		while(it.hasNext()) {
			
			String name=it.next();
			int score= h.get(name);
			
			System.out.println(name+":"+score);			
		}
		
		
		
	}

}
