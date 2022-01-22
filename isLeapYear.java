import javax.management.MBeanAttributeInfo;
import java.util.Scanner;
public class isLeapYear {
    int year;
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a year");
        year = input.nextInt();
    }
    void show(){
        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("it is a leap year");
        }else{
            System.out.println("it is not a leap year");
        }
    }

    public static void main(String[] args) {
        isLeapYear ob;
        ob = new isLeapYear();
        ob.input();
        ob.show();
    }
}

