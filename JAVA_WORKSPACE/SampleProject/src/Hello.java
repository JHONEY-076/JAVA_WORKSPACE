
public class Hello { //public=> 누구나 쓸수 있게 ,  private=>사적 ,, 클래스 
   
   public static int sum(int n,int m) { // 메소드(함수)
      
      return n+m;
   }
   
   
   
   public static void main(String []args) {  // main 메소드(함수)
	   int x=2,y=10,z=0;
	   z= x++*2+--y-5+x*(y%2);
      
	   System.out.print(z);
   }
      
   
}