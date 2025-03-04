import java.util.Scanner;

public class energy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        int r=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(findEnergy(x,r,n));

    }
    static int findEnergy(int x,int r,int n){
        int result=x+(r*(n-1));
        return result;
    }
}
