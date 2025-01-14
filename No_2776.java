import java.util.Scanner; // Scanner을 사용하기 위해 import
import java.util.HashSet;  // 시간복잡도를 줄이기 위해 배열 대신 HashSet 사용
import java.io.*;
public class No_2776 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 사용

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            HashSet<Integer> correctAnswer = new HashSet<>();
            for (int i = 0; i < N; i++) {
                correctAnswer.add(sc.nextInt());
            }

        // 두 번째 배열 입력 및 결과 출력
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int value = sc.nextInt();
            if (correctAnswer.contains(value)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
    }

    sc.close(); // Scanner 닫기
    bw.close();
}
}