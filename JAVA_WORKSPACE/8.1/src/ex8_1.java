import java.io.*;
import java.util.*;

public class ex8_1 {

	public static void main(String[] args) {
		
		FileWriter fout=null;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("전화번호 입력 프로그램입니다.");
		
		
		
		try {
			
			fout=new FileWriter("C:\\Temp\\phone.txt");
			
			while(true) {
				
				System.out.print("이름 전화번호 >>");
				
				String name=scanner.next();
				
				if(name.equals("그만")) {
					System.out.println("파일을 저장하였습니다.");
					break;
				}
				
				String PhoneNumber= scanner.next();
				String merge= name+" "+PhoneNumber;
				
				fout.write(merge);
				fout.write("\r\n");
				
			}
			
			fout.close();
			
			
		}catch(IOException e) {
			
			System.out.println("입출력 오류");
			
		}
		
	
		scanner.close();
		
		
	}

}
