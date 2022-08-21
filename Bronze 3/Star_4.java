import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

// i=줄,j=별
        for(int i=0; i<A; i++) {
            for (int j = A-i; j < A ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k<A; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}