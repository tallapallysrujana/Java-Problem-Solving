/*
given apositive integer nswap the first digit with the last digit print -1 idf it is a single digit
 */
import java.util.Scanner;
public class swapfirstlast {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();//2456
        if(num<10){
            System.out.println(-1);
        }
        int result=swap(num);
        System.out.println(result);

    }
    public static int swap(int n){
        int result=0;
        int lastnum=n%10;//6
        int digitscount=(int)Math.log10(n);//no.of digits is log10(n)+1   //4
        int firstnum=n/(int)Math.pow(10,digitscount);//2
        n=n%(int)Math.pow(10,digitscount);//remove first digits we will be left with others digits 2456%1000=456
        //now we need middle number so we use
        System.out.println(lastnum);
        System.out.println(firstnum);
        System.out.println(n);
        int middlepart=n/10;
        System.out.println(middlepart);
        result=(lastnum*((int)Math.pow(10,digitscount)))+(middlepart*10)+firstnum;
        return result;

    }
}



/*
import java.util.Scanner;

public class SwapFirstLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();

        // Check if the number has at least two digits
        if (numberStr.length() < 2) {
            System.out.println("The number must have at least two digits.");
            return;
        }

        // Get the first and last digits
        char firstDigit = numberStr.charAt(0);
        char lastDigit = numberStr.charAt(numberStr.length() - 1);

        // Create the new number string
        String swappedNumberStr = lastDigit + numberStr.substring(1, numberStr.length() - 1) + firstDigit;

        // Output the result
        System.out.println("Number after swapping first and last digits: " + swappedNumberStr);

        scanner.close(); // Close the scanner
    }
}

 */
