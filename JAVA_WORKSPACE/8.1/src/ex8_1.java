import java.io.*;
import java.util.*;

public class ex8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        
        try {
            fout = new FileWriter("c:\\temp\\phone.txt"); 
            
            System.out.println("전화번호 입력 프로그램입니다.");
            while (true) {
                System.out.print("이름 전화번호 >> ");
                String name = scanner.next(); 
                
                if (name.equals("그만")) { // 종료 조건
                    System.out.println("c:\\temp\\phone.txt에 저장하였습니다.");
                    break;
                }
                
                String phoneNumber = scanner.next(); 
                String merge = name + " " + phoneNumber; 
                
                fout.write(merge); 
                fout.write("\r\n"); 
            }
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        } 
        
        scanner.close(); 
    }
}
