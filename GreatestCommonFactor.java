import java.util.*;
public class GreatestCommonFactor {
    int a , b ;
    void input(){
        System.out.println("enter a first number");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("enter a second number");
        b = input.nextInt();
    }
    void show(){
        int number = 0;
        for( int i = 1; i <= a && i<= b; i++){
            if( a % i == 0 && b % i == 0 )
                number = i;
        }
        System.out.println("greates common factor of "+ a + " and "+ b + " is " + number);
    }

    public static void main(String[] args) {
        GreatestCommonFactor ob = new GreatestCommonFactor();
        ob.input();
        ob.show();
    }
}
