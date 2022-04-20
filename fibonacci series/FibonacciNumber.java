import java.util.Scanner;
public class FibonacciNumber {
    public static void fibonacci(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("fibonacci series till "+ n);
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; ++i) {
            System.out.print(a + ",");
            int c = a + b;
            a = b;
            b = c;
            // System.out.print(c);
        }
    }
    public static void main(String[] args) {
        fibonacci();
    }
}
