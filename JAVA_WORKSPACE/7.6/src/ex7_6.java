import java.util.*;
public class ex7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Integer> h=new HashMap<String,Integer>();
		Scanner scanner= new Scanner(System.in);
		
		
		
		System.out.println("*** 명품 은행에 오신 것을 환영합니다. ***");
		
		while(true) {
			
			System.out.print("입금:1, 출금:2, 조회:3, 전체조회:4, 종료:5>>"); 
			int num=scanner.nextInt();
			 if(num==5)
				 break;
			 
			
			switch(num) {
			
			case 1:
				System.out.print("계좌명과 액수>>");
				String name=scanner.next();
				int money=scanner.nextInt(); 
			
				if(h.containsKey(name)) {
					h.put(name, h.get(name)+money);
				}
				else {
					h.put(name, money);
				}
				break;
			
			case 2:
				System.out.print("계좌명과 액수>>");
				name= scanner.next();
				money=scanner.nextInt();
				
				if (h.containsKey(name)) {
                    int save = h.get(name) - money;
                    if (save < 0) {
                        System.out.println("잔액이 부족하여 출금할 수 없음!!");
                    } else {
                        h.put(name, save);
                    }
                } else {
                    System.out.println("존재하지 않는 계좌입니다.");
                }
                break;
				
			case 3:
				System.out.print("계좌명>>");
				name=scanner.next();
				 
				if (h.containsKey(name)) {
				        System.out.println("(" + name + ":" + h.get(name) + "원)");
				    } else {
				        System.out.println("존재하지 않는 계좌입니다.");
				    }
				    break;
				
			case 4:
				Set<String>keys=h.keySet();
				Iterator<String>it=keys.iterator();
				
				while(it.hasNext()) {
					name=it.next();
					money=h.get(name);
					
					System.out.print("("+name+":"+money+"원"+")");
					
				}
				System.out.println();
				break;
			
			
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			
			}
			
				
			
		}
	
		System.out.print("프로그램을 종료합니다.");	
		scanner.close();
	}
	

}
