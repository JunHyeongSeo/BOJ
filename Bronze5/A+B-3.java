import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();



        for (int i = 1; i <= A; i++) {

            int B = scan.nextInt();
            int C = scan.nextInt();
            int S = B+C;
            System.out.println(S);

        }
    }
}