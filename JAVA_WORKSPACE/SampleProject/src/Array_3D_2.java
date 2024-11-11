
public class Array_3D_2 {

	 public static void main(String[] args) {
	        // 3차원 배열 선언 및 생성
	        int[][][] array3D = {
	            {
	                {1, 2},
	                {5, 6},
	                {9, 10}
	            },
	            {
	                {13, 14},
	                {17, 18},
	                {21, 22}
	            }
	        };

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
