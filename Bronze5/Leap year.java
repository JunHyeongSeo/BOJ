import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        if(A%4==0){
            if(A%100==0){
               if(A%400==0){
                   System.out.println("1");
               }
               else {
                   System.out.println("0");
               }
            }
            else{
                System.out.println("1");

            }
        }
        else{
            System.out.println("0");
        }
    }
}