
import java.util.Scanner;
//public class fibonacci{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a=0,b=1,c=0;
//        int count=0;
//        while(count<n){
//            System.out.println(a);
//            c=a+b;
//            a=b;
//            b=c;
//            count++;
//
//
//
//        }
//        System.out.println(c);
//    }
//}
//public class fibonacci{
//    //using iteration
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n=sc.nextInt();//no.of fibonacci no.s to generate
//        int a=0,b=1;
//        for(int i=0;i<n;i++){
//            System.out.println(a+" ");
//            int temp=a+b;//0+1  2   3   5
//            a=b;//a=1   1   2
//            b=temp;//b=1    2   3
//        }
//    }
//}

public class fibonacci{
    //fibo upto a number i.e maxnum=n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maxnum: ");
        int maxnum=sc.nextInt();
        System.out.println("fibonacci Series upto "+maxnum+":");
        int a=0,b=1;
        while(a<=maxnum){
            System.out.println(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }

    }
}
