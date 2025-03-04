//import java.util.Scanner;

//public class largest {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        //find largest of 3 numbers
////        if(a>b & a>c){
////            System.out.println(a);
////
////        }
////        else if(b>a & b>c){
////            System.out.println(b);
////
////        }
////        else{
////            System.out.println(c);
////        }
////
////        int max=0;
////        if(a>b){
////            max=a;
////        }
////        else{
////            max=b;
////        }
////        if(c>max)
////        System.out.println(max);
//        int max =Math.max(c,Math.max(a,b));
//        System.out.println(max);
//
//
//
//
//    }
//}

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter integers to find the largest number. Enter 0 to finish:");
//
//
//        int number;
//        int largest=0; // Start with the smallest possible value
//
//        while (true) {
//            number = scanner.nextInt();
//            if (number == 0) {
//                break;
//            }
//            if (number > largest) {
//                largest = number;
//            }
//        }
//        System.out.println(largest+" is largest");
//
//
//        scanner.close();




        //largest in array
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();

        }
        int largest=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println(largest);
    }
}
