import java.io.*;
import java.util.*;
public class ex8_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");

        // 첫 번째 파일 이름 입력받기
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String firstFileName = scanner.nextLine();

        // 두 번째 파일 이름 입력받기
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String secondFileName = scanner.nextLine();

        // 경로 설정
        String currentDir = "D:\\java-workspace\\JAVA_WORKSPACE\\8.5";
        String prefix = "src/";

        String firstFilePath = firstFileName;
        String secondFilePath = secondFileName;
        
     // 경로 보정
        if (!firstFileName.contains(currentDir)) {
        	firstFilePath = prefix.concat(firstFileName);
        } else {
            System.out.print("전체 경로 입력됨");
        }
        
        if (!secondFileName.contains(currentDir)) {
            secondFilePath = prefix.concat(secondFileName);
        } else {
            System.out.print("전체 경로 입력됨");
        }

        
        File f1 = new File(firstFilePath);
        File f2 = new File(secondFilePath);

        // 원래 입력한 파일명 출력
        System.out.println(firstFileName + "와 " + secondFileName + "를 비교합니다.");

        try {
            boolean result;
            // 텍스트 파일인지 확인 (예: .txt 확장자 비교)
            if (firstFileName.endsWith(".txt") && secondFileName.endsWith(".txt")) {
                result = compareTextFiles(f1, f2);  // 텍스트 파일 비교
            } else {
                result = compareBinaryFiles(f1, f2);  // 바이너리 파일 비교
            }

            // 비교 결과 출력
            if (result) {
                System.out.println("파일이 같습니다.");
            } else {
                System.out.println("파일이 서로 다릅니다.");
            }
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다: " + e.getMessage());
        }

        scanner.close();
    }

    // 텍스트 파일 비교 메서드
    public static boolean compareTextFiles(File file1, File file2) throws IOException {
        

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line1, line2;
            int lineNumber = 0;

            while ((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null) {
                lineNumber++;
                if (!line1.trim().equals(line2.trim())) {
                    return false;
                }
            }
            return true;
        }
    }

    // 바이너리 파일 비교 메서드
    public static boolean compareBinaryFiles(File file1, File file2) throws IOException {

        try (InputStream is1 = new FileInputStream(file1);
             InputStream is2 = new FileInputStream(file2)) {

            int byte1, byte2;
            while ((byte1 = is1.read()) != -1 && (byte2 = is2.read()) != -1) {
                if (byte1 != byte2) {
                    return false;
                }
            }
            return true;
        }

	}

}
