import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int K = scan.nextInt();

        for(int i=1;i<=N; i++){
            if(N%i==0){
                K--;
            }
            if(K==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}

/*    int A = scan.nextInt();
    int B = scan.nextInt();

    int [] arr = new int[A+1];

    for(int i = 1; i <=A; i++){
        if(A%i==0){
            arr[i]=i;
            }
        }
    System.out.println(arr[B]);
    }
}

 */