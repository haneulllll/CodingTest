import java.util.Scanner;

public class No_1654 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[K];
        long max = 0;  // int가 아니라 long을 사용

        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        max ++;

        long min = 1;  // int가 아니라 long을 사용
        long mid = 0;  // int가 아니라 long을 사용

        while (min < max) {
            mid = (max + min) / 2;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min-1);
        sc.close();
    }
}
