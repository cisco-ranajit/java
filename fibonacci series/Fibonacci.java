
import java.util.Scanner;
public class Fibonacci {
    public static int FibonacciSerise(int n){
        if(n == 0){
            return 0;
        }if(n == 1 || n ==2){
            return 1;
        }
        return FibonacciSerise( n - 2) + FibonacciSerise(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0; i < number; i++){
            System.out.print(FibonacciSerise(i)+" ");
        }
    }
}
