import java.util.Scanner;
public class switchdays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid case");

           // switch(day){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                 System.out.println("Weekday");
//                 break;
//            case 6 :
//            case 7 :
//                 System.out.println("Weekend");
//                 break;
//            switch(day){
//                case 1,2,3,4,5 -> System.out.println("Weekday");
//                case 6,7 -> System.out.println("Weekend");
//            }

        }
    }
}
