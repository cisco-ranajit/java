import java.util.ArrayList;
import java.util.Scanner;
public class OddNumbers {
    int a;
    ArrayList<Integer> Odd_Numbers = new ArrayList<>();
    public void OdNum(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        for(int i = 0; i < a ; i++){
            Odd_Numbers.add(input.nextInt());
        }
        if(ListOdd(Odd_Numbers)){
            System.out.println("list contains odd numbers");
        }else {
            System.out.println("list doesn't contains odd numbers");
        }
    }
    boolean ListOdd(ArrayList<Integer> Odd_numbers){
        for(int i = 0; i < a; i++ ){
            if(i % 2 == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        OddNumbers ob = new OddNumbers();
        ob.OdNum();
    }
}
