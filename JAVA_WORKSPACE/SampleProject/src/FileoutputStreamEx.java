import java.io.*;


public class FileoutputStreamEx {

	public static void main(String[] args) {
		byte b[]= {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Temp\\hangul.txt");
			
			for(int i=0;i<b.length;i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException e){
			System.out.println("경로를 확인할 수 없습니다.");
			
			return;
			
		}
		
		System.out.println("파일을 저장하였습니다.");
		
		
		
		
		
		
	}

}
