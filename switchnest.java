import java.util.Scanner;

public class switchnest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit=sc.next();
       // if(fruit.equals("mango"))
       // String a = "Kunal";
       // String b = "Kunal";
        //System.out.println(a==b);
//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("please enter valid fruit");
                //instead use
                /*
                case "Mango" -> System.out.println("king of fruits");
                here no need of break statement simple do this works here
                 */
        }
    }
}
