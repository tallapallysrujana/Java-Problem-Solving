
import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        //Scanner sc= new Scanner(System.in);

        //when we have to do a same task in loop like for many times printing the same
        /*
        syntax for for loop
        for(initialisation;condition;increment/decrement){
        //body
        }
         */
        //Q:Print numbers from 1 to 5
        //for(int i=1;i<=5;i++)
       // System.out.println(i);
        //i++ i+= mean the same
        //print numbers from 1 to n
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int num=1;num<=n;num++){
//            System.out.println(num);
//        }
     /*
     while loop:
     syntax: while(condition){
     //body
     }
      */
//        int num=1;
//        while(num<=5){
//            System.out.println(num);
//          //  num++;
//            num+=1;
//        }

//if we donot know how many times the loop is going to run then we use while loop
        //and when we know how many times the loop is gonna run then we use for loop
        /*
        do while:
        syntax:
        do{
        }while(condition);
         */  //do is first executed then checks while condition
//        int n=1;
//        do{
//            System.out.println(n);
//            n++;
//        }while(n<=5);
        int n=1;
        do{
            System.out.println("Hello");

        }while(n!=1);

    }
}
