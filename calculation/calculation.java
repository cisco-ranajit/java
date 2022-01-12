import java.util.*;
public class calculation{

	int a , b, c;

	void input(){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a first number");
		a = input.nextInt();
		System.out.println("enter a second number");
		b = input.nextInt();
        System.out.println("here it is your arithimatic oparation");
		input.close();
	}
	void addition(){
		c = a + b ;
		System.out.println(a +" + "+ b +" = "+c);
	}
	void multiplication(){
		c = a * b ;
		System.out.println(a +" * "+ b +" = "+c);
	}
	void divide(){
		c = a / b ;
		System.out.println(a +" / "+ b +" = "+c);
	}
	void substraction(){
		c = a - b;
		System.out.println(a +" - "+ b +" = "+c);
	}
	void reminder(){
		c = a % b;
		System.out.println(a +" % "+ b +" = "+c);
	}
	public static void main(String [] args){
		
		calculation ob1 = new calculation();
		ob1.input();
		ob1.addition();
		ob1.multiplication();
		ob1.divide();
		ob1.substraction();
		ob1.reminder();
	}
	
}
