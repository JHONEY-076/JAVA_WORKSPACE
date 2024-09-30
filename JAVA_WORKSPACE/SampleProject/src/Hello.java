
public class Hello { //public=> 누구나 쓸수 있게 ,  private=>사적 ,, 클래스 
   
   public static int sum(int n,int m) { // 메소드(함수)
      
      return n+m;
   }
   
   
   
   public static void main(String []args) {  // main 메소드(함수)
      int i=20;
      
      int s;
      
      char a;
      
      s=sum(i,10); //sum 메소드 호출 
      a='?';
      System.out.println(a);    // 문자 '?' 화면 출력
      System.out.println("Hello "); // 'Hello" 문자열 화면 출력
      System.out.println(s);   // 정수 s  값 화면 출력
      
   }
      
   
}