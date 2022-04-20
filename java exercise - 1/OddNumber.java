import java.util.Scanner;
public class OddNumber {
    public static void odd(int n){
        System.out.println("Odd numbers for 1 to "+n+" are: ");
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        odd(n);
    }
}

