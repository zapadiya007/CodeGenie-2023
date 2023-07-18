import java.util.Scanner;

public class percentile_score {

    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        float t = 7;
        int arr[] = { 800, 300, 950, 760, 680, 490, 640 };
        int s = 760;
        float cnt = 0;

        for (int i = 0; i < t; i++) {
            if (arr[i] < s) {
                cnt++;
            }
        }

        float p = (cnt / t) * 100;
        System.out.printf("%.2f", p);

    }
}