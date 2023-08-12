import java.util.Scanner;

public class Fiboncci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int t=b;
            b=b+a;
            a=t;
            count++;
        }
        System.out.println(b);
    }
}
