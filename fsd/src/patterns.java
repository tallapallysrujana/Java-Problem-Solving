import java.util.Scanner;
//mirrored solid hollow traingle square diamond
public class patterns {
    static void square(int n){
        for(int j=1;j<=n;j++){
            for(int i=1;i<=n;i++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
    static void increasing(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
    static void decreasing(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }

    static void revdec(int n){
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<i;j++){
                System.out.print(" "+" ");
                for( j=i;j<=n;j++){
                System.out.print("*"+" ");
                System.out.println();}

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        square(n);
        increasing(n);
        System.out.println();
        decreasing(n);
        revdec(n);

    }
}
