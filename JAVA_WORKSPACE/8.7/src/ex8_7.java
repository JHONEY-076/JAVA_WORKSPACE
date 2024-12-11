import java.io.*;

public class ex8_7 {

    public static void main(String[] args) {
        File src = new File("D:\\workspace\\JAVA_WORKSPACE\\8.7\\a.jpg");
        File dest = new File("D:\\workspace\\JAVA_WORKSPACE\\8.7\\b.jpg");
        
        
        
        
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            	
            System.out.println( src.getName() + "를 " + dest.getName() + "로 복사합니다.");
            System.out.println("10%마다 *를 출력합니다.");
            
            long fileSize = src.length(); 
            long Read = 0; 
            int c;
            int progress = 0; 

            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
                Read++;

                int newProgress = (int) (Read * 10 / fileSize); 
                if (newProgress > progress) { 
                    System.out.print("*");
                    progress = newProgress;
                }
            }

            fi.close();
            fo.close();

            
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
