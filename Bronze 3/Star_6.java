import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        for(int i = 1 ; i <= A; i++) {

            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = (2*A)-(i*2-1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
