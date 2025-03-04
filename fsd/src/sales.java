import java.util.Scanner;

public class sales {
    public static void main(String[] args) {

    }
    static void solve(int days,int products){
        Scanner sc=new Scanner(System.in);
        int counter=1;
        for(int day=1;day<days;day++){
            int largest=Integer.MIN_VALUE;
            while(counter<=products){
                int revenue=sc.nextInt();
                largest=Math.max(largest,revenue);
                counter++;
            }
            System.out.println();
        }
    }
}
