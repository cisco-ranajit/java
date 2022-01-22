import java.util.*;
public class GetPrimeNumber {
    int number;
    void input(){
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }
    void show(){
        for( int i = 1 ; i <= number ; i++){
            int count = 0;
            for (int n = 2; n * n <= i; n++){
                if(i % n == 0){
                    count ++;
                    break;
                }
            }
            if(count == 0)
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        GetPrimeNumber ob ;
        ob = new GetPrimeNumber();
        ob.input();
        ob.show();
    }
}
