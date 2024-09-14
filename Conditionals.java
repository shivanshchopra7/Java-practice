//if else pq1 Adult or not

import java.util.Scanner;

// class Conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
      
//        if(a > 18){
//            System.out.println("You are an adult");
//        } else {
//            System.out.println("You are not an adult");
//        }
//     }
// }


//pq2 even or odd
// class Conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
      
      
//        if(a % 2 == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//     }
// }


//pq3 elseif
class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a");
        int a = sc.nextInt();
        System.out.println("Please enter b");
      
      int b = sc.nextInt();
      
       if(a == b){
           System.out.println("Equal");
       } else if(a > b) {
            System.out.println("a is greater");
           } else {
            System.out.println("b is greater");
           }
       }
    
}