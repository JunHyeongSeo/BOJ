import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int x=7;
        int num[] = new int[x];
        int sum=0;
        int min = 100;


        for(int i=0; i<x; i++){
            num[i] = scan.nextInt();
            if(num[i] %2==1){
                sum+=num[i];
                min = Math.min(min,num[i]);
            }
        }

        if(sum==0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}