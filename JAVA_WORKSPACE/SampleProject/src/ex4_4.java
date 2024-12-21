public class ex4_4 {

    private int[] a = new int[10]; // 크기 10의 배열 선언
    private int nextIndex = 0; // 다음에 저장할 위치 인덱스

    public ex4_4() {
        // 기본 생성자
    }

    public void put(int n) {
        if (nextIndex < a.length) {
            a[nextIndex] = n;
            nextIndex++;
        } else {
            System.out.println("배열이 가득 찼습니다! 더 이상 값을 추가할 수 없습니다.");
        }
    }

    public void showAll() {
        System.out.println("*** 저장된 데이터 모두 출력 ***");
        if (nextIndex == 0) {
            System.out.println("배열에 저장된 데이터가 없습니다.");
        } else {
            for (int i = 0; i < nextIndex; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public double getAvg() {
        if (nextIndex == 0) {
            System.out.println("평균을 계산할 데이터가 없습니다.");
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < nextIndex; i++) {
            sum += a[i];
        }
        return sum / nextIndex;
    }

    public static void main(String[] args) {
        ex4_4 avg = new ex4_4();

        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.print("평균은 " + avg.getAvg());
    }
}
