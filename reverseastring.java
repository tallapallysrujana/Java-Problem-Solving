//public class reverseastring {
//    public static void main(String[] args) {
//        int num=284795;
//        int ans=0;
//        while(num>0){
//            int rem=num%10;
//            num/=10;
//            ans=ans*10+rem;
//        }
//        System.out.println(ans  );
//    }
//}
import java.util.Scanner;
public class reverseastring{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int ans=0;
//        while(num>0){
//            int rem=num%10;
//            num=num/10;
//            ans=ans*10+rem;
//        }
//        System.out.println(ans);
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        StringBuilder reversed=new StringBuilder(str);
//        reversed.reverse();
//        System.out.println("Reversed string: "+reversed.toString());


//        String reversed=" ";
//        for(int i=str.length()-1;i>=0;i--){
//            reversed=reversed+str.charAt(i);
//
//        }
//        System.out.println("Reversed string: "+reversed);
        String reversed=reverse(str);
        System.out.println(reversed);


    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
