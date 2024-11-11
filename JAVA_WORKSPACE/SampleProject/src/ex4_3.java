import java.util.Scanner;
public class ex4_3 {

	 private String name;
	 private int java;
	 private int web;
	 private int os;
	
	public ex4_3(String name,int java, int web, int os) {
		this.name=name;
		this.java=java;
		this.web=web;
		this.os=os;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAverage() {
		return (java+web+os)/3;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름,자바,웹프로그래밍,운영체제 순으로 점수 입력>>");
		String name=scanner.next();
		int java=scanner.nextInt();
		int web=scanner.nextInt();
		int os=scanner.nextInt();
		
		ex4_3 st=new ex4_3(name,java,web,os);
		System.out.print(st.getName()+"의 평균은 "+st.getAverage());
		scanner.close();
		

	}

}

//static을 이용한 방법

//import java.util.Scanner;
//
//public class Ex4_3 {
//
//    private static String name;
//    private static int java;
//    private static int web;
//    private static int os;
//
//    public Ex4_3(String name, int java, int web, int os) {
//        Ex4_3.name = name;
//        Ex4_3.java = java;
//        Ex4_3.web = web;
//        Ex4_3.os = os;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public static double getAverage() {
//        return (java + web + os) / 3.0;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>> ");
//        name = scanner.next();
//        java = scanner.nextInt();
//        web = scanner.nextInt();
//        os = scanner.nextInt();
//
//        Ex4_3 st = new Ex4_3(name, java, web, os);
//        System.out.print(st.getName() + "의 평균은 " + st.getAverage());
//        scanner.close();
//    }
//}
