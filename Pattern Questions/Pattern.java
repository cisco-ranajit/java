import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("enter a singel digit number & see magic");  // *
                                                                        // **
                                                                        // ***
                                                                        // ****
                                                                        // *****
                                                                        // ******
        int n = input.nextInt();  // you can enter a singel digit or double digit what ever you want
        System.out.println("the show begins");
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
           System.out.println("* "); 
        }
        System.out.println("Thank you for participate");
    }
}
