import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
     ;

        for(int p = 0; p<n; p++) {
            for(int q=0; q<p;q++) {
                System.out.print(" ");
            }
            for(int q=0; q<2*(n-p)-1;q++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for(int p = 1; p<n; p++) {
            for(int q=0; q<n-p-1;q++) {
                System.out.print(" ");
            }
            for(int q=0; q<2*p+1;q++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

}