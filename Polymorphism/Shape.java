/* shape of area calculation using polymorphism */
import java.util.*;
import java.lang.Math.*;
class Shape{
    int value_1, value_2, value_3, result;
    Scanner input = new Scanner(System.in);
    void input(){
    }
    
    void area(){

    }

    void show(){

    }
}
class Square extends Shape{
        void input(){
            System.out.println("enter the values for area of square");
            
            value_1 = input.nextInt();
        }
        void area(){
            result = value_1 * value_1;
        }
        void show(){
            System.out.println("the area of square is "+ result);
        }
}
class Rectangle extends Shape{
        void input(){
            System.out.println("enter the values for area of Rectangle");
            
            value_1 = input.nextInt();
            value_2 = input.nextInt();
        }
        void area(){
            result = value_1 * value_2;
        }
        void show(){
            System.out.println("the area of the rectangle is "+ result);
        }
}
class Triangle extends Shape{
        void input(){
           
            value_1 = input.nextInt();
            value_2 = input.nextInt();
        }
        void area(){
            result = (value_1 * value_2) / 2;
        }
        void show(){
            System.out.println("the area of triangle is "+ result);
        }
}
class Circle extends Shape{
    double NewValue;
    void input(){
        System.out.println("enter the value for area of circle");
        value_1 = input.nextInt();
    }
    void area(){
        result = (int) (Math.PI * value_1 * value_1); // convert double into integer value
        NewValue = result; // conver integer value into double value 
    }
    void show(){
        System.out.println("the area of Circle is "+NewValue);
    }
}
    class DemoShape{
        public static void main(String[] args) {
            Shape ob;
            
            Scanner input = new Scanner(System.in);
            System.out.println("choose 1 to 4");
            System.out.println("1. calculate area of Square ");
            System.out.println("2. calculate area of rectangle");
            System.out.println("3. calculate area of triangle");
            System.out.println("4. calculate area of circule");
            int numbers = input.nextInt();
           switch (numbers) {
               case 1:
               ob = new Square();
               ob.input();
               ob.area();
               ob.show();
                   break;
                   case 2:
                   ob = new Rectangle();
                   ob.input();
                   ob.area();
                   ob.show();
                   break;
                   case 3:
                   ob = new Triangle();
                   ob.input();
                   ob.area();
                   ob.show();
                   break;
                   case 4:
                   ob = new Circle();
                   ob.input();
                   ob.area();
                   ob.show();
                   break;
               default:
               System.out.println("you have entered wrong number, choose 1 to 4");
                   break;
           }
    }
}
