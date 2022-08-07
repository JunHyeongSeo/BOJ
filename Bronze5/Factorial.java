import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int sum=1;
        for(int i=1;i<=A;i++){
            sum=sum*i;

        }
        System.out.println(sum);

    }
}