import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId=sc.nextInt();
        String department=sc.next();
        switch(empId){
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp num 3");
                switch(department){
                    case"IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");

                }
            default:
                System.out.println("Enter correct empId");
        }
    }

}
