import java.util.Scanner;
public class Function {

    public static int average(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int avg =( a + b + c )/ 3;
        System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {
        average();
    }
}
