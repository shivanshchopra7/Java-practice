import java.util.Scanner;

public class forLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //pq1 print hello world 5 times
        // for(int i=0; i<5; i++){
        //     System.out.println("Hello World");
        // }

        //pq2 print numbers from 0 to 10
        // for(int i=0; i<=10; i++){
        //     System.out.println(i);
        // }

        //pq3 print sum of first n natural numbers 
        // System.out.print("Enter number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        //pq 4 print number of table input by user
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }

    }
}
