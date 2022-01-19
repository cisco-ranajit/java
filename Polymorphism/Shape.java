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
class Cylinder extends Shape{
    
}
    class DemoShape{
        public static void main(String[] args) {
            Shape ob;
            ob = new Square();
            ob.input();
            ob.area();
            ob.show();
            ob = new Circle();
            ob.input();
            ob.area();
            ob.show();
    }
}
