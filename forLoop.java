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
        // System.out.print("Enter number : ");
        // int n = sc.nextInt();
        // for(int i=1; i<=10; i++){
        //     System.out.println(n*i);
        // }


        //pq5 print even numbers till n
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     if(i%2 == 0){
        //         System.out.println(i);
        //     }
        // }


        //pq 6  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
	 
int choice;
do {
    System.out.println("Enter 1 to input marks or 0 to stop: ");
    choice = sc.nextInt();
    
    if (choice == 1) {
        System.out.println("Enter student's marks (out of 100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("This is Good");
        } else if (marks >= 60 && marks <= 89) {
            System.out.println("This is also Good");
        } else if (marks >= 0 && marks <= 59) {
            System.out.println("This is Good as well, because marks don’t matter but our effort does.");
        } else {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
    } else if (choice != 0) {
        System.out.println("Invalid choice! Please enter 1 or 0.");
    }
} while (choice != 0);

System.out.println("Program terminated.");

    }


    
}
