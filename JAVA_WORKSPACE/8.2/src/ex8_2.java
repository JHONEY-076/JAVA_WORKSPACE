import java.io.*;

public class ex8_2 {

	public static void main(String[] args) {
		FileReader fin=null;
		try {
			System.out.println("c:\\temp\\phone.txt를 출력합니다.");
			fin= new FileReader("c:\\temp\\phone.txt");
			
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
				
			}
			fin.close();
			
		}catch(IOException e) {
			
			System.out.println("입출력 오류");
		}
		

	}

}
