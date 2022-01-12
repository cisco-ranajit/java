import java.util.*;
class IfElse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else{
            if(a > b){
                System.out.println("a is grater then b");
            }else{
                System.out.println("a is not grater then b");
            }
        }
        input.close();

    }
}