import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class ArrayOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int age[] = new int[size];


        for(int i = 0; i < age.length; i++){
            age[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
            System.out.println(age[i]);
        }
        //get the first and last element of an array
        System.out.println("first element of array "+age[0]);
        System.out.println("last element of array "+age[age.length -1]);
        //get a random value from an array
        int anyValue = age[new Random(). nextInt(size)];
        System.out.println(anyValue);
    }
}
