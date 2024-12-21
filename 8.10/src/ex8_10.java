import java.io.*;
import java.util.*;
public class ex8_10 {

	public static void main(String[] args) {
		
		try {
		FileReader fin=new FileReader("D:\\workspace\\JAVA_WORKSPACE\\8.10\\최박사 010-2222-3333.txt");
		BufferedReader bout=new BufferedReader(fin);
		Scanner scanner= new Scanner(System.in);
		HashMap<String,String>h=new HashMap<String,String>();
		
		String line;
		while((line=bout.readLine())!=null) {
			String []data=line.split(" ");
			if(data.length==2) {
				h.put(data[0], data[1]);
			}
		}
		
		System.out.println("총 "+h.size()+"개의 파일을 읽었습니다.");
		
		while(true) {
			System.out.print("이름>>");
			String name= scanner.next();
			
			if(name.equals("그만")) {
				break;
			}
			if(h.containsKey(name)) {
				System.out.println(h.get(name));
			}
			else {
				System.out.println("찾는 이름이 없습니다.");
			}
			
		}
		fin.close();
		bout.close();
		scanner.close();
		
		}catch(IOException e) {
			
		System.out.println("파일의 경로를 읽을 수 없음.");	
			
		}
	}

}
