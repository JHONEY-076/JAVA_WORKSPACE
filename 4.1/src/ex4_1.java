public class ex4_1 {

	public String name; //필드선언
	public int inch;
	public int price;
	
	
	public ex4_1(String n,int i, int p) { // 매개 변수를 가진 생성자
		name=n;	//매개 변수로 필드 초기화(생성자는 name,inch,price 필드초기화)  
		inch=i;
		price=p;
	}
	
	// 초기화된 필드로 해당 문장을 출력하는 함수
	public void show() {
		System.out.println(name+"에서 만든 "+price+"만원짜리의 "+inch+"인치 "+"TV"); 
	}
	
	
	public static void main(String[] args) {
	
		ex4_1 tv=new ex4_1("Samsung",50,300);	//레퍼런스 변수인 tv에 ex4_1이라는 객체 생성
												//이름을 Samsung으로, 인치를 50으로, 가격을 300으로 초기화
		tv.show();
	}
		
}

