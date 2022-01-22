import java.util.*;
public class LeftTrianglePattern {
    int n;
    void input(){
        Scanner input  = new Scanner(System.in);
        System.out.println("enter a number");
        n = input.nextInt();
    }
    void show(){
        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }

            for(int j=0; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        LeftTrianglePattern ob = new LeftTrianglePattern();
        ob.input();
        ob.show();
    }
}
