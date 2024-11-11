
public class Array_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // 3차원 배열 선언 및 초기화
        int[][][] array3D = new int[2][3][4]; // 2 x 3 x 4 크기의 배열

        // 배열에 값 할당
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = i + j + k; // 간단한 값으로 초기화
                }
            }
        }

        // 배열의 값 출력
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print("array3D[" + i + "][" + j + "][" + k + "] = " + array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
		
	}

}
