import java.util.Scanner;
public class ex2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("여행지>>");
		String travel_place=scanner.nextLine();
		
		System.out.print("인원수>>");
		int person=scanner.nextInt();
		
		System.out.print("숙박일>>");
		int sleep_day=scanner.nextInt();
		
		System.out.print("1인당 항공료>>");
		int plane_money=scanner.nextInt();
		
		System.out.print("1방 숙박비>>");
		int hotel_money=scanner.nextInt();
		
		int num_rooms=(int)Math.ceil(person/2.0);
		
		int plane_total= plane_money*person;
		
		int hotel_total=hotel_money*num_rooms*sleep_day;
		
		int total_money=plane_total+hotel_total;
		
		
		
	
		
		System.out.println(person+"명의 "+travel_place +" "+sleep_day+"박 "+"5일 "+"여행에는 방이 "+num_rooms+"개 "+"필요하며 "+"경비는"+" "+total_money+"입니다.");
		
		
		
		scanner.close();
	}

}