import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []mat = new int[n];
        int sum = 0, min = 0, count = 0;
        for(int i = 0 ; i < n ; i++ )
            mat[i] = sc.nextInt();

            for (int j = 0; j < n; j++) {
                sum = 0;
                for (int k = j; k < n; k++) {
                    sum = sum + mat[k];
                    if (sum < 0)
                        count++;
                }
            }
            System.out.println(count);

    }
}
