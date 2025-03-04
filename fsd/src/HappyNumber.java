/*given a positive integer check whether it is a happy number or not
input:
1234
output:
not a happy number

a number is said to be happy if product of last two digits==sum of remaining digits

 */
import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int num=sc.nextInt();
        if(num<10) {
            System.out.println(-1);
            return;
        }
        boolean result=isHappyNumber(num);
        System.out.println(result);


    }
    public static boolean isHappyNumber(int n){
        //logic

            int lasttwodigits=n%100;//for last two digits
            int product=(lasttwodigits/10)*(lasttwodigits%10);
            n=n/100;
            int sum=0;
            while(n!=0){
                sum=sum+(n%10);
                n=n/10;
            }
            return sum==product;



    }
}
