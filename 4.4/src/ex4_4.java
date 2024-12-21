public class ex4_4 {

    private int arr[] = new int[10];
    private int nextIndex = 0;

    public void put(int n) {
        if (nextIndex < arr.length) {
            this.arr[nextIndex] = n;
            this.nextIndex++; 
        }
    }

    public void showAll() {
        System.out.println("***** 저장된 데이터 모두 출력 *****");
        for (int i = 0; i < nextIndex; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public double getAvg() {
     
        int sum = 0;
        for (int i = 0; i < nextIndex; i++) { 
            sum += arr[i];
        }
        return (double) sum / nextIndex; 
    }

    public static void main(String[] args) {
        ex4_4 avg = new ex4_4();

        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.println("평균은 " + avg.getAvg());
    }
}